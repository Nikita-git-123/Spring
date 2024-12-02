package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.auto.UserService;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		
		UserService userService = ctxt.getBean(UserService.class);
		
		userService.saveUser();
	}
}
