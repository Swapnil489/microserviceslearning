package com.basic.registrationservice.service.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.basic.registrationservice.model.User;




@Service
//@Slf4J
public class UserServiceUtil {
	
	private String getUserUrl = "http://localhost:1001/user-service/user/";
	
	
	public RestTemplate restTemplate = new RestTemplate();
	
	public User getUserDetails(String userId) {
		
		
		
		try {
			URL userUrl =  new URL(getUserUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//userUrl.setPa
		
		getUserUrl = getUserUrl + userId;
		
		User user =  new User();
		ResponseEntity<User> getUserResponse = restTemplate.exchange(getUserUrl,HttpMethod.GET,null,User.class);
		user = getUserResponse.getBody();
		
	//	User user1 =  new User();
	//	ResponseEntity<User> getUserResponse1 = restTemplate.getForObject(null, null)
	//	user1 = getUserResponse1.getBody();
		
		User user2 =  new User();
		ResponseEntity<User> getUserResponse2 = restTemplate.exchange(getUserUrl,HttpMethod.GET,null,User.class);
		user2 = getUserResponse2.getBody();
		
		
		
		return user;	
	//	restTemplate.
		
		
	}
	
	

}
