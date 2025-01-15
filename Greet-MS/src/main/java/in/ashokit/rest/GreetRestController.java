package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.feign.WelcomeApiClient;

@RestController
public class GreetRestController {
	
	@Autowired
	public WelcomeApiClient welcomeClient;

	@GetMapping("/greet")
	public String getGreetMsg() {
		String welcomeMsg = welcomeClient.welcomeInvokeMsg();
		String greetMsg = "Good Morning..........";
		return welcomeMsg.concat(greetMsg);
	}
}
