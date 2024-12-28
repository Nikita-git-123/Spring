package in.ashokit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.OrderDetailsEntity;
import in.ashokit.repo.OrderDetailsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		OrderDetailsRepo bean = ctxt.getBean(OrderDetailsRepo.class);
		
		OrderDetailsEntity ode = new OrderDetailsEntity();
		
		ode.setOrderBy("Miller");
		ode.setOrderDate(new Date());
		
		OrderDetailsEntity savedEntity = bean.save(ode);
		
		System.out.println(savedEntity);
		
		ctxt.close();
	}

}
