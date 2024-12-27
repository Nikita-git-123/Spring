package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity1.Contact;
import in.ashokit.repo.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	public void showContacts() {
		
		Contact c = new Contact();
		c.setName("Akshita");
		c.setEmail("Ak@gmail.com");
		c.setCountry("UK");
		
		contactRepo.save(c);
	}
}
