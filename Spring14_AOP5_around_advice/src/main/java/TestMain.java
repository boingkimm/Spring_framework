import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		UserService service = ctx.getBean("target", UserService.class);
		try {
			System.out.println(service.sayEcho());
		} catch (Exception e) {
		}
		
		System.out.println();
		System.out.println(service.callEcho());

		/* 
		 * Around.method2 >> 
		 * before advice 역할
		 * sayEcho
		 * after advice 역할
		 * afterReturning advice 역할 >> hello
		 * hello
		 * 
		 * callEcho
		 * world
		*/
		
		
		/*에러발생!
		 * proceed에 의해 sayEcho 호출 후 실행하다가 에러발생시
		 * throws로 메인에 던짐 -> 예외처리 -> after 출력안됨
		 * 
		 * Around.method2 >> 
		 * before advice 역할
		 * sayEcho
		 * 
		 * callEcho
		 * world
		 */
	}

}
