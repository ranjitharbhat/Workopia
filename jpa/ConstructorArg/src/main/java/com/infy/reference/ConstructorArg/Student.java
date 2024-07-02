	package com.infy.reference.ConstructorArg;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student  implements InitializingBean,DisposableBean{
private int id;
private String name;
private Address address;
private String course;


public Student(int id, String name, Address address, String course) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.course = course;
}


public Student() {
	super();
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", course=" + course + "]";
}

public void afterPropertiesSet() throws Exception
{
	System.out.println("hey with interface");
}
public void destroy() throws Exception
{
	System.out.println("bye cant disply");
}
}
