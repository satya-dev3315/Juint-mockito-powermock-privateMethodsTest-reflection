package com.aitt.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public String findName(Integer userId) {
		return "Eric";
	}


}
