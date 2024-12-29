package in.ashokit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Role;
import in.ashokit.entity.User;
import in.ashokit.repo.RoleRepo;
import in.ashokit.repo.UserRepo;

@Service
public class UserRoleService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RoleRepo roleRepo;
	
	public void saveUserWithRoles() {
		
		Role r1 = new Role();
		r1.setRoleName("Admin");
		
		Role r2 = new Role();
		r2.setRoleName("Manager");
		
		User u1 = new User();
		u1.setUserName("Nikita");
		u1.setUserGender("Female");
		
		u1.setRoles(Arrays.asList(r1, r2));
		
		userRepo.save(u1);
	}
	

}
