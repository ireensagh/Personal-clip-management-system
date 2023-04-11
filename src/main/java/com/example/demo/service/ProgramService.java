package com.example.demo.service;

import com.example.demo.repository.ProgramRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.client.OmnyStudioClient;
import com.example.demo.entity.Program;
import com.example.demo.repository.ProgramRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramService {

    @Autowired
    private ProgramRepository programRepository;
    @Autowired
    private OmnyStudioClient omnyStudioClient;

    public List<Program> getAllPrograms() {
        // Fetch programs from the Omny Studio API
        List<Program> programs = omnyStudioClient.getPrograms();

        // Save programs to the H2 datastore
        programRepository.saveAll(programs);

        return programs;
    }
//    public List<Program> getAllPrograms() {
//        return programRepository.findAll();
//    }

    public Program getProgramById(Long id) {
        Optional<Program> optionalProgram = programRepository.findById(id);
        return optionalProgram.orElse(null);
    }

    public Program saveProgram(Program program) {
        return programRepository.save(program);
    }

    public void deleteProgramById(Long id) {
        programRepository.deleteById(id);
    }
}

