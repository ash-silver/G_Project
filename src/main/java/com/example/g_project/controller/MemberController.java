package com.example.g_project.controller;

import com.example.g_project.dto.MemberRequest;
import com.example.g_project.dto.MemberResponse;
import com.example.g_project.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    private static Long member_CD;
    @GetMapping("/join")
    public String loadMemberForm(){
        return "join";
    }
    @PostMapping("/join")
    public String createMember(MemberRequest request){
        memberService.createMember(request);
        return "index";
    }
    @PostMapping("/login")
    public String hasMember(MemberRequest request, HttpSession session){
        MemberResponse findMember = memberService.hasMember(request);
        if(findMember != null){
            session.setAttribute("member_email", findMember.getMember_email());
            session.setAttribute("member_CD", findMember.getMember_CD());
            session.setAttribute("member_nickname", findMember.getMember_nickname());
            session.setAttribute("member_password", findMember.getMember_password());
            session.setAttribute("member_phone", findMember.getMemeber_phone());
            member_CD=findMember.getMember_CD();
            return "redirect:/home";
        }
        else{
            return "loginFail";
        }
    }
    @PostMapping("/findId")
    public String findId(MemberRequest request, Model model){

        MemberResponse findMember = memberService.findId(request);
        model.addAttribute("email", findMember.getMember_email());
        return "resultId";
    }
//    @GetMapping("")

}
