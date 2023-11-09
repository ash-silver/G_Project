package com.example.g_project.dto;

import com.example.g_project.entity.Reading;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ReadingRequest {
    private int memberCD;
    private int bookCD;
    private String readingAuthor;
    private String readingPublisher;
    private String readingStart;
    private String readingEnd;
    private String readingTitle;
    private String readingContent;
    private String readingImpressive;

    public Reading readingEntity(){
        System.out.println("request" + getReadingAuthor());
        return Reading.builder()
                .memberCD(memberCD)
                .bookCD(bookCD)
                .readingAuthor(readingAuthor)
                .readingPublisher(readingPublisher)
                .readingStart(readingStart)
                .readingEnd(readingEnd)
                .readingTitle(readingTitle)
                .readingContent(readingContent)
                .readingImpressive(readingImpressive)
                .build();
    }
}
