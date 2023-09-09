package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//target(UserService)의 sayEcho메서드 호출 시 위빙되는 aspect 객체
@Aspect
public class BeforeAspect {

//	@Pointcut("execution(public String *Echo())")
	@Pointcut("execution(public String sayEcho())")
	public void xxx() {
		
	}
	
	@Before("xxx()")  //sayEcho() 호출 전에 실행됨
	public void method2() {
		System.out.println("BeforeAspect.method2");
	}

	
	//advice + pointcut
//	@Before("execution(public String callEcho())")
	@Before("execution(* callEcho(..))")
	public void method3() {
		System.out.println("BeforeAspect.method3");
	}
}

