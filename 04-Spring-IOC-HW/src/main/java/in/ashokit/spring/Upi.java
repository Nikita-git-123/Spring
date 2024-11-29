package in.ashokit.spring;

public class Upi implements IPayment{

	public Upi() {
		System.out.println("UPI :: 0-param Consrtuctor");
	}

	@Override
	public int start() {
		System.out.println("Payment by UPI........");
		return 1;
	}
	
}
