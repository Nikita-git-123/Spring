package in.ashokit.dao;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class User {
	
	private Integer id;
	private String name;
	
	public boolean save() {
		//db login
		return true;
	}

}
