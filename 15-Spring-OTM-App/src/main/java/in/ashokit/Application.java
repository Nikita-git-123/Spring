package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.EmployeeAddrService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		EmployeeAddrService bean = ctxt.getBean(EmployeeAddrService.class);
		
		// bean.saveEmpWithAddr();
		
		// bean.getEmp();
		
		bean.getAddr();
	}

}
