import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.UserDAO;
import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("com/config/user.xml");
		
		//Bean을 얻기: user.xml에 등록된 bean태그의 id값을 이용해서 bean을 참조
		//클래스명 변수명 = ctx.getBean("xml의 id값", 클래스명.class);
		
//		UserDAO userDAO = (UserDAO)ctx.getBean("yyy"); //형변환 필요한 방법
		UserDAO userDAO = ctx.getBean("yyy", UserDAO.class); //타입을 알려주는 방법
		UserService userService = ctx.getBean("xxx", UserService.class);
		
		System.out.println(userDAO.sayHello());
		System.out.println(userService.mesg());
		
		
		
		//이전 방식
//		UserDAO dao = new UserDAO();
//		System.out.println(dao.sayHello());
		
		//=> new 대신에 getBean
	}

}

