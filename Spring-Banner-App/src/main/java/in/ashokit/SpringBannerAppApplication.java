package in.ashokit;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBannerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBannerAppApplication.class, args);

		/*
		 * new SpringApplicationBuilder(SpringBannerAppApplication.class)
		 * .bannerMode(Banner.Mode.OFF) .run(args);
		 */
		
	}

}
