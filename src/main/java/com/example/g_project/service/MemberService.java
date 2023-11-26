package com.example.g_project.service;

import com.example.g_project.dto.MemberRequest;
import com.example.g_project.dto.MemberResponse;
import com.example.g_project.entity.Member;
import com.example.g_project.entity.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public String createMember(MemberRequest request){
        return memberRepository.save(request.memberEntity()).getMemberEmail();
//        return memberRepository.save(request.memberEntity());
    }

    public MemberResponse hasMember(MemberRequest request){
        return memberRepository.findByMemberEmail(request.getMember_email())
                .filter(member -> member.getMemberPassword().equals(request.getMember_password()))
                .map(member -> new MemberResponse(member)).orElse(null);
    }

    public MemberResponse findId(MemberRequest request){
        return memberRepository.findByMemberPhone(request.getMember_phone())
                .filter(member -> member.getMemberNickname().equals(request.getMember_nickname()))
                .map(member -> new MemberResponse(member)).orElse(null);
    }

}
