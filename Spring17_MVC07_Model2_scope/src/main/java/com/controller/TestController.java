package com.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;

@Controller
public class TestController implements ServletContextAware {

	//// 3가지 scope에 Model 저장하기
	
	// 1. request scope : Model객체 이용(필수 아님) => 파라미터
	// 2. session scope : HttpSession 이용 => 파라미터
	// 3. application scope : ServletContext 이용 => implement
		/*
		 * implements ServletContextAware
		 * 재정의 ServletContext 주입받기
		 */
	
	ServletContext application;
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.application = servletContext;
	}
	
	
	
	@RequestMapping("/xxx")
	public String xxx(Model m, HttpSession session) {
		//request scope에 저장
		m.addAttribute("request", "requesttt");

		//session scope에 저장
		session.setAttribute("session", "sessionnn");
		
		//application scope에 저장
		application.setAttribute("application", "applicationnn");
		return "hello";
	}


}
