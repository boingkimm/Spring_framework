import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class EnvironmentTest {

	public static void main(String[] args) {
		
		//운영체제의 환경변수 얻기 ( key/value ==> Map, Properties )
		
		//1. 일반 자바 클래스에서 사용
		Properties props = System.getProperties();	//getProperties에 환경변수들 
		
		Set<String> keys = props.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key+"\t"+props.getProperty(key));
		}
		
		System.out.println("######################################");
		
		
		//2. 스프링에서 사용
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();	//IoC 컨테이너 생성
		
		ConfigurableEnvironment env = ctx.getEnvironment();
		Map<String, Object> m = env.getSystemProperties();
		Set<String> keys2 = m.keySet();
		for (String key : keys2) {
			System.out.println(key+"\t"+props.get(key));
		}
	}

}
