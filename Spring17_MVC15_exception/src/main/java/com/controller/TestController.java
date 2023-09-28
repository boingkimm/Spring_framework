package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//예외처리
	
	//http://localhost:8099/app/xxx
	@RequestMapping({"/xxx","/xxx2"})
	public String home() {
		System.out.println("TestController.home 메서드");
		//명시적으로 예외 발생
		if (true) throw new ArithmeticException("error 발생");
		return "hello";
	}
	
	//http://localhost:8099/app/yyy
	@RequestMapping(value="/yyy")
	public String main() {
		System.out.println("TestController.main 메서드");
		//명시적으로 예외 발생
		if (true) throw new NullPointerException("error 발생");
		return "hello";
	}
	
	@ExceptionHandler({ArithmeticException.class, NullPointerException.class})
	public String errorPage() {
		return "error";
	}
}
