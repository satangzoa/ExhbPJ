package com.Exhibition;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Exhibition.service.MemberService;
import com.Exhibition.dto.MemberForm;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	
	private final MemberService memberService;

	@RequestMapping("/")//메인페이지를 join_form으로 해놔서 MemberForm memberForm이 필요하다
	public String home(MemberForm memberForm) {
		return "join_form";
	}
	
	
	 
//	 @RequestMapping("join")
//	 public String join(MemberForm memberForm) {//
//		 
//	
//		 return "join_form";
//	 }
	
	 @PostMapping(value = "/joinOk")
		public String joinOk(@Valid MemberForm memberForm, BindingResult bindingResult) {
			
			if(bindingResult.hasErrors()) {
				return "join_form";
			}
			
			
			try {
				memberService.memberCreate(memberForm.getUsername(), memberForm.getPassword(), memberForm.getEmail());
			}catch(Exception e){
				e.printStackTrace();
				bindingResult.reject("joinFail", "이미 등록된 아이디입니다.");
				return "join_form";
			}
			return "redirect:login_form";
		}

	 
	 @RequestMapping("/login_form")
	 public String login_form() {
		 return "home";
	 }
}







