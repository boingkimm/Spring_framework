package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//1. 맵핑값 하나
	//http://localhost:8099/app/xxx
	@RequestMapping(value = "/xxx")
	public String xxx() {
		System.out.println("TestController.xxx");
		return "/WEB-INF/views/main.jsp";
	}
	
	//2. 맵핑값 2개
	//http://localhost:8099/app/xxx2
	//http://localhost:8099/app/xxx3
	@RequestMapping(value = {"/xxx2","/xxx3"} )
	public String xxx2_3() {
		System.out.println("TestController.xxx2_3");
		return "/WEB-INF/views/main.jsp";
	}
		
	//3. 특정값으로 시작
	//http://localhost:8099/app/yyy
	//http://localhost:8099/app/yyyAsd
	@RequestMapping(value = "/yyy*")
	public String yyy() {
		System.out.println("TestController.yyy");
		return "/WEB-INF/views/main.jsp";
	}
		
	//4. 특정경로 하나
	//http://localhost:8099/app/zzz  (X)
	//http://localhost:8099/app/zzz/
	//http://localhost:8099/app/zzz/aaa
	//http://localhost:8099/app/zzz/aaa/bb  (X)
	@RequestMapping(value = "/zzz/*")
	public String zzz() {
		System.out.println("TestController.zzz");
		return "/WEB-INF/views/main.jsp";
	}
	
	//5. 특정경로 여러개
	//http://localhost:8099/app/kkk  (X)
	//http://localhost:8099/app/kkk/
	//http://localhost:8099/app/kkk/aaa
	//http://localhost:8099/app/kkk/aaa/ccc
	@RequestMapping(value = "/kkk/**")
	public String kkk() {
		System.out.println("TestController.kkk");
		return "/WEB-INF/views/main.jsp";
	}
	
	//6. 경로 중간에 패턴 지정
	//http://localhost:8099/app/eee/fff
	//http://localhost:8099/app/eee/임의값/fff
	@RequestMapping(value = "/eee/**/fff")
	public String eee() {
		System.out.println("TestController.eee");
		return "/WEB-INF/views/main.jsp";
	}
	
	
}
