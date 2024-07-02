package com.infy.jd.ormspring.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.infy.jd.ormspring.entity.Student;

public class studentDao {
private HibernateTemplate hibernateTemplate;

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}


@Transactional
public int insert(Student student) {
	Integer i=(Integer) this.hibernateTemplate.save(student);
	return i;
}

public Student getStudentId(int studentId)
{
	Student student=this.hibernateTemplate.get(Student.class,studentId);
	return student;
}
public List<Student> getAllStudents(){
	 List<Student> students=this.hibernateTemplate.loadAll(Student.class);
	 return students;
}
@Transactional
public void deleteStudent(int studentId)
{
	Student s=this.hibernateTemplate.get(Student.class,studentId);
	this.hibernateTemplate.delete(s);
}
@Transactional
public void update(Student student)
{
	this.hibernateTemplate.update(student);
}

}
