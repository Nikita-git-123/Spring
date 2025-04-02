package in.ashokit.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.SneakyThrows;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	@Bean
	@SneakyThrows
	public SecurityFilterChain security(HttpSecurity http) {
		
		http.authorizeHttpRequests((req) -> { req.requestMatchers("/contact")
												.permitAll()
												.anyRequest()
												.authenticated();
		}).httpBasic(Customizer.withDefaults())
		  .formLogin(Customizer.withDefaults());
		
		return http.build();
	}

}
