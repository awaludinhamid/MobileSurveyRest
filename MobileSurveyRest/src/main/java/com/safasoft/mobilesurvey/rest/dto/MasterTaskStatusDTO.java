package com.safasoft.mobilesurvey.rest.dto;

/**
 * DTO table MASTER_TASK_STATUS
 * @created Jan 10, 2017
 * @author awal
 */
public class MasterTaskStatusDTO {
	
	private int taskStatusId;
	private String taskStatusCode;
	private String taskStatusName;
	
	public int getTaskStatusId() {
		return taskStatusId;
	}
	public void setTaskStatusId(int taskStatusId) {
		this.taskStatusId = taskStatusId;
	}
	public String getTaskStatusCode() {
		return taskStatusCode;
	}
	public void setTaskStatusCode(String taskStatusCode) {
		this.taskStatusCode = taskStatusCode;
	}
	public String getTaskStatusName() {
		return taskStatusName;
	}
	public void setTaskStatusName(String taskStatusName) {
		this.taskStatusName = taskStatusName;
	}
}
