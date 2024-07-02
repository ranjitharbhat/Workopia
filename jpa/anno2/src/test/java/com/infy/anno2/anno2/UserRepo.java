package com.infy.anno2.anno2;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepo implements UserDAO<User>{
	
	private Map<Integer, User> repository =new TreeMap<>();


	@Override
	public User save(User user) {
		return repository.put(user.getId(), user);
	}
	
	@Override
	public User get(Integer id) {
		return repository.get(id);
	}
	
	@Override
	public List<User> findAll(){
		return repository.entrySet()
				.stream().map(entry->entry.getValue())
				.collect(Collectors.toList());
	}

	@Override
	public User save(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
