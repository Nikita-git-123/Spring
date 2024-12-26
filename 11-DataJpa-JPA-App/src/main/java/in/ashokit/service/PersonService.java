package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Person;
import in.ashokit.repo.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepo;
	
	public void savePersons() {
		
		Person p1 = new Person(1, "Nikita" , 20, "Female", "India");
		Person p2 = new Person(2, "Kundan" , 19, "Male", "USA");
		Person p3 = new Person(3, "Poonam" , 21, "Female", "UK");
		Person p4 = new Person(4, "Namrata" , 22, "Female", "USA");
		Person p5 = new Person(5, "Pravin" , 25, "Male", "UK");
		Person p6 = new Person(6, "Jyoti" , 29, "Female", "India");
		Person p7 = new Person(7, "Akshita" , 26, "Female", "Uk");
		Person p8 = new Person(8, "Akshit" , 30, "Male", "India");
		
		personRepo.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8));
	}
	
	public void getPerosnsSort() {

		Sort sort = Sort.by("age").ascending();
		List<Person> all = personRepo.findAll(sort);
		all.forEach(System.out::println);
	}
	
	public void getPerosnsPagination() {
		
		int pageSize = 3;
		int pageNo = 2;
		PageRequest of = PageRequest.of(pageNo-1, pageSize);
		Page<Person> all = personRepo.findAll(of);
		List<Person> content = all.getContent();
		content.forEach(System.out::println);
	}
	
	public void getPerosnsQBE(String gender, String country) {

		Person p = new Person();
		
		if(gender != null) {
			p.setGender(gender);
		}
		
		if(country != null) {
			p.setCountry(country);
		}
		
		Example<Person> of = Example.of(p);
		List<Person> all = personRepo.findAll(of);
		all.forEach(System.out::println);
	}
}
