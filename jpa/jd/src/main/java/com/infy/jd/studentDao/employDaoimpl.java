package com.infy.jd.studentDao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.infy.jd.entity.employ;



public class employDaoimpl implements emploDao{

	JdbcTemplate jdbcTemp;

	public int insert(employ emp) {
		String query="insert into employ values(?,?,?,?)";
		int res=jdbcTemp.update(query,emp.getId(),emp.getName(),emp.getCity(),emp.getSalary());
		
		return res;
	}

	public int update(employ empId) {
		String query="update student1 set name=? where id=?";
		int res=jdbcTemp.update(query,empId.getName(),empId.getId());
		
		return res;
	}

	
	public int delete(int empId) {
		String query="delete from employ where id=?";
		int res=jdbcTemp.update(query,empId);
		
		return res;
	}


	public employ getemploy(int empId) {
		String query="select * from employ where id=?";
		RowMapper<employ> rowmap=new Rowmapperimpl();
		
		employ emp=jdbcTemp.queryForObject(query, rowmap,empId);
		return emp;
	}

	@Override
	public List<employ> getallemploy() {
		String query="select * from employ";
		List<employ> empl=jdbcTemp.query(query, new Rowmapperimpl());
		return empl;
	}


	
}
