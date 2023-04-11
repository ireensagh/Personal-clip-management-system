package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.OmnyStudioService;
import com.example.demo.entity.Clip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;



public class ClipController {
    @Autowired
    private OmnyStudioService omnyStudioService;

    @GetMapping("/programs/{programId}/clips")
    public ResponseEntity<List<Clip>> getRecentClips(@PathVariable String programId) {
        List<Clip> clips = omnyStudioService.getRecentClips(programId);
        return ResponseEntity.ok(clips);
    }

}
