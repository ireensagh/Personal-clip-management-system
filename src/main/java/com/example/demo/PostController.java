import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
public class MyRestController {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;


    public MyRestController(RestTemplateBuilder restTemplateBuilder, ObjectMapper objectMapper) {
        this.restTemplate = restTemplateBuilder.build();
        this.objectMapper = objectMapper;
    }

    @GetMapping("/orgs/acc8cc57-ff7c-44c5-9bd6-ab0900fbdc43/repos")
    public ResponseEntity<?> callExternalApi() throws IOException {
        String apiUrl = "https://api.omny.fm/orgs/acc8cc57-ff7c-44c5-9bd6-ab0900fbdc43/repos";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        String responseBody = responseEntity.getBody();
        // Convert the response body from String to JSON object
        Object json = objectMapper.readValue(responseBody, Object.class);
        return ResponseEntity.ok(json);
    }
}


public class PostController {

    private static final  String API_URL = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        ResponseEntity<Post[]> response = restTemplate.getForEntity(API_URL, Post[].class);
        return Arrays.asList(response.getBody());
    }
}
