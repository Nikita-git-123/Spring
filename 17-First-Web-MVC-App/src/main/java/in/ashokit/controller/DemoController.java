package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@ResponseBody
	@GetMapping("/demo/{name}")
	public String demoMsg(@PathVariable String name) {
		return name + ", Hello...Greetings for the day";
	}

}
