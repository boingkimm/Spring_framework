import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		UserService service = ctx.getBean("target", UserService.class);
		System.out.println(service.sayEcho());

		/*UserService의 sayEcho() 호출 했더니
		 * 1. sayEcho() 호출 후에						//sayEcho
		 * 2. AfterAspect의 xxx 후에 method2 호출되고 		//AfterAspect.method2
		 * 3. sayEcho()의 return						//hello
		*/
		
		
		System.out.println();
		System.out.println(service.callEcho());

		/*
		 * callEcho
		 * 호출한 핵심기능 메서드명:callEcho  <== JoinPoint
		 * AfterAspect.method3
		 * world
		 */
	}

}
