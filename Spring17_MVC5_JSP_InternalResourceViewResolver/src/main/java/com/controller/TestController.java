package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	// View 처리

	//servlet-context.xml에 InternalResourceViewResolver 추가 : 경로+확장자
	//=> return "파일명만";
	
	//http://localhost:8099/app/xxx
	@RequestMapping("/xxx")
	public String home() {
		System.out.println("TestController.home 메서드");
		return "hello";
	}
	
	//http://localhost:8099/app/yyy
	@RequestMapping(value="/yyy")
	public String main() {
		System.out.println("TestController.main 메서드");
		return "hello";
	}
	
}
