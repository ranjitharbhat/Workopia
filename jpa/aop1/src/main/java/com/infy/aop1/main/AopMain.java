package com.infy.aop1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.aop1.service.ShapeService;

public class AopMain {
	 public static void main( String[] args )
	    {

	
ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
ShapeService shapeserv=(ShapeService) con.getBean("shapeservice");
System.out.println(shapeserv.getCir().getName());
shapeserv.getCir().setName("Dummy");
}
}
