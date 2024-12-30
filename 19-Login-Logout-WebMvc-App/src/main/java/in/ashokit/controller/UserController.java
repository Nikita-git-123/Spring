package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.ashokit.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@GetMapping("/")
	public String index(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		
		return "index";
	}
	
	@PostMapping("/login")
	public String login(HttpServletRequest req, User user, Model model) {
		
		String email = user.getEmail();
		String password = user.getPassword();
		
		if(email.equals("niku@gmail.com") && password.equals("nik")) {
			
			HttpSession session = req.getSession(true);
			session.setAttribute("email", email);
			
			return "dashboard";
		}
		else {
			model.addAttribute("emsg", "Invalid Credentials");
		}
		
		return "index";
	}
	
	@GetMapping("/personal")
	@ResponseBody
	public String getPersonalDetails(HttpServletRequest req, Model model) {
		
		HttpSession session = req.getSession(false);
		String email = (String) session.getAttribute("email");
		
		return "personal";
	}
	
	@GetMapping("/educational")
	@ResponseBody
	public String getEducationalDetails(HttpServletRequest req, Model model) {
		
		HttpSession session = req.getSession(false);
		String email = (String) session.getAttribute("email");
		
		return "educational";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest req, Model model) {
		
		User userObj = new User();
		model.addAttribute("user", userObj);
		
		HttpSession session = req.getSession(false);
		session.invalidate();
		
		return "index";
	}
}
