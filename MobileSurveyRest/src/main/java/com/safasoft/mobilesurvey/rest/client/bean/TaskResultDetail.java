package com.safasoft.mobilesurvey.rest.client.bean;

import com.safasoft.mobilesurvey.rest.client.bean.support.RecordAuditBean;

/**
 * POJO for Task Result Detail entity
 * @created Jan 9, 2017
 * @author awal
 */
public class TaskResultDetail extends RecordAuditBean {

	private int taskResultDetId;
	private int taskResultId;
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
