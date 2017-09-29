package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.RecordAuditBean;

/**
 * POJO table MASTER_TASK_STATUS
 * @created Feb 7, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_TASK_STATUS")
public class MasterTaskStatus extends RecordAuditBean {

	@Id
	@Column(name="TASK_STATUS_ID")
	private int taskStatusId;
	@Column(name="TASK_STATUS_CODE")
	private String taskStatusCode;
	@Column(name="TASK_STATUS_NAME")
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
