package com.infy.Autowiring.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
Car car;
Address address;


public Car getCar() {
	return car;
}
@Autowired
public void setCar(Car car) {
	this.car = car;
}

public Address getAddress() {
	return address;
}
@Autowired
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Person [car=" + car + ", address=" + address + "]";
}





}
