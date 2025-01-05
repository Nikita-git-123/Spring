package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.User;
import in.ashokit.service.UserService;

@Controller
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@PostMapping("/submit")
	public String handleSubmitForm(User user, Model model) {
		userService.saveUser(user);
		return "index";
	}
	
	@GetMapping("/getTicket")
	public String getUsers(User user, Model model) {
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("tickets", allUsers);
		return "ticket";
	}
}
