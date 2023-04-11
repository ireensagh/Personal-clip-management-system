package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.client.OmnyStudioClient;
import com.example.demo.entity.Clip;
import com.example.demo.entity.Program;

public class OmnyStudioService {
    @Autowired
    private OmnyStudioClient omnyStudioClient;
    public List<Program> getAllPrograms() {
        List<Program> programs = omnyStudioClient.getPrograms();
        return programs;
        //This method will call the getPrograms method from the
        // OmnyStudioClient to fetch the programs from the external API.
    }
    public List<Clip> getRecentClips(String programId) {
        List<Clip> clips = omnyStudioClient.getClips(programId);
        return clips;
    }

//This method will call the getClips method from
// the OmnyStudioClient to fetch the clips for a given program from the external API.
}
