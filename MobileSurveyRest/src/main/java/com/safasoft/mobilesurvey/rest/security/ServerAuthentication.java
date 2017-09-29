/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.safasoft.mobilesurvey.rest.security;

import java.util.Calendar;
import java.util.Map;

/**
 * User authentication when connect to server
 * @created Aug 13, 2016
 * @author awal
 */
public class ServerAuthentication {
    
		//hold the user sessions here
    private final Map<String,UserInfoBean> sessionMap = SessionHolder.getSessionMap();
    
    //time to expire user session
    //an hour in millisecond
    private final int EXPIRED_SESSION_TIME = 3600000; 
	
    /**
     * Validate user session
     * @param session , user session
     * @return session status (true/false)
     */
	public boolean isAuthentication(String session) {
		//
        for(String key : sessionMap.keySet()) {
        	if(key.equals(session)) {
        		if(Calendar.getInstance().compareTo(sessionMap.get(key).getTimeIn()) > EXPIRED_SESSION_TIME) {
        			sessionMap.remove(key);
        			return false;
        		}
        		// you're in
        		return true;
        	}
        }
        return false;
	}
}
