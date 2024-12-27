package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity1.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
