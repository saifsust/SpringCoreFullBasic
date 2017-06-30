package com.springFrameWork.DatabaseUsingNamedParameter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("detailDAO")
public class DetailDAO {
	private JdbcTemplate jdbc;

	@Autowired
	public void setJdbc(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);
	}

	List<Detail> getDetail() {
		return jdbc.query("select * from spring_tutorial.detail where FirstName=?;", new RowMapper<Detail>() {

			public Detail mapRow(ResultSet rs, int rowNum) throws SQLException {
				Detail detail = new Detail();
				detail.setId(rs.getInt("Id"));
				detail.setFirstName(rs.getString("FirstName"));
				detail.setLastName(rs.getString("LastName"));
				detail.setText(rs.getString("Text"));
				return detail;
			}
		});

	}

}
