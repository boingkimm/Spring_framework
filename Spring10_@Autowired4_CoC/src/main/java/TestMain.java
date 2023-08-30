import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		Person p = ctx.getBean("p", Person.class);
		System.out.println(p);

		//CoC (Convention over Configuration)
		//xml에 cat과 일치하는 id를 가진 빈으로 주입이 된다.
		//Cat cat; ==> cat, cat2 있을 경우  cat을 주입
		//Person [username=홍길동, cat=Cat [username=야옹이, age=2]]
		
		
	}

}
