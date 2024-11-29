package in.ashokit.spring;

public class DebitCard implements IPayment{
	
	@Override
	public int start() {
		System.out.println("Payment by DebitCard........");
		return 1;
	}

	public DebitCard() {
		System.out.println("DebitCard :: 0-param constructor");
	}

	
	
}
