package in.ashokit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Quote;

@Controller
public class QuoteRestController {

	@GetMapping("/quotes/{id}")
	public String getQuotes(@PathVariable Integer id, Model model) {
		
		String ApiUrl = "https://dummyjson.com/quotes";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Quote> forEntity = rt.getForEntity(ApiUrl, Quote.class);
		System.out.println(forEntity.getBody());
		model.addAttribute("quote", forEntity);
		return "Quotes";
		
	}
}
