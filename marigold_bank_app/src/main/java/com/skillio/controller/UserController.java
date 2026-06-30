package com.skillio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.model.User;
import com.skillio.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService us;
	
	@PostMapping("/add-user")
	public User addUser(@RequestBody User user) {
		return us.addUser(user);
	}
}
