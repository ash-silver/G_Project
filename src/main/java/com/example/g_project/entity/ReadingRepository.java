package com.example.g_project.entity;

import com.example.g_project.dto.ReadingResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReadingRepository extends JpaRepository<Reading, Integer> {
    Reading findById(int readingCD);

    void deleteById(Integer readingCD);

    List<Reading> findByMemberNickname(String memberNickname);

//    @Query("SELECT * FROM ")
}
