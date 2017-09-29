package com.safasoft.mobilesurvey.rest.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.safasoft.mobilesurvey.rest.bean.MasterUser;
import com.safasoft.mobilesurvey.rest.bean.MobileUserLocation;
import com.safasoft.mobilesurvey.rest.bean.support.RestResponseBean;
import com.safasoft.mobilesurvey.rest.dto.MasterUserDTO;
import com.safasoft.mobilesurvey.rest.security.SessionHolder;
import com.safasoft.mobilesurvey.rest.security.UserInfoBean;
import com.safasoft.mobilesurvey.rest.service.MasterUserService;
import com.safasoft.mobilesurvey.rest.service.MobileUserLocationService;

/**
 * Login and authentication controller
 * @created Jun 19, 2016
 * @author awal
 */
@RestController
public class LoginController {

	@Autowired
	private HttpServletRequest request;
	
	//Service injection list
	@Autowired
	private MasterUserService muServ;	
	@Autowired
	private MobileUserLocationService mulServ;
	
	//container of user session
	private final Map<String,UserInfoBean> sessionMap = SessionHolder.getSessionMap();
	
	/**
	 * Post login credential to be marked as authorized user
	 * @param userReq, user credential data in form of MasterUserDTO
	 * @return container contain logged user
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public RestResponseBean login(@RequestBody MasterUserDTO userReq) {
		
		//initialize new container
		//assign user 
		RestResponseBean rrb = new RestResponseBean();
		MasterUserDTO userResp = muServ.getByUserPassAndImeiDTO(
				userReq.getUserCode(), userReq.getUserPassword(), userReq.getUserImei());
		
		//if verified check logged status, otherwise failing the authorization
		if(userResp == null) {
			rrb.setStatus(10);
			rrb.setStatusName("no user found");
		} else {
			boolean isLogging = false;
			
			//if sender have logged then stop the next process, otherwise continue the process
			/*for(String key : sessionMap.keySet()) {
        		if(sessionMap.get(key).getUserId() == userResp.getUserId()) {
        			rrb.setStatus(12);
        			rrb.setStatusName("currently logging");
        			// hey, u're still logging, logout first
        			isLogging = true;
        			break;
        		}
	        }*/
      if(!isLogging) {
      	
      	//append user to the session holder
				/*UserInfoBean uib = new UserInfoBean();
				uib.setUserId(userResp.getUserId());
				uib.setTimeIn(Calendar.getInstance());
				sessionMap.put(request.getSession().getId(), uib);
				rrb.setContents(userResp);*/
      	
      	//update user location based on login position
      	MobileUserLocation mul = mulServ.getByUser(userResp.getUserId());
      	if(mul == null) {
      		mul = new MobileUserLocation();
      		mul.setCreatedBy(userResp.getUserCode());
        	mul.setUser(muServ.getById(userResp.getUserId()));
      	}
      	mul.setUpdatedBy(userReq.getUserCode());
      	mul.setGpsLatitude(userReq.getGpsLatitude());
      	mul.setGpsLongitude(userReq.getGpsLongitude());
      	mul.setIsGps(userReq.getIsGps());
      	mul = mulServ.save(mul);
      	userResp.setGpsLatitude(mul.getGpsLatitude());
      	userResp.setGpsLongitude(mul.getGpsLongitude());
      	userResp.setIsGps(mul.getIsGps());
      }
		}
		rrb.setContents(userResp);
		return rrb;
	}
	
	/**
	 * Logout process
	 * @param user
	 * @return container contain logout user
	 */
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public RestResponseBean logout(@RequestBody MasterUser user) {
		RestResponseBean rrb = new RestResponseBean();
		int userId = user.getUserId();
		for(String key : sessionMap.keySet()) {
    		if(sessionMap.get(key).getUserId() == userId) {
    			if(key.equals(request.getSession().getId())) {
	    			// see u
	    			sessionMap.remove(key);
	    			rrb.setStatus(1);
	    			rrb.setStatusName("logout success");
	    			Map<String,Object> logoutObj = new HashMap<String, Object>();
	    			logoutObj.put("logoutUserId", userId);
	    			logoutObj.put("logoutSessionId", key);
	    			rrb.setContents(logoutObj);
    			} else {
    				rrb.setStatus(14);
	    			rrb.setStatusName("logout must be in login session");
    			}
    			return rrb;
    		}
        }
		rrb.setStatus(13);
		rrb.setStatusName("have logout");	
		rrb.setContents(user);
		return rrb;
	}
	
	/**
	 * Change user password
	 * @param userReq, user credential data in form of MasterUserDTO
	 * @return container contain changed user
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	@RequestMapping(value = "/user/password", method = RequestMethod.POST)
	public RestResponseBean changePassword(@RequestBody MasterUserDTO userReq)
			throws InvocationTargetException, IllegalAccessException {
		RestResponseBean rrb = new RestResponseBean();
		MasterUser user = muServ.getById(userReq.getUserId());
		user.setUserPassword(userReq.getUserPassword());
		user = muServ.save(user);
		BeanUtils.copyProperties(userReq, user);
		rrb.setContents(userReq);
		return rrb;
	}
}
