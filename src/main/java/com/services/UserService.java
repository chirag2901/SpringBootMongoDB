package com.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.UserBean;
@Service
public interface UserService {
	UserBean addUser(UserBean userbean);
	List<UserBean> getAllUSers();
}
