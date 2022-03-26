package com.basic.registrationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basic.registrationservice.model.Registration;
import com.basic.registrationservice.model.User;
import com.basic.registrationservice.service.util.UserServiceUtil;


@RestController
public class RegistrationController {
	
	@Autowired
	public UserServiceUtil userServiceUtil;
	
	@Value("${myproperty.min}")
	private String minValue;
	
	@Value("${myproperty.max}")
	private String maxValue;

	@RequestMapping(path="/registration/{username}/{registername}", method= RequestMethod.GET)
		public Registration getRegistration(@PathVariable String username,@PathVariable String registername) {
			
			Registration registration = new Registration();
			registration.setName(registername);
			registration.setUsername("Swapnil489");
			registration.setPassword("1234");
			System.out.println("  Min value is  " + minValue);
			System.out.println("  max value is  " + maxValue);
			
			User user = userServiceUtil.getUserDetails("1");
			registration.setUser(user);
			/*
			 * User user = new User(); user.setUser_id(1); user.setName("Swapnil");
			 * user.setType(1);
			 */
			
			return registration;
			
		}
}
