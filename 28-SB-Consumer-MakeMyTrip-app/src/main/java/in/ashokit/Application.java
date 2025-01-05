package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		getWelcomeMsg();
	}
	
private static void getWelcomeMsg() {
		
		String apiURL = "https://www.classes.ashokit.in/ticket";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<User> forEntity = rt.getForEntity(apiURL, User.class);

		System.out.println(forEntity.getStatusCode().value());
		System.out.println(forEntity.getBody());
	}

}
