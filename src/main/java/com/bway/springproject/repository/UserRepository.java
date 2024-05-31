package com.bway.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springproject.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	//for user login
	User findByUserNameAndPassword(String un, String psw);
	
	//check if user already exist
	User findByUserName(String un);
	
}
