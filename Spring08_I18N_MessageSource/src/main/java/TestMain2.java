import java.util.Locale;

import org.jboss.logging.MessageBundle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain2 {

	public static void main(String[] args) {

		//메인이 아닌 임의의 빈(UserService)에서 MessageSource 사용하기
		
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");

		UserService service = ctx.getBean("service", UserService.class);
		service.info();
		
	}

}
