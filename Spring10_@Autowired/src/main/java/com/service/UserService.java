package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.UserDAO;

public class UserService {

	//@Autowired : 변수(권장)/생성자/메서드에 사용 가능

	@Autowired //변수
	UserDAO dao;

	/*
	 * 
	public UserService() {
	}

	//생성자
	public UserService(UserDAO dao) {
		System.out.println("UserService(UserDAO dao)");
		this.dao = dao;
	}
	
	//메서드
	public void setDao(UserDAO dao) {
		System.out.println("setDao(UserDAO dao)");
		this.dao = dao;
	}
	
	==> 변수에 @Autowired 지정하면 생성자,메서드 필요없어짐
	 * 
	*/
	
	public List<String> list(){
		return dao.list();
	}
}
