package in.ashokit.spring;

public class Restraurant {
	
	private Upi upi;
	
	public Restraurant(Upi upi) {
		System.out.println("Restraurant :: param constructor");
		this.upi = upi;
	}

	public void bill() {
		System.out.println("Payment bill here........");
		
		int status = upi.start();
		if(status >= 1)
			System.out.println("Payment successfull.......");
		else
			System.out.println("Payment failed.........");
	}

}
