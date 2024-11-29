package in.ashokit.spring;

public class Restraurant {
	
	private Upi upi;
	
	public Restraurant() {
		System.out.println("Restraurant :: 0-param constructor");
	}

	//CI
	 public Restraurant(Upi upi) {
		 System.out.println("Restraurant :: param constructor");
		 this.upi = upi; 
     }

	//SI
	public void setBill(Upi upi) {
		System.out.println("Setter Injection.........");
		this.upi = upi;
	}

	public void bill() {
		
		int status = upi.start();
		
		if(status >= 1)
			System.out.println("Payment successfull.......");
		else
			System.out.println("Payment problem......");
	}
}
