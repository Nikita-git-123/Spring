package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.bean.Motor;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("App.xml");
		
		Motor m = ctxt.getBean(Motor.class);
		
		m.doWork();
		
		ConfigurableApplicationContext cac = (ConfigurableApplicationContext) ctxt;
		
		cac.close();
	}

}
