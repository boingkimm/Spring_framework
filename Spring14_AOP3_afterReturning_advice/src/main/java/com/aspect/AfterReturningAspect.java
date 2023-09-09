package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//target(UserService)의 sayEcho메서드 호출 시 위빙되는 aspect 객체
@Aspect
public class AfterReturningAspect {

	@Pointcut("execution(public String sayEcho())")
	public void xxx() {
		
	}
	
	//@AfterReturning : 정상처리시 실행. ( sayEcho() 호출해서 정상적으로 리턴값을 리턴했을 때 위빙됨 )
	
	@AfterReturning(pointcut="xxx()", returning="xxx")	  //returning속성에 sayEcho()메서드가 리턴하는 값이 저장될 변수 지정
	public void method2(Object xxx) {					  //Object 파라미터 필요 - 핵심기능메서드(sayEcho())가 리턴하는 값을 xx에 저장
		System.out.println("AfterReturning.method2 >> " + xxx);
	}



	//advice + pointcut
	@AfterReturning(pointcut = "execution(* callEcho(..))", returning = "yyy")
	public void method3(JoinPoint point, Object yyy) {
		System.out.println("호출한 핵심기능 메서드명:" + point.getSignature().getName());
		System.out.println("AfterAspect.method3 >> " + yyy);
	}

	
}


