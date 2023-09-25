package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//// forward, redirect

	/*
	 * 1. redirect 요청
	 * return "redirect:target";
	 *   = servlet: response.sendRedirect("target");
	 * http://localhost:8099/app/aaa 요청 ==> /app/xxx로 변경,호출 ==> main 호출
	 * aaa 호출
	 * main 호출
	 * 
	 * 2. forward 요청
	 * return "forward:target";
	 *   = servlet: request.getRequestDispatcher("target").forward(request, response);
	 * http://localhost:8099/app/bbb 요청 ==> url 변경 안 됨 ==> main 호출
	 * bbb 호출
	 * main 호출
	 */
	
	//redirect 요청
	@RequestMapping("/aaa")
	public String aaa(Model m) {
		System.out.println("aaa 호출");
		m.addAttribute("userid", "홍길동");  //X - request scope 유효하지 않으므로 출력X
		return "redirect:xxx";  //새로운 요청. url 변경 됨.
	}
	
	//forward 요청
	@RequestMapping("/bbb")
	public String bbb(Model m) {
		System.out.println("bbb 호출");
		m.addAttribute("userid", "이순신");  //O - request scope 유효함
		return "forward:xxx";  //같은 요청. url 변경 안 됨.
	}
	
	@RequestMapping("/xxx")
	public String main() {
		System.out.println("main 호출");
		return "main";  //WEB-INF/views/main.jsp (servlet-context.xml)
	}
	

}
