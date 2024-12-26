package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.ContactMasterEntity;

public interface ContactMasterRepo extends CrudRepository<ContactMasterEntity, Integer> {

}
