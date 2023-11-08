package com.example.g_project.service;

import com.example.g_project.dto.ReadingRequest;
import com.example.g_project.entity.ReadingRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReadingService {
    private final ReadingRepository readingRepository;

    @Transactional
    public Long createReading(ReadingRequest request){
        return readingRepository.save(request.readingEntity()).getReadingCD();
    }
}
