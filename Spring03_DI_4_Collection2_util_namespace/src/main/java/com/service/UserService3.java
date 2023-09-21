package com.service;

import java.util.Map;

import com.dto.Cat;

public class UserService3 {

	//Map
	Map<String, Cat> catMap;

	public Map<String, Cat> getCatMap() {
		return catMap;
	}

	//setter메서드 주입
	public void setCatMap(Map<String, Cat> catMap) {
		this.catMap = catMap;
	}

}
