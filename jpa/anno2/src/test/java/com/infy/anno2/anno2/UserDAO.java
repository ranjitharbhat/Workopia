package com.infy.anno2.anno2;

import java.util.List;

public interface UserDAO<object> {
public object save(Object entity);

public object get(Integer id);

public List<User> findAll();

User save(User user);
}
