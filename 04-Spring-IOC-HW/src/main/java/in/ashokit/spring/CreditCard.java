package in.ashokit.spring;

public class CreditCard implements IPayment{

	public CreditCard() {
		System.out.println("CreditCard :: 0-param Constructor");
	}
	
	@Override
	public int start() {
		System.out.println("Payment by Credit card........");
		return 1;
	}
}
