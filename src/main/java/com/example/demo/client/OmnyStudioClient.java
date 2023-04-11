package com.example.demo.client;

import com.example.demo.entity.Clip;
import com.example.demo.entity.Program;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Service
public class OmnyStudioClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${omny.api.base-url}")
    private String omnyApiBaseUrl;

    @Value("${omny.api.organization-id}")
    private String organizationId;

    public List<Program> getPrograms() {
        // Consume the Omny API to retrieve programs and return them
        List<Program> programs = restTemplate.getForObject(omnyApiBaseUrl + "/organizations/" + organizationId + "/programs", ProgramList.class).getItems();
        return programs;
    }

    public List<Clip> getClips(String programId) {
        // Consume the Omny API to retrieve clips for a given program and return them
        List<Clip> clips = restTemplate.getForObject(omnyApiBaseUrl + "/programs/" + programId + "/clips", ClipList.class).getItems();
        return clips;
    }

}

