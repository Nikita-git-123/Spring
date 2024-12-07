package in.ashokit.pdf;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookPdfDaoImpl implements BookPdfDao {

	
	private JdbcTemplate jdbcTemplate; 
	
	public BookPdfDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public List<BookPdf> getBookData() {
		
		String sql = "select * from books";
		
		List<BookPdf> lsbpd = jdbcTemplate.query(sql, new BookPdfRowMapper());
		
		return lsbpd;
	}
	
	
}
