package com.infy.Springjdbc.jdbcTemp.studentDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infy.Springjdbc.jdbcTemp.entity.student1;

public class RowMapperimpl implements RowMapper<student1>{

	
	public student1 mapRow(ResultSet rs, int rowNum) throws SQLException {
	student1 stu=new student1();
	stu.setId(rs.getInt(1));
	stu.setName(rs.getString(2));
	stu.setCity(rs.getString(3));
		return stu;
	}

}
