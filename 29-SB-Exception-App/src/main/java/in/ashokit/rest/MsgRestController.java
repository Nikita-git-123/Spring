package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/greet")
	public String getGreetMsg() {

		String s = null;
		s.length(); // NPE

		String msg = "Good Morning";
		return msg;
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		int i = 10 / 0; // AE

		String msg = "Welcome to Rest API";
		return msg;
	}

}