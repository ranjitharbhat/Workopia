package com.infy.Annotation.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("singleton")
public class Emp {
Address address;

public Address getAddress() {
	return address;
}
@Autowired
public void setAddress(Address address) {
	this.address = address;
}

public Emp(Address address) {
	super();
	this.address = address;
}

public Emp() {
	super();
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}


}
