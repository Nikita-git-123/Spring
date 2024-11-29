package in.ashokit.spring;

public class DebitCard implements IPayment{

	public DebitCard() {
		System.out.println("DebitCard :: 0-param Constructor");
	}
	
	@Override
	public int start() {
		System.out.println("Payment by Debit card.......");
		return 1;
	}

	
}
