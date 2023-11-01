package com.example.g_project.service;

import com.example.g_project.dto.MemberRequest;
import com.example.g_project.dto.MemberResponse;
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
        return memberRepository.save(request.memberEntity()).getMember_email();
    }

    public MemberResponse hasMember(MemberRequest request){
        return memberRepository.findByEmail(request.getMember_email())
                .filter(member -> member.getMember_password().equals(request.getMember_password()))
                .map(member -> new MemberResponse(member)).orElse(null);
    }

}
