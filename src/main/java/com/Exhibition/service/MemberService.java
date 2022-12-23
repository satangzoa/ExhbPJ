package com.Exhibition.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Exhibition.entity.SiteMember;
import com.Exhibition.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;
	private final PasswordEncoder passwordEncoder;
	
public SiteMember memberCreate(String username, String password, String email) {
		
		SiteMember member = new SiteMember();
		member.setUsername(username);
		member.setPassword(passwordEncoder.encode(password));
		
		member.setEmail(email);
		
		memberRepository.save(member);
		
		return member;
	}
	
}
