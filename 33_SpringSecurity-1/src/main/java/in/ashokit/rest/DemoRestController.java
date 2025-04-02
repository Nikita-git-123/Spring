package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/wlcome")
	public String getWelcome() {
		return "Welcome.........";
	}
	
	@GetMapping("/msg")
	public String getMsg() {
		return "Good Morning.....";
	}

	@GetMapping("/contact")
	public String getContact() {
		return "call+ : 9087654321";
	}
}
