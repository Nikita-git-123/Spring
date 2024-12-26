package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	// select * from user_info
	public List<User> findByCounter(String counter);
	
	// select * from user_info where country=? and gender=?
	public List<User> findByCounterAndGender(String counter, String gender);
	
	@Query("From User")
	public List<User> getAllUserHQL();
	
	@Query(value="select * from user_info", nativeQuery=true)
	public List<User> getAllUserSQL();
}
