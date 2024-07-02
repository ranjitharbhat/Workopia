package com.infy.GoodJpi.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.GoodJpi.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
