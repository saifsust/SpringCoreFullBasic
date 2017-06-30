package com.springFrameWork.databaseConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("infoDao")
public class infoDAO {

	private JdbcTemplate jdbc;

	@Autowired
	public void setJdbc(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);
	}

	public List<info> getInfo() {

		return jdbc.query("select * from spring_tutorial.info;", new RowMapper<info>() {

			public info mapRow(ResultSet rs, int rowNum) throws SQLException {

				info inf = new info();
				inf.setId(rs.getInt("id"));
				inf.setName(rs.getString("name"));
				inf.setAddressId(rs.getInt("addressId"));
				return inf;
			}

		});
	}

}
