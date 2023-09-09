package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//target(UserService)의 sayEcho메서드 호출 시 위빙되는 aspect 객체
@Aspect
public class AfterThrowingAspect {

	@Pointcut("execution(public String sayEcho())")
	public void xxx() {
		
	}
	
	//@AfterThrowing : 예외 발생 시 실행. ( sayEcho() 호출해서 예외가 발생했을 때 위빙됨 )
	
	@AfterThrowing(pointcut = "xxx()", throwing = "e")	  //throwing속성: sayEcho()메서드에서 예외 발생 시 예외를 저장할 변수 (=catch의 Exception e)
	public void method2(Exception e) {					  //Exception
		System.out.println("AfterThrowing.method2 >> " + e.getMessage());
	}


//
//	//advice + pointcut
//	@AfterThrowing(pointcut = "execution(* callEcho(..))", throwing = "yyy")
//	public void method3(JoinPoint point, Object yyy) {
//		System.out.println("호출한 핵심기능 메서드명:" + point.getSignature().getName());
//		System.out.println("AfterThrowing.method3 >> " + yyy);
//	}

	
}


