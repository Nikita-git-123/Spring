package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{
	
	@Query("From UserEntity")
	public List<UserEntity> showUserHQL();
	
}


