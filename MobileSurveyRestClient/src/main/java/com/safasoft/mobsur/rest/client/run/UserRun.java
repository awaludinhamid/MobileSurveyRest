package com.safasoft.mobsur.rest.client.run;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.safasoft.mobsur.rest.client.bean.User;
import com.safasoft.mobsur.rest.client.service.UserService;
import com.safasoft.mobsur.rest.client.wrapper.UserWrapper;

public class UserRun extends BaseRun<UserWrapper,UserService> {

	private ResponseEntity<User> respUser;
	
	public UserRun(RestTemplate template, String uri, String userRun, String coyCode) {
		super(template, uri + "/user", userRun, coyCode);
		// TODO Auto-generated constructor stub
	}
	
	public HttpStatus runLogin(User user) {
  	//
  	logger.info("post request for login");
  	//  	  
  	respUser = template.postForEntity(uri + "/login", user, User.class);
  	HttpStatus status = respUser.getStatusCode(); 
  	//
  	logger.info(status.getReasonPhrase());
  	//
  	return status;
  }
	
	public HttpStatus runLogout(User user) {
  	//
  	logger.info("post request for logout");
  	//  	  
  	respUser = template.postForEntity(uri + "/logout", user, User.class);
  	HttpStatus status = respUser.getStatusCode(); 
  	//
  	logger.info(status.getReasonPhrase());
  	//
  	return status;
  }
	
	public ResponseEntity<User> getRespUser() {
		return respUser;
	}
	
}
