package in.ashokit.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		
		String prefix = "OD";
		String suffix = "";
		
		try {
			Connection conn = session.getJdbcConnectionAccess().obtainConnection();
			Statement statement = conn.createStatement();
			String sql = "select order_id_sql.nextval from dual";
			ResultSet resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				int sqlval = resultSet.getInt(1);
				suffix = String.valueOf(sqlval);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return prefix + suffix;
	}

}
