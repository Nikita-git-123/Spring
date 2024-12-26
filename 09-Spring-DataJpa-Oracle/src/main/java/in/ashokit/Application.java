package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.ContactMasterEntity;
import in.ashokit.repo.ContactMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ContactMasterRepo cmr = context.getBean(ContactMasterRepo.class);
		
		ContactMasterEntity cme = new ContactMasterEntity();
		
		cme.setContactId(101);
		cme.setContactName("Nikita");
		cme.setContactNumber(123456789l);
		
		cmr.save(cme);
		
		context.close();
		
	}

}
