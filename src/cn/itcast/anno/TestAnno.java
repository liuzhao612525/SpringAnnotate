package cn.itcast.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
	@Test
	public void testUser() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
//		User user = (User)context.getBean("user");
//		System.out.println(user);
//		user.add();
		
		
		UserService userService = (UserService)context.getBean("userService");
		System.out.println(userService);
		userService.add();
	}
}
