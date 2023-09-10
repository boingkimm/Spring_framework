package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//target(UserService)의 sayEcho메서드 호출 시 위빙되는 aspect 객체
@Aspect
public class AroundAspect {

	@Pointcut("execution(public String sayEcho())")
	public void xxx() {
		
	}
	
	//@Around : sayEcho() 호출 전,후/정상리턴/예외발생 모두 위빙됨 => 4가지 역할 모두 함.
	
	@Around("xxx()")
	public Object method2(ProceedingJoinPoint pjp) throws Throwable { //Throwable: afterThrowing 역할
		System.out.println("Around.method2 >> ");
		System.out.println("before advice 역할");
		Object xxx = pjp.proceed();	//pjp.proceed()메서드 : sayEcho() 호출, 리턴값을 xxx에 저장
		System.out.println("after advice 역할");
		System.out.println("afterReturning advice 역할 >> " + xxx);
		return xxx; //sayEcho() 호출한 곳으로 리턴. main에서 받음
	}


//
//	//advice + pointcut
//	@AfterThrowing(pointcut = "execution(* callEcho(..))", throwing = "yyy")
//	public void method3(JoinPoint point, Object yyy) {
//		System.out.println("호출한 핵심기능 메서드명:" + point.getSignature().getName());
//		System.out.println("AfterThrowing.method3 >> " + yyy);
//	}

	
}


