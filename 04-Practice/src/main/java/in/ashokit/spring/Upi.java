package in.ashokit.spring;

public class Upi implements IPayment{
	
	@Override
	public int start() {
		System.out.println("Payment by Upi....");
		return 1;
	}

	public Upi() {
		System.out.println("Upi :: 0-param constructor");
	}
	
	
	

}
