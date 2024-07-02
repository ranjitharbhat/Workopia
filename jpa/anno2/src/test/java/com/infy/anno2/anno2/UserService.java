package com.infy.anno2.anno2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
private UserRepo repo;


public List<User> findAll(){
	return repo.findAll();
	
}

public User save(User u) {
	return repo.save(u);
}
}
