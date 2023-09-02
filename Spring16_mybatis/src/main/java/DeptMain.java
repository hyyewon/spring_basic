import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

public class DeptMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		DeptService service = ctx.getBean("service",DeptServiceImpl.class);
		List<DeptDTO> list = service.findAll();
		System.out.println(list);

	}

}
