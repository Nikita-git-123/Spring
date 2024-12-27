package in.ashokit.repo1;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity1.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
