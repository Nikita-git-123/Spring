package in.ashokit.beans;

import org.springframework.jdbc.core.JdbcTemplate;

import lombok.Data;

@Data
public class CourseImpl implements Course{

	private JdbcTemplate jdbcTemplate;
	
		/*
		 * List<Course> courses = jdbcTemplate.query(sql , (rs, row) -> {
		 * courses.setBookid(rs.getBookid("id"));
		 * courses.setBookname(rs.getBookname("name"));
		 * courses.setBookprice(rs.getBookprice("price")); });
		 */

	@Override
	public void getCourse(int bookid, String bookname, Double bookprice) {
		
		String sql = "select * from books";	
		jdbcTemplate.query(sql, rse -> {
			rse.getInt(0);
			rse.getString(1);
			rse.getDouble(2);
			
		});
	}

}
