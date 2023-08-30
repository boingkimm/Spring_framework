package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.UserDAO;

public class UserService {

	//@Autowired : 변수(권장)/생성자/메서드에 사용 가능

	@Autowired(required = false)
	UserDAO dao;
	
	public List<String> list(){
		return dao.list();
	}
}
