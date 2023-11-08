package com.example.g_project.service;

import com.example.g_project.dto.ReadingRequest;
import com.example.g_project.entity.Reading;
import com.example.g_project.entity.ReadingRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReadingService {
    private final ReadingRepository readingRepository;

    @Transactional
    public void createReading(ReadingRequest request){
        System.out.println(request.getReadingAuthor());
        readingRepository.save(request.readingEntity());
    }
}
