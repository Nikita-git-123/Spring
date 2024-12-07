package in.ashokit.pdf;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookPdfRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

		BookPdf bpd = new BookPdf();
		
		bpd.setId(rs.getInt(1));
		bpd.setName(rs.getString(2));
		bpd.setPrice(rs.getDouble(3));
		
		return bpd;
	}

}
