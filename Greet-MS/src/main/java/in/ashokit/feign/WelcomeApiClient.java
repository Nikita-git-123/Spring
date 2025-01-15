package in.ashokit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-MS")
public interface WelcomeApiClient {

	@GetMapping("/welcome")
	public String welcomeInvokeMsg();
}
