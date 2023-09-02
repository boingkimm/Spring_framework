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

		//명시적으로 입력받기
		
		//p1 : Person [username=홍길동, cat=Cat [username=야옹이, age=2]]

	}

}
