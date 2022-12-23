package com.Exhibition.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MemberForm {

	
	@NotEmpty(message = "아이디(은)는 필수입력사항입니다")
	@Size(min = 4, message = "아이디는 4자 이상입니다")
	private String username;
	
	@NotEmpty(message = "비밀번호는 필수입력사항입니다")
	@Size(min = 4, message = "비밀번호는 4자 이상 사용해야합니다")
	private String password;
	
	@NotEmpty(message = "이메일을 적어주십시오")
	private String email;
	
	
}
