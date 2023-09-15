package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//프로젝트 생성 시 : 메인패키지.sub.sub2 ==> sub2가 Context명이 됨
	//com.xxx.app
	
	//요청URL : http://localhost:8099/Context명/(서블릿맵핑명:/)/요청맵핑
	
	
	//http://localhost:8099/app/xxx
	@RequestMapping("/xxx")
	public String home() {
		System.out.println("TestController.home 메서드");
		return "/WEB-INF/views/hello.jsp";
	}
	
	//http://localhost:8099/app/yyy
	@RequestMapping(value="/yyy")
	public String main() {
		System.out.println("TestController.main 메서드");
		return "/WEB-INF/views/hello.jsp";
	}
	
}
