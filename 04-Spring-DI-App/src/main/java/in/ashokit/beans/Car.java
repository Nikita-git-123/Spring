package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {

	private DieselEngine eng;
	
	//CI
	public Car(DieselEngine eng) {
		System.out.println("Car :: param constructor");
		this.eng = eng;
	}
	
	public void drive() {
		
		int status = eng.start();
		
		if( status >= 1)
			System.out.println("Journey started.........");
		else
			System.out.println("Engine problem........");
	}

	

}
