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
		 * 1. BeforeAspect의 xxx 전에 method2 호출되고 	//BeforeAspect.method2
		 * 2. sayEcho() 호출 됨						//sayEcho hello
		*/
		
		
		System.out.println();
		System.out.println(service.callEcho());
		
		/*@Pointcut("execution(public String *Echo())") : *모든 Echo() 호출하면 
		 * BeforeAspect.method2입니다
		 * sayEcho
		 * hello
		 * 
		 * BeforeAspect.method2
		 * callEcho
		 * world
		 */
	}

}
