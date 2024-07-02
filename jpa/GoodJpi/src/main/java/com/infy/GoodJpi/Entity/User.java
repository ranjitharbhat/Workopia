package com.infy.GoodJpi.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_det")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
private Integer userId;
private String name;
private String city;
private String status;
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public User(String name, String city, String status) {
	super();
	this.name = name;
	this.city = city;
	this.status = status;
}



public User() {
	super();
}
@Override
public String toString() {
	return "User [userId=" + userId + ", name=" + name + ", city=" + city + ", status=" + status + "]";
}


}
