package com.example.g_project.controller;

import com.example.g_project.service.ReadingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
@RequiredArgsConstructor
public class ReadingController {
    private final ReadingService readingService;


    @PostMapping("/write")
    public String bookWrite(){
        readingService.
    }
}
