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
    private Long memberCD;

    @Column(name="member_email", nullable = false)
    private String memberEmail;
    @Column(name="member_password", nullable = false)
    private String memberPassword;
    @Column(name="member_nickname", nullable = false)
    private String memberNickname;
    @Column(name="member_gender", nullable = false)
    private String memberGender;

    @CreationTimestamp
    @Column(name="member_register", nullable = false)
    private LocalDateTime memberRegister = LocalDateTime.now();
    @Builder
    public Member(Long member_CD
            , String member_email
            , String member_password
            , String member_nickname
            , String member_gender
            , LocalDateTime member_register){
        this.memberCD=member_CD;
        this.memberEmail=member_email;
        this.memberPassword=member_password;
        this.memberNickname=member_nickname;
        this.memberGender=member_gender;
        this.memberRegister=member_register;
    }

}
