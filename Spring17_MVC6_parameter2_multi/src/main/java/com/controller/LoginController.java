package com.controller;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;
import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import com.sun.prism.impl.BaseMesh.FaceMembers;

@Controller
public class LoginController {

	//사용자 입력 데이터 얻어오기 - multi
	//로그인 처리

	//http://localhost:8099/app/loginForm
	@GetMapping("/loginForm")
	public String home() {
		System.out.println("");
		return "loginForm";  //"WEB-INF/views/loginForm.jsp"로 forward (InternalResourceViewResolver)
	}
	
	@GetMapping("/login")
	public String login(LoginDTO dto) {
		//사용자 입력 데이터 얻기 - Spring방식
		System.out.println(dto);
		return "loginForm";
	}
	//LoginDTO [userid=홍길동, passwd=1234, phone=[01012345678, 01099898989], email=[aa@gmail.com, bbb@naver.com]]
	


	
	
	@GetMapping("/login2")
	public String login2(HttpServletRequest request) {
		//사용자 입력 데이터 얻기 - Servlet방식
		String userid = request.getParameter("userid"); 
		String passwd = request.getParameter("passwd"); 
		
		String [] phone = request.getParameterValues("phone");
		String [] email = request.getParameterValues("email");
		
		System.out.println(userid + " " + passwd);
		System.out.println(Arrays.toString(phone)+" " +Arrays.toString(email));
		
		return "loginForm";
	}
	//홍길동 1234
	//[01012345678, 01078978979] [aa@gmail.com, bbb@naver.com]
	
	
}
