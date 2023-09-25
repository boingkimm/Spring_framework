package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {

	//// redirect 요청 시에도 값 가져오기 : flash scope
	
	/*
	 * flash scope : redirect사용 시 target에서 값을 딱 한 번 사용 가능한 범위
	 * request<flash<session<application
	 * 
	 * flash scope 활성화 필요 : servlet-context.xml
	 */

	
	//기존 redirect 요청 (request scope)
	@RequestMapping("/aaa")
	public String aaa(Model m) {
		System.out.println("aaa 호출");
		m.addAttribute("userid", "홍길동");  //X - request scope 유효하지 않으므로 출력X
		return "redirect:xxx";  //새로운 요청. url 변경 됨.
	}
	
	//flash scope redirect 요청
	@RequestMapping("/bbb")
	public String bbb(RedirectAttributes m) {
		System.out.println("bbb 호출");
		m.addFlashAttribute("userid", "홍길동");  //O - RedirectAttributes 값을 target이 한 번 사용 가능
		return "redirect:xxx";  //새로운 요청. url 변경 됨.
	}
	
	@RequestMapping("/xxx")
	public String main() {
		System.out.println("main 호출");
		return "main";
	}
	

}
