package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.bean.BookService;

public class MainApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		
		BookService bookService = ctxt.getBean(BookService.class);
		
		bookService.storeBookData();
	}

}
