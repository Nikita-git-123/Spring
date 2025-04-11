package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.dao.User;
import in.ashokit.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		
		boolean saveUser = userService.saveUser(user);
		
		if(saveUser) {
			sendEmail();
			return new ResponseEntity<>("User saved", HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>("User saved", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	 
	public void sendEmail() {
		//logic
	}

}
