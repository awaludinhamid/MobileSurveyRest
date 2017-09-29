package com.safasoft.mobilesurvey.rest.controller.resource;

import java.util.Calendar;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.safasoft.mobilesurvey.rest.client.wrapper.UserWrapper;
import com.safasoft.mobilesurvey.rest.dto.MasterUserDTO;
import com.safasoft.mobilesurvey.rest.dto.client.MasterUserDTOClient;
import com.safasoft.mobilesurvey.rest.security.SessionHolder;
import com.safasoft.mobilesurvey.rest.security.UserInfoBean;
import com.safasoft.mobilesurvey.rest.service.MasterUserService;

/**
 * Container of user which extends base resource
 * @author awal
 */
@RestController
@RequestMapping("/client/user")
public class UserResource extends BaseResource<UserWrapper> {

	//inject request and user service 
	@Autowired
	private HttpServletRequest request;	
	@Autowired
	private MasterUserService muServ;
	
	//container of user session
	private final Map<String,UserInfoBean> sessionMap = SessionHolder.getSessionMap();

	/**
	 * Post login credential
	 * Success: allowed user to access various resource and add the session to container for further use
	 * Failed: denied user access the resource
	 * @param user, user credential
	 * @return container contains logged user
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<MasterUserDTOClient> login(@RequestBody MasterUserDTOClient user) {
		MasterUserDTOClient userLogin = muServ.getByUserPassAndImeiDTOClient(
				user.getUserCode(), user.getUserPassword(), user.getUserImei()); 
		if(userLogin == null) {
			return new ResponseEntity<MasterUserDTOClient>(HttpStatus.UNAUTHORIZED);
		} else {
      for(String key : sessionMap.keySet()) {
    		if(sessionMap.get(key).getUserId() == userLogin.getUserId()) {    			
    			// hey, u're still logging, logout first
    			return new ResponseEntity<MasterUserDTOClient>(HttpStatus.IM_USED);
    		}
      }
			UserInfoBean uib = new UserInfoBean();
			uib.setUserId(userLogin.getUserId());
			uib.setTimeIn(Calendar.getInstance());
			sessionMap.put(request.getSession().getId(), uib);
			return new ResponseEntity<MasterUserDTOClient>(userLogin, HttpStatus.OK);
		}
	}
	
	/**
	 * Close the session
	 * Aware of the possibility of multi session or no user session
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public ResponseEntity<MasterUserDTO> logout(@RequestBody MasterUserDTO user) {
		int userId = user.getUserId();
		for(String key : sessionMap.keySet()) {
  		if(sessionMap.get(key).getUserId() == userId) {
  			if(key.equals(request.getSession().getId())) {
    			// see u
    			sessionMap.remove(key);
    			return new ResponseEntity<MasterUserDTO>(user,HttpStatus.OK);
  			} else {
  				return new ResponseEntity<MasterUserDTO>(HttpStatus.TOO_MANY_REQUESTS);
  			}
  		}
    }
		return new ResponseEntity<MasterUserDTO>(HttpStatus.NOT_FOUND);
	}
}
