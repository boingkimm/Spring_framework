package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	//GET/POST 요청
	
	//http://localhost:8099/app/loginForm 요청
	// => 로그인 클릭 시 http://localhost:8099/app/login 이동(post방식, main.jsp) 
	
//	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	@GetMapping("/loginForm")
	public String loginForm() {
		System.out.println("@GetMapping.loginForm");
		return "/WEB-INF/views/loginForm.jsp";
	}

//	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@PostMapping("/login")
	public String login() {
		System.out.println("@PostMapping.login");
		return "/WEB-INF/views/main.jsp";
	}
	
}
