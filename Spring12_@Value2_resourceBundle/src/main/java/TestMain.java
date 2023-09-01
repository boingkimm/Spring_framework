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

		//@Value(value="${cat.username}") 
	}

}
