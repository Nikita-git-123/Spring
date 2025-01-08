package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.feign.GreetFeignClient;

import in.ashokit.feign.GreetFeignClient;

@RestController
public class GreetRestController {

	@Autowired
	private GreetFeignClient feignClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String welcomeMsg = feignClient.invokeWelcomeMsg();
		
		String greetMsg = "Good Morning, ";
		
		return greetMsg.concat(welcomeMsg);
	}
}
