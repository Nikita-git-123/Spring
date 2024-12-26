package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		// IOC will start
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		// get bean object
		PersonService personService = context.getBean(PersonService.class);

		// calling bean method
		//personService.savePersons();
		
		//personService.getPerosnsSort();
		
		//personService.getPerosnsPagination();
		
		personService.getPerosnsQBE("Female", "India");

	}

}
