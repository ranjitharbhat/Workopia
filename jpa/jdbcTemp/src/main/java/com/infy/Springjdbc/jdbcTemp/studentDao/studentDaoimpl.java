package com.infy.Springjdbc.jdbcTemp.studentDao;



import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.infy.Springjdbc.jdbcTemp.entity.student1;

public class studentDaoimpl implements studentDao{

	JdbcTemplate jdbcTemp;
	
	public int insert(student1 student) {
		String query="insert into student1 values(?,?,?)";
		int res=jdbcTemp.update(query,student.getId(),student.getName(),student.getCity());
		
		return res;
	}
	

	public int update(student1 studentId) {
		String query="update student1 set name=? where id=?";
		int res=jdbcTemp.update(query,studentId.getName(),studentId.getId());
		
		return res;
	}

	


	public int delete(int studentId) {
		String query="delete from student1 where id=?";
		int res=jdbcTemp.update(query,studentId);
		
		return res;
	}
	
	
	
	
	
	public student1 getstudent(int studentId) {
		String query="select * from student1 where id=?";
		RowMapper<student1> rowmap=new RowMapperimpl();
		
		student1 stud=jdbcTemp.queryForObject(query, rowmap,studentId);
		return stud;
	}
	
	

	
	public List<student1> getallstudent() {
		String query="select * from student1";
		List<student1> stude=jdbcTemp.query(query, new RowMapperimpl());
		return stude;
	}
	
	
	
	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}

	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	
	}
}


