package in.ashokit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "30Welcome-Service")
public interface GreetFeignClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeMsg();

}
