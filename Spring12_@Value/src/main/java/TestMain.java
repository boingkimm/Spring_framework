import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;


public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		Cat c = ctx.getBean("cat1", Cat.class);
		System.out.println(c);

		//빈에 프로퍼티 지정X : Cat [username=null, age=0]
		//@Value 지정시 : Cat [username=홍길동, age=10]
		
		
	}

}
