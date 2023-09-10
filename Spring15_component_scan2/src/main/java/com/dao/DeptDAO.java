package com.dao;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("dao")
@Repository("dao")
public class DeptDAO {

	public List<String> list(){
		return Arrays.asList("홍길동","이순신");
	}

	public DeptDAO() {
		System.out.println("DeptDAO 생성자");
	}
	
	
}
