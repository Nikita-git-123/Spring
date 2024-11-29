package in.ashokit.spring;

public class CreditCard implements IPayment{
	
	@Override
	public int start() {
		System.out.println("Payment by CreditCard.........");
		return 1;
	}

	public CreditCard() {
		System.out.println("CreditCard :: 0-param constructor");
	}
	
	

}
