package com.example.g_project.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="tb_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="member_CD")
    private Long member_CD;

    @Column(name="member_email", nullable = false)
    private String member_email;
    @Column(name="member_password", nullable = false)
    private String member_password;
    @Column(name="member_nickname", nullable = false)
    private String member_nickname;
    @Column(name="member_gender", nullable = false)
    private String member_gender;

    @CreationTimestamp
    @Column(name="member_register", nullable = false)
    private LocalDateTime member_register = LocalDateTime.now();
    @Builder
    public Member(Long member_CD
            , String member_email
            , String member_password
            , String member_nickname
            , String member_gender
            , LocalDateTime member_register){
        this.member_CD=member_CD;
        this.member_email=member_email;
        this.member_password=member_password;
        this.member_nickname=member_nickname;
        this.member_gender=member_gender;
        this.member_register=member_register;
    }

}
