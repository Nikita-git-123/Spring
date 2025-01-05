package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.ashokit.binding.User;
import in.ashokit.repo.UserRepository;

public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public boolean saveUser(User user) {
		User savedUser = userRepo.save(user);
		return savedUser.getId() != null ;
	}
	
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
}
