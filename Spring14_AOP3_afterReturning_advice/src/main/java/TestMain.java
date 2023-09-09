import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		UserService service = ctx.getBean("target", UserService.class);
		System.out.println(service.sayEcho());

		
		System.out.println();
		System.out.println(service.callEcho());

		/*
		sayEcho
		AfterReturning.method2 >> hello
		hello

		callEcho
		호출한 핵심기능 메서드명:callEcho
		AfterAspect.method3 >> world
		world
		*/
		
	}

}
