package com.infy.anno2.anno2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appcon2 {

	@Bean
	public User user() {
		return new User();
	}
	
	@Bean
	public UserService userse() {
		return new UserService();
	}
	
	@Bean
	public UserRepo userrep() {
		return new UserRepo();
	}
}
