package com.safasoft.mobilesurvey.rest.security;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Container where to hold user sessions
 * use singleton pattern so only one holder instance available in the application
 * @created Aug 13, 2016
 * @author awal
 */
public class SessionHolder {

		//user sessions holder
		//synchronizing collection so each session is unique
    private static final Map<String,UserInfoBean> sessionMap =
            Collections.synchronizedMap(new LinkedHashMap<String,UserInfoBean>());

    /**
     * Get session holder
     * @return session holder
     */
    public static Map<String, UserInfoBean> getSessionMap() {
        return sessionMap;
    }

    //Disable constructor, must get map through the method
    private SessionHolder() {
    }

 }
