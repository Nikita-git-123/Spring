package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity1.Person;
import in.ashokit.entity2.Contact;
import in.ashokit.repo1.PersonRepository;
import in.ashokit.repo2.ContactRepository;

@Service
public class CommonService {

	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	private ContactRepository contactRepo;
	
	public void showUsers() {
		
		Person p = new Person();
		p.setId(101);
		p.setName("Nikita");
		p.setSalary(20000.00);
		
		personRepo.save(p);
		
		
		Contact c = new Contact();
		c.setId(1);
		c.setName("Namrata");
		c.setCountry("India");
		
		contactRepo.save(c);
	}
}
