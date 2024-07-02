package com.infy.GoodJpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.GoodJpi.Entity.User;
import com.infy.GoodJpi.Service.UserRepo;

@SpringBootApplication
public class GoodJpiApplication implements CommandLineRunner{
	@Autowired
	UserRepo userepo;
	public static void main(String[] args) {
		SpringApplication.run(GoodJpiApplication.class, args);
		
		
	}
	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		user.setName("anu");
		user.setCity("udupi");
		user.setStatus("Im a java programmer");
		
		
		
		
		User user1=new User();
		user1.setName("anu");
		user1.setCity("udupi");
		user1.setStatus("Im a java programmer");
		
		User user3=userepo.save(user);
		System.out.println(user3);
		
		User user2=userepo.save(user);
		System.out.println(user2);
		
	}

}
