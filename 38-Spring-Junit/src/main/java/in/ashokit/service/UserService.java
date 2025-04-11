package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.User;

@Service
public class UserService {
	
	@Autowired
	private User user;
	
	public boolean saveUser(User user) {
		return user.save();
	}

}
