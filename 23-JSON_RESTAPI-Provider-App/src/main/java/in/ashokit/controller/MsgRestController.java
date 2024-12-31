package in.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcome to AshokIT";
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> getGreetMsg() {
		String msg =  "Good Morning......";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
