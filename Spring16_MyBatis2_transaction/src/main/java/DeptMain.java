import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

import ch.qos.logback.core.pattern.SpacePadder;

public class DeptMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/spring_config.xml");
		
		DeptService service = ctx.getBean("deptService", DeptService.class);
		
		//트랜잭션 실습
		try {
			int n = service.tx();
		} catch (Exception e) {
			System.out.println("예외발생");
		}
		
		
		//목록
		List<DeptDTO> list = service.deptList();
		for (DeptDTO dto : list) {
			System.out.println(dto);
		}
		
		
		
	}

}
