package in.ashokit.auto;

public class UserService {
	
	private IPwdService pwdService;
	
	private IUserDao userDao;
	
	private IEmailService emailService;
	
	
	/*
	 * public UserService() { System.out.println("Default construtor....."); }
	 */

	public UserService(IPwdService pwdService, IUserDao userDao, IEmailService emailService) {
		this.pwdService = pwdService;
		this.userDao = userDao;
		this.emailService = emailService;
	}
	
	
	//for autowire = "byType"
	/*
	 * public void setPwdService(IPwdService pwdService) { this.pwdService =
	 * pwdService; }
	 * 
	 * 
	 * public void setUserDao(IUserDao userDao) { this.userDao = userDao; }
	 * 
	 * 
	 * public void setEmailService(IEmailService emailService) { this.emailService =
	 * emailService; }
	 */

	public void saveUser() {
		
		pwdService.Pwd();
		
		userDao.Dao();
		
		emailService.Email();
	}

}
