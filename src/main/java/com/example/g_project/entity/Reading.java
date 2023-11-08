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
    @Column(name = "readingCD")
    private int readingCD;
    @Column(name = "memberCD")
    private int memberCD;

    @Column(name = "bookCD")
    private int bookCD;

    @Column(name = "readingAuthor")
    private String readingAuthor;
    @Column(name = "readingPublisher")
    private String readingPublisher;
    @Column(name = "readingStart")
    private String readingStart;
    @Column(name = "readingEnd")
    private String readingEnd;
    @Column(name = "readingTitle")
    private String readingTitle;
    @Column(name = "readingContent")
    private String readingContent;
    @Column(name = "readingImpressive")
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
