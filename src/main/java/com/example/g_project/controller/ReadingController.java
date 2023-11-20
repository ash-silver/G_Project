package com.example.g_project.controller;

import com.example.g_project.dto.ReadingRequest;
import com.example.g_project.dto.ReadingResponse;
import com.example.g_project.entity.Reading;
import com.example.g_project.service.ReadingService;
import lombok.RequiredArgsConstructor;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/book")
@RequiredArgsConstructor
public class ReadingController {
    private final ReadingService readingService;
    private ReadingResponse reading;


    @GetMapping("/write")
    public String readingWriteForm(){
        return "report_write";
    }
    @PostMapping("/write")
    public String bookWrite(ReadingRequest request, HttpSession session){
//        String memberNickname = (String)session.getAttribute("memberNickname");
        readingService.createReading(request);
        return "home";
    }
    @GetMapping("/reading/{readingId}")
    public String readingRead(@PathVariable int readingId, Model model){
        reading = readingService.findById(readingId);
        model.addAttribute("title", reading.getReadingTitle());
        model.addAttribute("author", reading.getReadingAuthor());
        model.addAttribute("publisher", reading.getReadingPublisher());
        model.addAttribute("start", reading.getReadingStart());
        model.addAttribute("end", reading.getReadingEnd());
        model.addAttribute("content", reading.getReadingContent());
        model.addAttribute("impressive", reading.getReadingImpressive());
        return "report_view";
    }

    @GetMapping ("/update/{readingId}")
    public String bookUpdateForm(@PathVariable int readingId, Model model){
        reading = readingService.findById(readingId);
        model.addAttribute("id", reading.getReadingCD());
        model.addAttribute("title", reading.getReadingTitle());
        model.addAttribute("author", reading.getReadingAuthor());
        model.addAttribute("publisher", reading.getReadingPublisher());
        model.addAttribute("start", reading.getReadingStart());
        model.addAttribute("end", reading.getReadingEnd());
        model.addAttribute("content", reading.getReadingContent());
        model.addAttribute("impressive", reading.getReadingImpressive());

        return "report_edit";
    }
    @PutMapping("/update/{readingId}")
    public String bookUpdate(@PathVariable int readingId, ReadingRequest request){
        readingService.editReading(readingId, request);
        return "redirect:/book/reading/" + readingId;
    }

    @GetMapping("/delete/{readingId}")
    public String bookDelete(@PathVariable int readingId){
        readingService.deleteReading(readingId);
        return "redirect:/home";
    }

    @GetMapping("/recommand")
    public String bookRecommand(){
        return "book_rec";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("readingList", readingService.readingList());
        return "report_list";
    }

}
