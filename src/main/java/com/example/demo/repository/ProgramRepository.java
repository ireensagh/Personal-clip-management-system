package com.example.demo.repository;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {

    List<Program> findAll();

    Optional<Program> findById(Long id);

    List<Program> findByName(String name);

    void deleteById(Long id);
}

