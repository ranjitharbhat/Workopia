package com.infy.anno1.anno1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(Appcon1.class);
		CommuService c1=con.getBean(CommuService.class);
		c1.startcomm("welcome");

	}

}
