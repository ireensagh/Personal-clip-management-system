package com.example.demo.controller;
import com.example.demo.entity.Program;
import com.example.demo.service.OmnyStudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public class ProgramController {
    @Autowired
    private OmnyStudioService omnyStudioService;

    @GetMapping("/programs")
    public ResponseEntity<List<Program>> getAllPrograms() {
        List<Program> programs = omnyStudioService.getAllPrograms();
        return ResponseEntity.ok(programs);
    }

}
