package com.service;

import java.util.Set;

import com.dto.Cat;

public class UserService2 {

	//Set : 순서X, 중복 불가
	Set<Cat> catSet;

	public Set<Cat> getCatSet() {
		return catSet;
	}

	//setter메서드 주입
	public void setCatSet(Set<Cat> catSet) {
		this.catSet = catSet;
	}

}
