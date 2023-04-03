package com.example.demo.service;

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

