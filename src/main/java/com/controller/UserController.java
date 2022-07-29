package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.UserBean;
import com.services.UserService;

@RestController
public class UserController {

	@Autowired 
	UserService service;
	
		@RequestMapping(value = "/adduser",consumes = MediaType.APPLICATION_JSON_VALUE)
		public UserBean adduser(@RequestBody UserBean userBean) {
			return service.addUser(userBean);
		}
		
		@RequestMapping(value = "/getusers")
		public List<UserBean> getAllUsers(){
			return service.getAllUSers();
		}
}
