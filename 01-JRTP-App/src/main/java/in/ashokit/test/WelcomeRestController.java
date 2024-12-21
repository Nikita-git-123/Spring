package in.ashokit.test;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String getMsg( ) {
		log.info("started.......................");
		//logic
		log.info("ended................");
		return "Welcome to Ashok It";
	}

}
