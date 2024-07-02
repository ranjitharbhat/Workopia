package com.infy.anno2.anno2;

import org.springframework.stereotype.Component;

@Component
public class User {
private int id;
private String name;
public User() {
	
}
protected User(int id, String name) {
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + "]";
}

}
