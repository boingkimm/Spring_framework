package com.controller;

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

	//사용자 입력 데이터 얻어오기 : 다양한 형태로 파라미터 가져올 수 있음
	//로그인 처리

	//http://localhost:8099/app/loginForm
	@GetMapping("/loginForm")
	public String home() {
		System.out.println("");
		return "loginForm";  //"WEB-INF/views/loginForm.jsp"로 forward (InternalResourceViewResolver)
	}

	
/*

	//같은 요청맵핑값("/login") 가능!
	//같은 URL이라고 하더라도 요청 메소드에 따라서 다른 메서드에 맵핑이 가능

	
	@GetMapping("/login")
	public String login(HttpServletRequest request) {   //실습용. spring에서 HttpServletRequest 사용하지 않음??
		//사용자 입력 데이터 얻기
		String userid = request.getParameter("userid"); 
		String passwd = request.getParameter("passwd"); 
		System.out.println(userid + " " + passwd);
		return "loginForm";
	}
	//로그인 하면 => http://localhost:8099/app/login?userid=홍길동&passwd=1234
	
	
	@PostMapping("/login")
	public String login2(HttpServletRequest request) {   //실습용. spring에서 HttpServletRequest 사용하지 않음
		//사용자 입력 데이터 얻기
		String userid = request.getParameter("userid"); 
		String passwd = request.getParameter("passwd"); 
		System.out.println(userid + " " + passwd);
		return "loginForm";
	}
	//로그인 하면 => http://localhost:8099/app/login
	//POST방식 - 한글 처리 필요 : web.xml에 Filter API 등록
	
*/	
	
	
	@GetMapping("/login1")
	public String login1(@RequestParam("userid") String id,
						@RequestParam("passwd") String pw) {
		//사용자 입력 데이터 얻기
		System.out.println(id + " " + pw);
		return "loginForm";
	}

	
	//@RequestParam : 반드시 요청 파라미터가 존재해야 함(필수사항)
	//===> 옵션으로 변경 가능 required=false : 에러X, null
	// null값 대신 기본값 설정 : defaultValue = "기본값"
	@GetMapping("/login2")
	public String login2(@RequestParam("userid") String id,
						 @RequestParam(value = "passwd2", required = false, defaultValue = "0000") String pw) {
		//사용자 입력 데이터 얻기
		System.out.println(id + " " + pw);
		return "loginForm";
	}
	
	
	//요청 파라미터명과 저장할 변수명이 일치하면 요청 파라미터명을 생략 가능 (userid)
	@GetMapping("/login3")
	public String login3(@RequestParam String userid,
						 @RequestParam("passwd") String pw) {
		//사용자 입력 데이터 얻기
		System.out.println(userid + " " + pw);
		return "loginForm";
	}
	//홍길동 1234
	
	//DTO에 저장 - tag의 name값과 LoginDTO의 변수명을 일치시키기
	@GetMapping("/login4")
	public String login4(LoginDTO dto) {
		//사용자 입력 데이터 얻기
		System.out.println(dto);
		return "loginForm";
	}
	//LoginDTO [userid=홍길동, passwd=1234]

	
	//map에 키밸류로 저장
	@GetMapping("/login5")
	public String login5(@RequestParam Map<String, String> m) {
		//사용자 입력 데이터 얻기
		System.out.println(m);
		return "loginForm";
	}
	//{userid=홍길동, passwd=1234}
	
	
	//최종
	@GetMapping("/login")
	public String login(LoginDTO dto) {
		return "loginForm";
	}
}
