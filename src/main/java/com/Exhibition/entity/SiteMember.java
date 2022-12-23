package com.Exhibition.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class SiteMember {//오라클디비에 sitemember 테이블 자동 생성

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer mid;
	
	@Column(unique = true)
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String email;
}
