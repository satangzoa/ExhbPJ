package com.Exhibition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Exhibition.entity.SiteMember;

public interface MemberRepository extends JpaRepository<SiteMember, Integer>{

}
