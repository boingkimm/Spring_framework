package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	//GET/POST 요청
	
	//http://localhost:8099/app/loginForm
	// => 로그인 클릭 시 http://localhost:8099/app/login 이동(post방식, main.jsp) 
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("loginForm");
		return "/WEB-INF/views/loginForm.jsp";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login() {
		System.out.println("login");
		return "/WEB-INF/views/main.jsp";
	}
	
}
