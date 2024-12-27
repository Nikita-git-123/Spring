package in.ashokit.repo2;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity2.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
