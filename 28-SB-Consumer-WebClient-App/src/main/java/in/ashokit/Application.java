package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Quote;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// getRandomQuote1();
		// getRandomQuote2();
		getRandomQuote3();
	}

	public static void getRandomQuote1() {

		String apiUrl = "https://dummyjson.com/quotes/random";

		WebClient webClient = WebClient.create();

		String response = webClient.get().uri(apiUrl).retrieve().bodyToMono(String.class).block();

		System.out.println(response);
	}

	public static void getRandomQuote2() {

		String apiUrl = "https://dummyjson.com/quotes/random";

		WebClient webClient = WebClient.create();

		Quote bodyToMono = webClient.get().uri(apiUrl).retrieve().bodyToMono(Quote.class).block();

		System.out.println(bodyToMono);
	}

	public static void getRandomQuote3() {

		String apiUrl = "https://dummyjson.com/quotes/random";

		WebClient webClient = WebClient.create();

		System.out.println("======  Request sending - start  ======");

		webClient.get().uri(apiUrl).retrieve().bodyToMono(Quote.class).subscribe(response -> handleResponse(response));

		System.out.println("======  Request sending - stop  ======");

	}

	private static void handleResponse(Quote response) {
		System.out.println(response);

	}

}
