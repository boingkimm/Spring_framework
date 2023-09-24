package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {

	//// Model(jsp에서 보여줄 데이터) 생성

	
	//가. 이전 servlet 방법
	@RequestMapping("/xxx")
	public String home(HttpServletRequest request) {
		request.setAttribute("userid", "홍길동"); //모델 저장
		return "hello"; //뷰 지정
	}
	
	//나. Model에 저장
	@RequestMapping("/yyy")
	public String yyy(Model m) {  //Model을 내부적으로 객체 생성해서(자동으로 Model m = new Model();) xxx메서드에 주입해줌
	    m.addAttribute("userid", "홍길동"); //모델 저장
	    return "hello"; //뷰 지정
	}
	
	//다. Map에 저장
	@RequestMapping("/zzz")
	public String zzz(Map<String, String> m) {
		m.put("userid", "홍길동"); //모델 저장
		return "hello"; //뷰 지정
	}

	//라. DTO에 저장
	@RequestMapping("/aaa")
	public String aaa(@ModelAttribute("login") LoginDTO dto) { //@ModelAttribute(key)를 알려주기
		dto.setUserid("hong");  //모델 저장
		dto.setPasswd("1234");
		return "hello2"; //뷰 지정
	}
	//jsp ${login} : LoginDTO [userid=hong, passwd=1234]
	
	//마. ArrayList에 저장
	@RequestMapping("/bbb")
	public String bbb(@ModelAttribute("list") ArrayList<LoginDTO> xxx) {
		xxx.add(new LoginDTO("aa", "123"));
		xxx.add(new LoginDTO("bb", "456"));
		//주로 add 안하고 서비스에서 땡겨와서 할당
		return "hello3";
	}
	//jsp ${list} : [LoginDTO [userid=aa, passwd=123], LoginDTO [userid=bb, passwd=456]]
	
	//바. ModelAndView - 모델과 뷰 정보를 한꺼번에 설정 (거의 사용하지 않는 방법)
	@RequestMapping("/ccc")
	public ModelAndView ccc() {
	  //클래스이므로 자동 객체생성 안됨
	  ModelAndView mav = new ModelAndView();
	  mav.setViewName("hello");  //뷰 정보 - 논리적인 이름
	  mav.addObject("userid", "길동이"); //모델 정보
	  return mav;
	}

}
