package com.infy.Configuration.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		Employee employee=(Employee) con.getBean("employee");
System.out.println(employee.toString());
	}

}
