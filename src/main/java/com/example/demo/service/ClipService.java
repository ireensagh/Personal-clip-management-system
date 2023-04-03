package com.example.demo.service;

@Service
public class ClipService {

    @Autowired
    private ClipRepository clipRepository;
    @Autowired
    private OmnyStudioClient omnyStudioClient;

    public List<Clip> getClipsByProgramId(String programId) {
        // Fetch clips from the Omny Studio API
        List<Clip> clips = omnyStudioClient.getClips(programId);

        // Save clips to the H2 datastore
        clipRepository.saveAll(clips);

        return clips;
    }

    public List<Clip> getAllClips() {
        return clipRepository.findAll();
    }

//    public Clip getClipById(Long id) {
//        Optional<Clip> optionalClip = clipRepository.findById(id);
//        return optionalClip.orElse(null);
//    }

    public List<Clip> getRecentClipsByProgramId(Long programId, int limit) {
        return clipRepository.findTopByProgramIdOrderByPublishedAtDesc(programId, PageRequest.of(0, limit));
    }

    public Clip saveClip(Clip clip) {
        return clipRepository.save(clip);
    }

    public void deleteClipById(Long id) {
        clipRepository.deleteById(id);
    }
}

