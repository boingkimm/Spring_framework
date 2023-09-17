package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class RootController {

	//root 경로에 대한 @RequestMapping 처리
	//경로 중복 (/member/..) => 클래스레벨에 맵핑값을 추가
	
	//http://local:8099/app/board/add
	@RequestMapping(value="/add")
    public String add(){
    	System.out.println("RootController.add");
    	return "/WEB-INF/views/main.jsp";
    }

	//http://local:8099/app/board/del
    @RequestMapping(value="/del")
    public String del(){
    	System.out.println("RootController.del");
    	return "/WEB-INF/views/main.jsp";
    }
	
}
