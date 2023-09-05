import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		Person p = ctx.getBean("p2", Person.class);
		System.out.println(p);

		//SpEL : #{표현식}
		//다른 빈을 참조 : value="#{p1.username}"
		//Person [username=홍길동, age=20, isMarried=true, height=172.8]
	}

}
