package in.ashokit.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.ashokit.dto.BookDto;

public class BookRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

		BookDto dto = new BookDto();
		dto.setBid(rs.getInt(1));
		dto.setBname(rs.getString(2));
		dto.setBprice(rs.getDouble(3));
		
		return dto;
	}

}
