package com.infy.Annotation.Autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Address {
private String street;
private String city;
public String getStreet() {
	return street;
}
@Value("anaga")
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
@Value("acita")
public void setCity(String city) {
	this.city = city;
}
public Address() {
	super();
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + "]";
}



}
