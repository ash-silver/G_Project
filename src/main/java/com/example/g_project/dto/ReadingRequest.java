package com.example.g_project.dto;

import com.example.g_project.entity.Reading;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ReadingRequest {
    private Long memberCD;
    private Long bookCD;
    private String readingContent;

    public Reading readingEntity(){
        return Reading.builder()
                .memberCD(memberCD)
                .bookCD(bookCD)
                .readingContent(readingContent)
                .build();
    }
}
