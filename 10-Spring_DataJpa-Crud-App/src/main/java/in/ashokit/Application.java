package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserService userService = context.getBean(UserService.class);
		
		//userService.deleteAllUsers();
		
		//userService.saveUser();
		
		//userService.saveAllUsers();
		
		//userService.getAllUsers();
		
		//userService.getUserById(101);
		
		//userService.getUserByCountry("India");
		
		//userService.getUserByCountryGender("India", "Male");
		
		//userService.getAllUsersByHQL();
		
		userService.getAllUsersBySQL();
	}

}
