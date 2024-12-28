package in.ashokit.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Passport;
import in.ashokit.entity.Person;
import in.ashokit.repo.PassportRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonPassportService {

	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private PassportRepo passportRepo;

	public void saveData() {

		Person person = new Person();
		person.setPersonName("Akshit");
		person.setPersonGender("Male");

		Person savedPerson = personRepo.save(person);

		Passport passport = new Passport();
		passport.setPassportNumber("Q98ERC4FDRC");
		passport.setIssuedAt(LocalDate.now());
		passport.setExpireAt(LocalDate.now().plusYears(10));

		passport.setPerson(savedPerson);

		passportRepo.save(passport);
	}

	public void getPerson() {

		Optional<Person> byId = personRepo.findById(1);
		if (byId.isPresent())
			System.out.println("Id : " + byId.get());
	}
	
	public void deletePerson() {
		personRepo.deleteById(1);
	}

	public void getPassport() {

		Optional<Passport> byId = passportRepo.findById(1);
		if (byId.isPresent())
			System.out.println("Id : " + byId.get());
	}
	
	public void deletePassport() {
		passportRepo.deleteById(1);
	}
}
