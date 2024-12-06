package in.ashokit.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import in.ashokit.dao.BookDao;
import in.ashokit.dto.BookDto;
import in.ashokit.mapper.BookRowMapper;

public class BookDaoImpl implements BookDao {
	
	private JdbcTemplate jdbcTemplate;
	

	public BookDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<BookDto> getBook() {

		String sql = "select * from books";
		
		List<BookDto> books = jdbcTemplate.query(sql, new BookRowMapper());
		
		return books;
	}

}
