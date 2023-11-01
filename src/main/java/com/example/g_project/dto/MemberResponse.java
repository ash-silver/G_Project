package com.example.g_project.dto;

import com.example.g_project.entity.Member;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MemberResponse {
    private String member_email;
    private String member_password;
    private String member_nickname;
    private String member_gender;
    private Long member_CD;

    public MemberResponse(Member entity){
        this.member_CD= entity.getMember_CD();
        this.member_email=entity.getMember_email();
        this.member_password=entity.getMember_password();
        this.member_nickname=entity.getMember_nickname();
        this.member_gender=entity.getMember_gender();
    }

}
