package cn.itcast.Book;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBookAnno {
	
	@Test
	public void testBookService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		BookService bookService = (BookService)context.getBean("bookService");
		bookService.add();
		
	}
}
