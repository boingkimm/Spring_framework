package com.service;

import java.util.List;

import com.dto.Cat;

public class UserService {

	//List : 순서O, 중복O
	List<Cat> catList;

	public List<Cat> getCatList() {
		return catList;
	}

	//setter메서드 주입
	public void setCatList(List<Cat> catList) {
		this.catList = catList;
	}

}
