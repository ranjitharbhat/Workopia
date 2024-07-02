package com.infy.reference.ConstructorArg;

public class Address {
private int dno;
private String street;
private String city;


public Address(int dno, String street, String city) {
	super();
	this.dno = dno;
	this.street = street;
	this.city = city;
}


public Address() {
	super();
}


@Override
public String toString() {
	return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
}


}
