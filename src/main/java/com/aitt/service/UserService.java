package com.aitt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitt.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao dao;

	public String getUserNameById(Integer userId) {
		String name = dao.findName(userId);
		return name;
	}
	
//how to test private method using reflection
	
//	private String getUserDob() {
//	String dob="26-03-1990";
//	return dob;	
//	}
	
	
	//how to test private method using powermock
	
	 String getUserDob() {
		String dob="26-03-1990";
		return dob;	
		}
}
