package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.User;
import in.ashokit.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String loadForm(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		return "index";
	}

	@GetMapping("/edit-user")
	public String editUser(@RequestParam("id") Integer id, Model model) {
		User userObj = userService.getUserById(id);
		model.addAttribute("user", userObj);
		return "index";
	}
	
	@PostMapping("/user")
	public String handleSubmit(User user, Model model) {
		
		boolean isSaved = userService.saveUser(user);
		if(isSaved) {
			model.addAttribute("smsg", "User Saved");
		}
		else {
			model.addAttribute("emsg", "User not saved");
		}
		return "index";
	}

	@GetMapping("/users")
	public String getUsers(Model model) {
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("users", allUsers);
		return  "users";
	}
	
	@GetMapping("/delete-user")
	public String deleteUser(@RequestParam("id") Integer id, 
								Model model) {
		
		boolean status = userService.deleteUserById(id);
		if(status) {
			model.addAttribute("smsg", "User Deleted");
			List<User> allUsers = userService.getAllUsers();
			model.addAttribute("users", allUsers);
		}else {
			model.addAttribute("emsg", "User Failed To Delete");
		}
		
		return "users";
		
	}
}
