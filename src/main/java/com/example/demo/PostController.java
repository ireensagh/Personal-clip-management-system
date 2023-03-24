@RestController
public class MyRestController {

    private final RestTemplate restTemplate;

    public MyRestController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/orgs/acc8cc57-ff7c-44c5-9bd6-ab0900fbdc43/repos")
    public String callExternalApi() {
        String apiUrl = "https://api.omny.fm/orgs/acc8cc57-ff7c-44c5-9bd6-ab0900fbdc43/repos";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        String responseBody = responseEntity.getBody();
        return responseBody;
    }
}


public class PostController {

    private final String API_URL = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        ResponseEntity<Post[]> response = restTemplate.getForEntity(API_URL, Post[].class);
        return Arrays.asList(response.getBody());
    }
}
