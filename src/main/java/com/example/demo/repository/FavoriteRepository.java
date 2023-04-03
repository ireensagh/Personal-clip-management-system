package com.example.demo.repository;
import java.util.Optional;
import com.example.demo.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

    List<Favorite> findAll();

    Optional<Favorite> findById(Long id);

    List<Favorite> findByUserId(Long userId);

    Optional<Favorite> findByUserIdAndClipId(Long userId, Long clipId);

    void deleteById(Long id);
}

