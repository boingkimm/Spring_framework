package com.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserService2 implements InitializingBean, DisposableBean{

	//1.6.1 Combining Lifecycle Mechanisms

	
	public UserService2() {
		System.out.println("UserService2 생성자");
	}

	
	//unimplemented 재정의 자동
	
	//DisposableBean
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean.destroy()");
	}

	//InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet()");
	}

	//==> 생성자 호출 후 afterPropertiesSet 호출 됨. ctx.close될 때 destroy 호출됨
}
