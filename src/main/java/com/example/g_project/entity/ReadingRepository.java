package com.example.g_project.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReadingRepository extends JpaRepository<Reading, Integer> {
/*
    Optional<Reading> findByReadingCD(int readingCD);
*/
}
