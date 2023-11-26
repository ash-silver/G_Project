package com.example.g_project.dto;

import com.example.g_project.entity.Member;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MemberResponse {
    private String member_email;
    private String member_password;
    private String memeber_phone;
    private String member_nickname;
    private String member_gender;
    private Long member_CD;

    public MemberResponse(Member entity){
        this.member_CD= entity.getMemberCD();
        this.member_email=entity.getMemberEmail();
        this.member_password=entity.getMemberPassword();
        this.memeber_phone=entity.getMemberPhone();
        this.member_nickname=entity.getMemberNickname();
        this.member_gender=entity.getMemberGender();
    }

}
