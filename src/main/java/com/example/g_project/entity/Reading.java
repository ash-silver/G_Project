package com.example.g_project.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_reading")
public class Reading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reading_CD")
    private int readingCD;
    @Column(name = "member_CD")
    private int memberCD;

    @Column(name = "book_CD")
    private int bookCD;

    @Column(name = "reading_author")
    private String readingAuthor;
    @Column(name = "reading_publisher")
    private String readingPublisher;
    @Column(name = "reading_start")
    private String readingStart;
    @Column(name = "reading_end")
    private String readingEnd;
    @Column(name = "reading_title")
    private String readingTitle;
    @Column(name = "reading_content")
    private String readingContent;
    @Column(name = "reading_impressive")
    private String readingImpressive;

    @CreationTimestamp
    @Column(name = "reading_DT", nullable = false)
    private LocalDateTime readingRegister = LocalDateTime.now();

    @Builder
    public Reading(int readingCD
            , int memberCD
            , int bookCD
            , String readingAuthor
            , String readingPublisher
            , String readingStart
            , String readingEnd
            , String readingTitle
            , String readingContent
            , String readingImpressive
            , LocalDateTime readingRegister) {
        this.readingCD = readingCD;
        this.memberCD = memberCD;
        this.bookCD = bookCD;
        this.readingAuthor = readingAuthor;
        this.readingPublisher = readingPublisher;
        this.readingStart = readingStart;
        this.readingEnd = readingEnd;
        this.readingTitle = readingTitle;
        this.readingContent = readingContent;
        this.readingImpressive = readingImpressive;
        this.readingRegister = readingRegister;
    }


}
