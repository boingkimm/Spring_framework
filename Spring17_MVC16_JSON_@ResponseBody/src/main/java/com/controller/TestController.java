package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	/*
	 * @ResponseBody
	 *  : Controller의 응답처리 - jsp가 아닌 JSON 형식으로 응답받기
	 *    LoginDTO를 리턴하면 JSON으로 변경됨
	 *  => Jackson Databind 의존성 설정 및 활성화 필요
	 */
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	//=> 개발자도구 콘솔 확인
	
	//LoginDTO를 모델로 인식하고 xxx.jsp를 유추해서 찾음 => view를 찾을 수 없으므로 error
	@RequestMapping("/xxx")
	public LoginDTO xxx() {
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
	}

	
	//@ResponseBody 설정 시 : LoginDTO를 JSON으로 변경함
	@RequestMapping("/yyy")
	@ResponseBody
	public LoginDTO yyy() {
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
	}
	
	//@ResponseBody 설정 시 : ArrayList<LoginDTO>를 JSON으로 변경함
	@RequestMapping("/zzz")
	@ResponseBody
	public ArrayList<LoginDTO> zzz() {
		ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
		list.add(new LoginDTO("Aaa1", "1234"));
		list.add(new LoginDTO("Aaa2", "1234"));
		list.add(new LoginDTO("Aaa3", "1234"));
		return list;
	}
	
	
	
}
