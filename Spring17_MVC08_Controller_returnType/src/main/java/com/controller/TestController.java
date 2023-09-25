package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {

	//// Controller 클래스 메서드의 리턴타입
	
	// 1. 리턴타입: String
	// view정보 O, model정보 X
	
	@RequestMapping("/aaa")
	public String fun() {
		System.out.println("aaa 요청");
		return "hello";
	}
	
	
	// 2. 리턴타입: String
	//    파라미터: Model, Map, @ModelAttribute("key")LoginDTO, ...
	// view정보 O, model정보 O
	
	@RequestMapping("/bbb")
	public String fun2(Model m) {
		System.out.println("bbb 요청");
		m.addAttribute("userid", "홍길동");
		return "hello2";
	}
	
	
	// 3. 리턴타입: ModelAndView
	// view정보 O, model정보 O
	
	@RequestMapping("/ccc")
	public ModelAndView fun3() {
		System.out.println("ccc 요청");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello2");  //뷰 정보
		mav.addObject("userid", "홍길동"); //모델 정보
		return mav;
	}
	
	/*
	 * 뷰 정보 없으면  ==> 스프링이 요청맵핑값으로 view를 찾음 : a.jsp ==> 없으면 404
	 * 키 값을 지정하지 않으면(@ModelAttribute("key")) ==> 클래스명이 key(첫 글자 소문자)
	 */
	
	// 4. 리턴타입: LoginDTO
	// view정보 X - 스프링이 요청맵핑값으로 view를 찾음 : ddd.jsp
	// model정보 O - LoginDTO

	@RequestMapping("/ddd")
//	public LoginDTO fun4() {  // @ModelAttribute("key") 지정하지 않으면 클래스명이 key(첫 글자 소문자) : ${loginDTO}
	public @ModelAttribute("xyz") LoginDTO fun4() {
		System.out.println("ddd 요청");
		LoginDTO dto = new LoginDTO("hong", "1234");
		return dto;
	}
	
	
	// 5. 리턴타입: ArrayList
	// view정보 X - 스프링이 요청맵핑값으로 view를 찾음 : eee.jsp
	// model정보 O - ArrayList

	@RequestMapping("/eee")
	public @ModelAttribute("kkk") ArrayList<LoginDTO> fun5() {
		System.out.println("eee 요청");
		ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
		list.add(new LoginDTO("hong1", "1234"));
		list.add(new LoginDTO("hong2", "1234"));
		return list;
	}
	
	
	// 6. 리턴타입: void
	// view정보 X, model정보 X
	
	@RequestMapping("/fff")
	public void fun6() {
		System.out.println("fff 요청");
	}
}
