package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestControllrer {

	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod ="getDataFromDB", name="ashokit")
	public String getDataFromRedis() {
		System.out.println("Redis Called.....");
		int i = 10/0;
		return "Data from Redis.........";
	}
	
	public String getDataFromDB(Throwable t) {
		System.out.println("DB Called.....");
		return "Data from Database.........";
	}
}
