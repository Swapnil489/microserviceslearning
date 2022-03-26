package com.basic.userservice.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basic.userservice.configuration.PropertyConfiguration;
import com.basic.userservice.model.User;


@RestController

public class UserServiceController {
	
	Logger logger= LoggerFactory.getLogger(UserServiceController.class);
	
	@Value("${myproperty.min}")
	private String min;
	
	@Value("${myproperty.max}")
	private String max;
	
	@Autowired
	private PropertyConfiguration ownProperties;
	
	@RequestMapping(path="/user/{user_id}", method=RequestMethod.GET)
	public User getUser(@PathVariable int user_id) {
		System.out.println("In side Service call");
		User user = new User();
		user.setUser_id(user_id);
		user.setName("Swapnil");
		user.setType(1);

		logger.info("this is min log" + min );
		logger.info("this is max log" + max );
		
		
		logger.info("this is min from propertyclass log" + ownProperties.getMin());
		logger.info("this is max from propertyclass log" + ownProperties.getMax());
		
	
		System.out.println(" this is system out statement");
		
		return user;
		
	}

}
