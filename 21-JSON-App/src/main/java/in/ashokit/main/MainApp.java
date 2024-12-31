package in.ashokit.main;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.binding.Customer;

public class MainApp {

	public static void main(String[] args) throws Exception {
		
		MainApp app = new MainApp();
		// app.convertJavaToJson();
		app.convertJsonToJava();
	}

	public void convertJavaToJson() throws Exception {
		
		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("Nikita");
		customer.setPhno(908070l);
		
		File f = new File("Customer.json");
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(f, customer);
		
		System.out.println("Serialization completed.......");
	}
	
	public void convertJsonToJava() throws Exception {
		
		File f = new File("Customer.json");
		ObjectMapper mapper = new ObjectMapper();
		Customer customer = mapper.readValue(f, Customer.class);
		System.out.println("De-serialization completed..." + customer);
	}
}
