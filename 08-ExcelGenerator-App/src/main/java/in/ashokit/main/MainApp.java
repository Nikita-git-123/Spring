package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.service.BookService;

public class MainApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Excel.xml");
		
		BookService bookService = ctxt.getBean(BookService.class);
		
		bookService.getBook();
	}

}
