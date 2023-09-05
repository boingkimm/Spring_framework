import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		Person p = ctx.getBean("p1", Person.class);
		System.out.println(p);

		//SpEL : #{표현식}
		//static 메서드를 호출
		//value="#{T(com.dto.Person).zzz()}"
		//Person [username=KilDong, age=20, isMarried=true, height=172.8]
		
		//API의 static메서드도 사용 가능
		//value="#{T(java.lang.Integer).parseInt('12')}"
	}

}
