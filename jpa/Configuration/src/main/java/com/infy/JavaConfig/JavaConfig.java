package com.infy.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.infy.JavaConfig" )
public class JavaConfig {

	@Bean
	public Student getstudent() {
		Student student=new Student();
		return student;
	}
	
}
