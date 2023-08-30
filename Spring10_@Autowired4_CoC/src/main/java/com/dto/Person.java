package com.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

	//setter로 주입받기
	String username;
	
	@Autowired //로 주입받기
	Cat cat;

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", cat=" + cat + "]";
	}
	
	
}
