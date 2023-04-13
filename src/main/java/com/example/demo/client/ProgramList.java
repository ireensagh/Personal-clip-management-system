package com.example.demo.client;

import com.example.demo.entity.Program;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ProgramList {

    private List<Program> items;

    public List<Program> getItems() {
        return items;
    }

    public void setItems(List<Program> items) {
        this.items = items;
    }
}
