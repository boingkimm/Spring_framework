import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		//1. singleton scope
		
		UserService s1 = ctx.getBean("service", UserService.class);
		UserService s2 = ctx.getBean("service", UserService.class);
		System.out.println("singleton:" + (s1==s2));
		//singleton:true => singleton scope는 빈을 한번만 생성하고 재사용하므로 주소값이 같음 (생성자 한번 생성)
		
		s1.username="홍길동";
		s2.username="이순신";
		System.out.println(s1.username +"\t"+ s2.username);
		//이순신	이순신  => 하나의 인스턴스로 여러 사용자가 사용하므로 공유됨
		
		
		//2. prototype scope
		
		UserService s3 = ctx.getBean("service2", UserService.class);
		UserService s4 = ctx.getBean("service2", UserService.class);
		System.out.println("prototype:" + (s3==s4));
		//prototype:false => prototype scope는 빈을 매번 생성 (생성자 매번 생성)
		
		s3.username="유관순";
		s4.username="강감찬";
		System.out.println(s3.username +"\t"+ s4.username);
		//유관순	강감찬  => 매번 생성되므로 자신만의 데이터 유지가 가능
		
	}

}
