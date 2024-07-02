package com.infy.anno2.anno2;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx=new AnnotationConfigApplicationContext(Appcon2.class);
		
		UserService userse=(UserService) ctx.getBean("userse");

		userse.save(new User(101,"john a"));
		userse.save(new User(102,"john b"));
		
		List<User> users=userse.findAll();
		users.forEach(System.out::println);
	}

}
