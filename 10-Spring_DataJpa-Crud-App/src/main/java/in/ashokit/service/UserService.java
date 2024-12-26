package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepository;

@Service
public class UserService {

	private UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
		System.out.println("Impl clas name : " + userRepo.getClass().getName());
	}
	
	public void deleteAllUsers() {
		userRepo.deleteAll();
	}
	
	public void saveAllUsers() {
		
		User u1 = new User();
		u1.setId(102);
		u1.setName("Nikita Patil");
		u1.setGender("Female");
		u1.setCounter("India");
		
		User u2 = new User();
		u2.setId(103);
		u2.setName("Pravin Patil");
		u2.setGender("Male");
		u2.setCounter("India");
		
		User u3 = new User();
		u3.setId(104);
		u3.setName("Poonam Bagul");
		u3.setGender("Female");
		u3.setCounter("India");
		
		Iterable<User> userList = Arrays.asList(u1,u2,u3);
		userRepo.saveAll(userList);
	}

	public void saveUser() {
		User u = new User();
		u.setId(101);
		u.setName("Namrata Patil");
		u.setGender("Female");
		u.setCounter("India");

		userRepo.save(u);
	}
	
	public void getAllUsers() {
		
		Iterable<User> all = userRepo.findAll();
		all.forEach(u -> {
			System.out.println(u);
		});
	}
	
	public void getUserById(Integer uid) {
		
		Optional<User> byId = userRepo.findById(uid);
		
		if(byId.isPresent())
			System.out.println(byId.get());
		else 
			System.out.println("No User Found ");
	}
	
	public void getUserByCountry(String counter) {
		List<User> byCountry = userRepo.findByCounter(counter);
		byCountry.forEach(System.out::println);
	}
	
	public void getUserByCountryGender(String counter, String gender) {
		List<User> byCountryAndGender = userRepo.findByCounterAndGender(counter, gender);
		byCountryAndGender.forEach(System.out::println);
	}
	
	public void getAllUsersByHQL() {
		List<User> allUserHQL = userRepo.getAllUserHQL();
		allUserHQL.forEach(System.out::println);
	}
	
	public void getAllUsersBySQL() {
		List<User> allUserSQL = userRepo.getAllUserSQL();
		allUserSQL.forEach(System.out::println);
	}

}
