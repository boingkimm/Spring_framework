package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorldController {

	//http://localhost:8099/app/yyy
	@RequestMapping(value = "/yyy")
	public String aaa() {
		System.out.println("WorldController.aaa");
		return "WEB-INF/views/aaa.jsp";   //forward
	}
}
