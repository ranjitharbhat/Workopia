package com.infy.aop1.model;

public class Circle {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	System.out.println("circle setter called");
	throw(new RuntimeException());
}



}
