package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	//http://localhost:8099/app/xxx
	@RequestMapping("/xxx")
	public String aaa() {
		System.out.println("HelloController.aaa");
		return "WEB-INF/views/aaa.jsp";   //forward
	}
}
