package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	/*
	 * @RequestBody 
	 *  : JSON을 자바클래스로 변환
	 *  => Jackson Databind 의존성 설정 및 활성화 필요
	 */
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	@PostMapping("/yyy")
	public String yyy(@RequestBody LoginDTO dto) {
		System.out.println(dto);
		return "main";
	}
	//LoginDTO [userid=홍길동, passwd=1234]
	
	@PostMapping("/zzz")
	public String zzz(@RequestBody ArrayList<LoginDTO> list) {
		System.out.println(list);
		return "main";
	}
	//[LoginDTO [userid=홍길동1, passwd=1234], LoginDTO [userid=홍길동2, passwd=4567]]
}
