import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {

		// IoC Container 생성
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("classpath:com/config/user.xml");
		
		// 빈 얻기
		UserService service = ctx.getBean("service", UserService.class);

		List<Cat> list = service.getCatList();
		System.out.println(list);
		//[Cat [username=야옹이, age=2], Cat [username=망치, age=1], Cat [username=야옹이, age=2]]
		//중복 허용. 순서대로 출력됨

	}

}

