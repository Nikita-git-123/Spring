package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Atm;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
	
		Atm atm = ctxt.getBean(Atm.class);
		atm.withdraw();
	
	}

}
