package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dto.LoginDTO;

@Controller
public class LoginController {

	////로그인 처리 - session 관리
	
	//http://localhost:8099/app/loginForm
	@GetMapping("/loginForm")
	public String home() {
		return "loginForm";
	}

	
	@GetMapping("/login")
	public String login(LoginDTO dto, HttpSession session) {
		//사용자 입력 데이터 얻기
		//저장된 데이터 이용해서 DB연동해서 검증 (가정하고 실습)
		//세션에 저장
		session.setAttribute("login", dto);
		return "login";
	}
	
	
	@GetMapping("/loginCheck/logout")
	public String logout(HttpSession session) {   
		//로그인 여부 확인 필수
//		LoginDTO dto = (LoginDTO)session.getAttribute("login");
//		if (dto==null) {
//			return "redirect:loginForm"; //로그아웃 상태 ==> 로그인폼으로 가기
//		}else {
			session.invalidate();  //로그인 상태 ==> 로그아웃 후 메인으로 가기
			return "main";
		
	}

	
	@GetMapping("/loginCheck/mypage")
	public String mypage() {
		return "main";
	}
	
	
	/*
	 * servlet-context.xml : logout, mypage에 interceptor(xxx) => 콘솔 출력 확인
	 * @GetMapping("/logout")
	 * @GetMapping("/mypage")
	 * ==> 각자 경로 지정해야 함
	 * ==> 공통 경로 (/loginCheck) 추가 : path="/loginCheck/*"
	 * 
	 *  href에도 추가해야 함 : <a href="loginCheck/logout">
	 */
	
}
