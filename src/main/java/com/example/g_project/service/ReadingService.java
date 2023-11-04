package com.example.g_project.service;

import com.example.g_project.entity.ReadingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReadingService {
    private final ReadingRepository bookRepository;
}
