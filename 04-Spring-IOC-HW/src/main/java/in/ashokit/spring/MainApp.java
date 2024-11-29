package in.ashokit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = 
				new ClassPathXmlApplicationContext("SpringBeans.xml");
		
	    Restraurant restraurant = ctxt.getBean(Restraurant.class);
		
	    restraurant.bill();
	}
}
