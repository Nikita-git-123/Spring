package in.ashokit.bean;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public BookDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void savebook(int bid, String bname, Double bprice) {
		
		String sql = "insert into books values(?,?,?)";
		jdbcTemplate.update(sql, ps -> {
			ps.setInt(1, bid);
			ps.setString(2, bname);
			ps.setDouble(3, bprice);
		});
		
	}

}
