package com.example.g_project.dto;

import com.example.g_project.entity.Member;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberRequest {
    private String member_email;
    private String member_password;
    private String member_nickname;
    private String member_gender;

    public Member memberEntity(){
        return Member.builder()
                .member_email(member_email)
                .member_password(member_password)
                .member_nickname(member_nickname)
                .member_gender(member_gender)
                .build();
    }
}

