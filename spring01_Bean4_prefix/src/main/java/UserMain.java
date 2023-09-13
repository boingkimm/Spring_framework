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
	
		//3) prefix : classpath, file - 거의 사용하지 않음
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml",
																  "file:c:/spring_study/user2.xml");
		//원래 classpath가 생략된 형태
		//xml을 src/main/resources가 아닌 다른 경로에 저장 시에는 file로 알려줘야 함
		
	}

}
