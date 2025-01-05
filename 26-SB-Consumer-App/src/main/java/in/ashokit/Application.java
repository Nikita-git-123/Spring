package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.ashokit.bindings.Quote;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		// getWelcomeMsg();
		
		getRendomQuote();
	}
	
	public static void getWelcomeMsg() {
		
		String ApiUrl = "https://api.restful-api.dev/objects/" ;
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(ApiUrl, String.class);
		System.out.println(forEntity.getStatusCode().value());
		System.out.println(forEntity.getBody());
		
	}
	
	public static void getRendomQuote() {
		
		String ApiUrl = "https://dummyjson.com/quotes/random";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Quote> forEntity = rt.getForEntity(ApiUrl, Quote.class);
		System.out.println(forEntity.getBody());
	}

}
