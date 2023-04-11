package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Program;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;



@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {

   // List<Program> findAll();

   // Optional<Program> findById(Long id);

    List<Program> findByName(String name);

    void deleteById(Long id);
}

