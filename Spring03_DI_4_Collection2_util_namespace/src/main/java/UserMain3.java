import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService;
import com.service.UserService2;
import com.service.UserService3;

public class UserMain3 {

	public static void main(String[] args) {

		// IoC Container 생성
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("classpath:com/config/user3.xml");
		
		// 빈 얻기
		UserService3 service = ctx.getBean("service", UserService3.class);

		Map<String, Cat> m = service.getCatMap();
		Set<String> keys = m.keySet();
		for (String key : keys) {
			System.out.println(key+"\t"+m.get(key));
		}
		//pet01	Cat [username=야옹이, age=2]
		//pet02	Cat [username=망치, age=1]
		//toString출력됨
	}

}

