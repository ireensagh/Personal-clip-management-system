package com.example.demo.entity;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Clip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String imageUrl;

    private Integer duration;

    private LocalDate publishedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Program program;

    // getters and setters

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Integer getDuration() {
        return duration;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public Program getProgram() {
        return program;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
}

