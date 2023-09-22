package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserService3{

	//1.9.9. Using @PostConstruct and @PreDestroy

	
	public UserService3() {
		System.out.println("UserService3 생성자");
	}

	
	@PostConstruct
	public void xxx() {
		System.out.println("@PostConstruct.xxx()");
	}
	
	@PreDestroy
	public void yyy() {
		System.out.println("@PreDestroy.yyy()");
	}


	//==> 생성자만 호출됨
	//==> context namespace 활성화 필수 (xml)
	//==> 생성자 호출 후 @PostConstruct.xxx() 호출 됨. ctx.close될 때 @PreDestroy.yyy() 호출됨
}
