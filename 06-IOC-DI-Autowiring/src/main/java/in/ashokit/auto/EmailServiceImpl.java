package in.ashokit.auto;

public class EmailServiceImpl implements IEmailService{

	@Override
	public String Email() {
		
		System.out.println("Email() -- Email is sent to you..");
		return "Email()";
	}

	
	
}
