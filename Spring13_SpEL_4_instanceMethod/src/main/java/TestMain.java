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
		//인스턴스 메서드를 호출
		
		//메서드 추가 가능
		//#{p1.xxx().toUpperCase().substring(0,4)}
		//p2: Person [username=HONG, age=20, isMarried=true, height=172.8]
		
		//null값에 메서드 추가 시 에러
		// => ? 추가 시 null값이면 뒤의 메서는 호출하지 않음
		//#{p1.yyy()?.toUpperCase()}
		//#{p1.yyy()?.toUpperCase()?.substring(0,4)}
		//p1: Person [username=null, age=20, isMarried=true, height=172.8]
	}

}
