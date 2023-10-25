package com.example.g_project.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
//    Optional<Member> findByEmail(String Email);

}
