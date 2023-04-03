package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Clip;
import java.util.Optional;



public interface ClipRepository extends JpaRepository<Clip, Long> {

    List<Clip> findAll();

    Optional<Clip> findById(Long id);

    List<Clip> findByProgramId(Long programId);

    List<Clip> findTop50ByProgramIdOrderByPublishedDateDesc(Long programId);

    void deleteById(Long id);
}

