package in.ashokit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Person;
import in.ashokit.repo.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepo;
	
	public void showPersons() {
		
		Person  p1 = new Person(101, "Nikita", 20000.00);
		Person  p2 = new Person(102, "Namrata", 22000.00);
		Person  p3 = new Person(103, "Akshita", 25000.00);
		Person  p4 = new Person(104, "Poonam", 30000.00);
		Person  p5 = new Person(105, "Kavita", 32000.00);
		
		personRepo.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
	}
}
