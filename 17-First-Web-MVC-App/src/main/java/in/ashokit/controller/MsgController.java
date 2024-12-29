package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		//setting response data in key and value 
		mav.addObject("msg", "Welcome to Ashok IT");
		
		// setting view page name
		mav.setViewName("index");
		
		return mav;
	}
}
