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
@Table(name="tb_reading")
public class Reading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reading_CD")
    private Long readingCD;
    @Column(name="member_CD", nullable=false)
    private Long memberCD;

    @Column(name="book_CD")
    private Long bookCD;

    @Column(name="reading_content")
    private String readingContent;

    @CreationTimestamp
    @Column(name="reading_DT", nullable = false)
    private LocalDateTime readingRegister = LocalDateTime.now();

    @Builder
    public Reading(Long readingCD
            , Long memberCD
            , Long bookCD
            , String readingContent
            , LocalDateTime readingRegister){
        this.readingCD=readingCD;
        this.memberCD=memberCD;
        this.bookCD=bookCD;
        this.readingContent=readingContent;
        this.readingRegister=readingRegister;
    }



}
