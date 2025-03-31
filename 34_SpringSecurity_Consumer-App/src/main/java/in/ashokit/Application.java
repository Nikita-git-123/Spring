package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		HttpHeaders head = new HttpHeaders();
		head.setBasicAuth("nikita", "nikita123");
		HttpEntity<String> reqEntity = new HttpEntity<>(head);
		String apiUrl="http://localhost:9090/msg";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> exchange = rt.exchange(apiUrl, HttpMethod.GET, reqEntity, String.class);
		System.out.println(exchange.getBody());
	}

}
