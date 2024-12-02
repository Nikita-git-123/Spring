package in.ashokit.auto;

public class UserDaoImpl implements IUserDao{

	@Override
	public String Dao() {
		System.out.println("Dao() -- Data stored in db..");
		return "Dao()";
	}

}
