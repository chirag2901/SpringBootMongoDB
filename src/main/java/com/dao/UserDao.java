package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;
import com.services.UserService;

@Repository
public class UserDao implements UserService {

	@Autowired
	MongoTemplate mongoTemplate;
	//jdbctemplate
	@Override
	public UserBean addUser(UserBean userbean) {
		// TODO Auto-generated method stub
		return mongoTemplate.save(userbean);
	}
	@Override
	public List<UserBean> getAllUSers() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(UserBean.class);
	}
	
}
