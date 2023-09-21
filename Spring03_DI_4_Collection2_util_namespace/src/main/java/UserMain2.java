import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService;
import com.service.UserService2;

public class UserMain2 {

	public static void main(String[] args) {

		// IoC Container 생성
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("classpath:com/config/user2.xml");
		
		// 빈 얻기
		UserService2 service = ctx.getBean("service", UserService2.class);

		Set<Cat> setCat = service.getCatSet();
		System.out.println(setCat);
		//[Cat [username=야옹이, age=2], Cat [username=망치, age=1]]
		//중복불가

	}

}

