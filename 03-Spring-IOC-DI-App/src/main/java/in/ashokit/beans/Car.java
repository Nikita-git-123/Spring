package in.ashokit.beans;

public class Car {

	private Engine eng;
	
	public Car() {
		System.out.println("Car :: 0-param constructor");
	}
	
	//CI
	public Car(Engine eng) {
		System.out.println("Car :: param constructor");
	}
	
	//SI
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		int status = eng.start();
		
		if(status >= 1)
			System.out.println("Journey started.....");
		else 
			System.out.println("Engine problem.......");
	}
	
	
}
