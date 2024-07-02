package com.infy.Configuration.Configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	private int id;
	private String name;

	
	private List<String> phones;
	
	public int getId() {
		return id;
	}
@Value("101")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	@Value("ram")
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}
@Value("#{temp}")
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phones=" + phones + "]";
	}
	

}
