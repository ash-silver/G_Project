package com.example.g_project.controller;

import com.example.g_project.dto.MemberRequest;
import com.example.g_project.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    @GetMapping("/join")
    public String loadMemberForm(){
        System.out.println("ashsilver");

        return "join";
    }
    @PostMapping("/join")
    public String createMember(MemberRequest request){
        System.out.println("helloworld");
        memberService.createMember(request);
        System.out.println("ashsilver");
        return "index";
    }
}
