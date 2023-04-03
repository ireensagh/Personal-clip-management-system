package com.example.demo.controller;

public class ClipController {
    @Autowired
    private OmnyStudioService omnyStudioService;

    @GetMapping("/programs/{programId}/clips")
    public ResponseEntity<List<Clip>> getRecentClips(@PathVariable String programId) {
        List<Clip> clips = omnyStudioService.getRecentClips(programId);
        return ResponseEntity.ok(clips);
    }

}
