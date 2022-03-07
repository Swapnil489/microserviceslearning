package com.basic.userservice.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basic.userservice.model.User;

@RestController
public class UserServiceController {
	
	@RequestMapping(path="/user/{user_id}", method=RequestMethod.GET)
	public User getUser(@PathVariable int user_id) {
		System.out.println("In side Service call");
		User user = new User();
		user.setUser_id(user_id);
		user.setName("Swapnil");
		user.setType(1);
		
		return user;
		
	}

}
