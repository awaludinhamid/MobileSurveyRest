package com.safasoft.mobsur.rest.client.main;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.safasoft.mobsur.rest.client.bean.OrderTask;
import com.safasoft.mobsur.rest.client.bean.User;
import com.safasoft.mobsur.rest.client.run.OrderTaskRun;
import com.safasoft.mobsur.rest.client.run.ResultCollectionRun;
import com.safasoft.mobsur.rest.client.run.UserRun;
import com.safasoft.mobsur.rest.client.util.ModulType;

public class Main {

	public static void main(String[] args) throws Exception {
		//log some informative think
		Logger logger = Logger.getLogger("others");
		
		// check argument before execute
		if(args.length != 6)
            throw new Exception(
                    "Usage parameter: [Rest URL] [Company Code] [Username] [Password] [IMEI] " +
            					"[Modul type to execute: 1=Post Task, 2=Get Result, 3=Get Master]");
		
		try {
		
		// variable
		RestTemplate restTemp = new RestTemplate(clientHttpRequestFactory());
		int modulType;
		try {
			modulType = Integer.parseInt(args[5]);
		} catch(NumberFormatException e) {
			modulType = 0;
			logger.error(e);
		}
		//
		String restUrl = args[0] + "/client";
		String coyCode = args[1];
		
		// login
		String userCode = args[2];
		String userPassword = DigestUtils.md5Hex(args[3]);
		String userImei = args[4];
		User user = new User();
		user.setUserCode(userCode);
		user.setUserPassword(userPassword);
		user.setUserImei(userImei);
		UserRun userRun = new UserRun(restTemp, restUrl, userCode, coyCode);
		if(userRun.runLogin(user) == HttpStatus.OK) {
			try {

				// post task
				if(modulType == ModulType.POST_TASK.getType()) {
					OrderTaskRun orderRun = new OrderTaskRun(restTemp, restUrl, userCode, coyCode);
					orderRun.runPost(true);
					logger.info("Order have posted: ");
					for(OrderTask order : orderRun.getRespEntity().getBody().getOrderTaskList())
						logger.info(order.getOrderId());
				}
				
				// get result
				if(modulType == ModulType.GET_RESULT.getType()) {
					ResultCollectionRun collRun = new ResultCollectionRun(restTemp, restUrl, userCode, coyCode);
					collRun.runGet(true);
					logger.info("Order have received: ");
					for(OrderTask order : collRun.getRespEntity().getBody().getOrderTaskList())
						logger.info(order.getOrderId());
				}
				
				// master
				if(modulType == ModulType.GET_MASTER.getType()) {
					// have not been implemented yet
				}
				
			} catch(Exception x) {
				logger.error(x);
			} finally {
				// force logout after login and execute some process,
				// to end connection and release resource
				user = userRun.getRespUser().getBody();
				userRun.runLogout(user);
			}
			}
		} catch(Exception x) {
			logger.error(x);
		}
	}
	
	private static ClientHttpRequestFactory clientHttpRequestFactory() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		return factory;
	}
}
