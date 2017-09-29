package com.safasoft.mobilesurvey.rest.dto.client;

import com.safasoft.mobilesurvey.rest.dto.support.ControllerAuditBean;

/**
 * DTO table MOBILE_TASK_RESULT_DETAIL on client side
 * 
 * @author awal
 * @created Feb 20, 2017
 */
public class MobileTaskResultDetailDTOClient extends ControllerAuditBean {
	
	private int taskResultDetId;
	//task result
	private int taskResultId;
	//question
	private int questId;
	
	public int getTaskResultDetId() {
		return taskResultDetId;
	}
	public void setTaskResultDetId(int taskResultDetId) {
		this.taskResultDetId = taskResultDetId;
	}
	public int getTaskResultId() {
		return taskResultId;
	}
	public void setTaskResultId(int taskResultId) {
		this.taskResultId = taskResultId;
	}
	public int getQuestId() {
		return questId;
	}
	public void setQuestId(int questId) {
		this.questId = questId;
	}

}
