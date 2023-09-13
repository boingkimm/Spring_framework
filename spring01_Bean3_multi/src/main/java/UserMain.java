import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {

		//1. 이전 방식
		/*
		UserService service = new UserService();
		System.out.println(service.mesg());
		*/
		
		//2. 스프링 방식
		/*
		1) 빈을 생성 (*.java) => UserService.java, UserDAO.java
		2) 빈을 xml에 등록 => New/Spring Bean Definition file/ user.xml
		3) ApplicationContext에 xml을 알려줌
		4) ApplicationContext가 xml에 등록된 빈 정보를 보고 자동 생성~소멸 처리함
		 */
	
		//3) 여러 설정정보 (xml) 등록 가능
//		ApplicationContext ctx = new GenericXmlApplicationContext("com/config/user.xml", "com/config/user2.xml");
		ApplicationContext ctx = new GenericXmlApplicationContext("com/config/*.xml"); //동일 경로 내의 모든 파일. 가독성은 떨어짐
	}

}
