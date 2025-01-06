package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Quote;

@Service
public class QuoteService {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<Quote> getQuotes() {
        String providerUrl = "https://dummyjson.com/quotes/random"; // replace with the actual provider API URL
        Quote[] quotes = restTemplate.getForObject(providerUrl, Quote[].class);
        return List.of(quotes); // Return as a List of Quote objects
    }
}
