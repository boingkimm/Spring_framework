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

		//cat1만 있을 경우: Person [username=홍길동, cat=Cat [username=야옹이, age=2]]
		//cat2도 있을 경우: NoUniqueBeanDefinitionException
		//@Qualifier(value="cat2") 지정시 : Person [username=홍길동, cat=Cat [username=망치, age=1]]
		
	}

}
