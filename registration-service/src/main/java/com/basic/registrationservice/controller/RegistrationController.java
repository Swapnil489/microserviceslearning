package com.basic.registrationservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basic.registrationservice.model.Registration;
import com.basic.registrationservice.model.User;


@RestController
public class RegistrationController {

	@RequestMapping(path="/registration/{username}/{registername}", method= RequestMethod.GET)
		public Registration getRegistration(@PathVariable String username,@PathVariable String registername) {
			
			User user = new User();
			user.setUser_id(1);
			user.setName("Swapnil");
			user.setType(1);
			
			Registration registration = new Registration();
			registration.setName(registername);
			registration.setUsername("Swapnil489");
			registration.setPassword("1234");
			registration.setUser(user);
			
			return registration;
			
		}
}
