package com.infy.jd.studentDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infy.jd.entity.employ;



public class Rowmapperimpl implements RowMapper<employ>{

	public employ mapRow(ResultSet rs, int rowNum) throws SQLException {
		employ em=new employ();
	em.setId(rs.getInt(1));
	em.setName(rs.getString(2));
	em.setCity(rs.getString(3));
	em.setSalary(rs.getInt(4));
		return em;
	}

}