package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	//1.11.10. Static Resources
	// jsp에서 리소스(image, js, css, ... )에 접근 불가(WEB-INF)
	// => 접근 할 수 있도록 추가 설정 : servlet-context.xml
	
	//http://localhost:8099/app/
	@GetMapping("/")
	public String home() {
		return "main";  //이미지파일에 접근 불가. 이미지 깨짐
		
	}

}
