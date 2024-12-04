package in.ashokit.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookService {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
		
	public BookService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	File f = new File("C:\\Users\\Admin\\Desktop\\Test\\ABC.txt");
	
	FileReader fr = new  FileReader(f);
	
	
	BufferedReader br = new BufferedReader(fr); 
}
