package in.ashokit.beans;

public class UserService {

	private PwdService pwdService;

	public UserService() {

		System.out.println("UserService  :: 0-param Constructor ");

	}

	public UserService(PwdService pwdService) {

		System.out.println("UserService  :: param Constructor ");

	}

	// SI
	public void setPwdService(PwdService pwdService) {

		System.out.println("setPwdService called..........");
		this.pwdService = pwdService;

	}

	public void saveUser(String uname, String pwd, long phno) {

		String encodePwd = pwdService.encodePwd(pwd);
		System.out.println("Encoded pwd : " + encodePwd);

		System.out.println("Record inserted successfully......");
	}

}
