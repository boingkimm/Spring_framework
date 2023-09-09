package com.service;

//target객체 (핵심기능 구현 빈)
public class UserService {

	//핵심처리 메서드
	public String sayEcho() {
		System.out.println("sayEcho");
		int n = 0;
		System.out.println(10/n);  //예외발생
		return "hello";
	}
	
	//임의의 메서드
	public String callEcho() {
		System.out.println("callEcho");
		return "world";
	}
}
