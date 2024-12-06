package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.CourseImpl;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Excel.xml");
		
		CourseImpl course = ctxt.getBean(CourseImpl.class);
		
	}

}
