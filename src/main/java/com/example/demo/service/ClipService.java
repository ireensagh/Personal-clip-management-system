package com.example.demo.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ClipRepository;
import com.example.demo.client.OmnyStudioClient;
import com.example.demo.entity.Clip;
import org.springframework.data.domain.PageRequest;


import java.util.List;


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
        return clipRepository.findTop50ByProgramIdOrderByPublishedDateDesc(programId, PageRequest.of(0, limit));
    }

    public Clip saveClip(Clip clip) {
        return clipRepository.save(clip);
    }

    public void deleteClipById(Long id) {
        clipRepository.deleteById(id);
    }
}

