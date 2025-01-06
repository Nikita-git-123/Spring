package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.service.QuoteService;

@Controller
public class QuoteRestController {
	
	@Autowired
	private QuoteService quoteService;

	@GetMapping("/quotes")
	public String getQuotes( Model model) {
		model.addAttribute("quote", quoteService.getQuotes());
		return "Quotes";
		
	}
}
