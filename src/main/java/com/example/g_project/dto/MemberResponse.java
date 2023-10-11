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

}
