package com.service;

public class UserService {

	//init, destroy
	
	
	public UserService() {
		System.out.println("UserService 생성자");
	}

	//init-method="xxx"
	//리턴타입 void, 파라미터 없음
	public void xxx() {
		System.out.println("xxx 호출");
	}
	
	//destroy-method="yyy"
	public void yyy() {
		System.out.println("yyy 호출");
	}
	
	//==> 생성자 호출 후 init 호출 됨. ctx.close될 때 destroy 호출됨
}
