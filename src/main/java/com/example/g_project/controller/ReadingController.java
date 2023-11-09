package com.example.g_project.controller;

import com.example.g_project.dto.ReadingRequest;
import com.example.g_project.service.ReadingService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
@RequiredArgsConstructor
public class ReadingController {
    private final ReadingService readingService;


    @GetMapping("/write")
    public String readingWriteForm(){
        return "report_write";
    }
    @PostMapping("/write")
    public String bookWrite(ReadingRequest request){
        readingService.createReading(request);
        return "home";
    }

    @GetMapping("/list")
    public String findReading(Model model, @PageableDefault(page = 0, size = 9, sort = "ReadingCD", direction = Sort.Direction.DESC) Pageable pageable){
        model.addAttribute()
    }
}
