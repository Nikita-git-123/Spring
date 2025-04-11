package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.MsgService;

@RestController
public class MsgRestController {
	
	@Autowired
	private MsgService msgService;
	
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String welcomeMsg = msgService.getWelcomeMsg();
		welcomeMsg = welcomeMsg.toUpperCase();
		return welcomeMsg;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		String greetMsg = msgService.getGreetMsg();
		greetMsg = greetMsg.toLowerCase();
		return greetMsg;
	}

}
