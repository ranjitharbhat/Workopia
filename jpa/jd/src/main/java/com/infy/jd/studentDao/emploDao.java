package com.infy.jd.studentDao;

import java.util.List;

import com.infy.jd.entity.employ;



public interface emploDao {
	public int insert(employ emp);
	public int update(employ emp);
	public int delete(int empId);
	public employ getemploy(int empId);
	public List<employ> getallemploy();
}
