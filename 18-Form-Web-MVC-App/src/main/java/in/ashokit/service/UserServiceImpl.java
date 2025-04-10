package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public boolean saveUser(User user) {
		
		User savedUser  = userRepo.save(user);
		return savedUser.getId() != null;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User getUserById(Integer id) {
		Optional<User> byId = userRepo.findById(id);
		if(byId.isPresent())
			return byId.get();
		return null;
	}

	@Override
	public boolean deleteUserById(Integer id) {
		if(userRepo.existsById(id)) {
			userRepo.deleteById(id);
		    return true;
		}
		return false;
	}

}
