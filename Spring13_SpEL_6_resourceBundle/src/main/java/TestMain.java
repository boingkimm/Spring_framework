import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;


public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("com/config/user.xml");
		
		Cat c = ctx.getBean("cat1", Cat.class);
		System.out.println(c);

		//value="#{cat.username}" - 에러
		//value="${cat.username}" - 정상
		
		//SpEL용 resource bundle 등록 : util namespace
		//Cat [username=잔나비, age=2]
		
	}

}
