package com.example.g_project.dto;

import com.example.g_project.entity.Reading;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@ToString
@DynamicUpdate
public class ReadingResponse {
    private int readingCD;
    private int memberCD;
    private int bookCD;
    private String readingAuthor;
    private String readingPublisher;
    private String readingStart;
    private String readingEnd;
    private String readingTitle;
    private String readingContent;
    private String readingImpressive;

    public ReadingResponse(Reading entity){
        this.readingCD = entity.getReadingCD();
        this.memberCD = entity.getMemberCD();
        this.bookCD = entity.getBookCD();
        this.readingAuthor = entity.getReadingAuthor();
        this.readingPublisher = entity.getReadingPublisher();
        this.readingStart = entity.getReadingStart();
        this.readingEnd = entity.getReadingEnd();
        this.readingTitle = entity.getReadingTitle();
        this.readingContent = entity.getReadingContent();
        this.readingImpressive = entity.getReadingImpressive();
    }

    public void setReadingCD(int readingCD){
        this.readingCD = readingCD;
    }
    public void setMemberCD(int memberCD){
        this.memberCD = memberCD;
    }
    public void setBookCD(int bookCD){
        this.bookCD = bookCD;
    }
    public void setReadingAuthor(String readingAuthor){
        this.readingAuthor = readingAuthor;
    }
     public void setReadingPublisher(String readingPublisher){
        this.readingPublisher = readingPublisher;
    }
     public void setReadingStart(String readingStart){
        this.readingStart = readingStart;
    }


//    public void setEntity(Reading entity){
//
//        this.readingCD = entity.getReadingCD();
//        this.memberCD = entity.getMemberCD();
//        this.bookCD = entity.getBookCD();
//        this.readingAuthor = entity.getReadingAuthor();
//        this.readingPublisher = entity.getReadingPublisher();
//        this.readingStart = entity.getReadingStart();
//        this.readingEnd = entity.getReadingEnd();
//        this.readingTitle = entity.getReadingTitle();
//        this.readingContent = entity.getReadingContent();
//        this.readingImpressive = entity.getReadingImpressive();
//    }

}
