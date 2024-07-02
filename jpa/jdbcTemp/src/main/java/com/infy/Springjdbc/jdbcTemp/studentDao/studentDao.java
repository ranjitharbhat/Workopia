package com.infy.Springjdbc.jdbcTemp.studentDao;

import java.util.List;

import com.infy.Springjdbc.jdbcTemp.entity.student1;

public interface studentDao {
public int insert(student1 student);
public int update(student1 student);
public int delete(int studentId);
public student1 getstudent(int studentId);
public List<student1> getallstudent();
}
