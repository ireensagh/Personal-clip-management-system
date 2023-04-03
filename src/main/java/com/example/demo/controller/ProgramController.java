package com.example.demo.controller;

public class ProgramController {
    @Autowired
    private OmnyStudioService omnyStudioService;

    @GetMapping("/programs")
    public ResponseEntity<List<Program>> getAllPrograms() {
        List<Program> programs = omnyStudioService.getAllPrograms();
        return ResponseEntity.ok(programs);
    }

}
