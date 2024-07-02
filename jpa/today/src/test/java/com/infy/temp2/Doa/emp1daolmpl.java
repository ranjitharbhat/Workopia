package com.infy.temp2.Doa;

import org.springframework.jdbc.core.JdbcTemplate;

import infy.temp2.employee1;

public class emp1daolmpl implements employee1Dao{
	private JdbcTemplate jdbctemplate;
	@Override
	public int saveEmp(employee1 e) {
		String query="insert into stud values ('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
	    return jdbctemplate.update(query);
	}

	@Override
	public int updateEmp(employee1 e) {
		 String query="update stud set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
				    return jdbctemplate.update(query);
	}

	@Override
	public int deleteEmp(employee1 e) {
		
	}

}
