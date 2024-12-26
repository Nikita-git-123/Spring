package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.UserEntity;
import in.ashokit.repo.UserRepository;

@Service
public class UserService {

	private UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
		System.out.println(userRepo.getClass().getName());
	}
	
	public void insertUsersHQL() {
		UserEntity ue1 = new UserEntity();
		ue1.setId(01);
		ue1.setName("Poonam");
		ue1.setCountry("India");
		ue1.setGender("Female");
		
		UserEntity ue2 = new UserEntity();
		ue2.setId(02);
		ue2.setName("Nikita");
		ue2.setCountry("UK");
		ue2.setGender("Female");
		
		UserEntity ue3 = new UserEntity();
		ue3.setId(03);
		ue3.setName("Kundan");
		ue3.setCountry("USA");
		ue3.setGender("Male");
		
		userRepo.saveAll(Arrays.asList(ue1,ue2,ue3));
	}
	
	public void showUsers() {
		List<UserEntity> showUserHQL = userRepo.showUserHQL();
		showUserHQL.forEach(System.out::println);
	}
}
