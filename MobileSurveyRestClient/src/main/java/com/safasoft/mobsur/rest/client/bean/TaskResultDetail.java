package com.safasoft.mobsur.rest.client.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.safasoft.mobsur.rest.client.bean.support.RecordAuditBean;

@SuppressWarnings("serial")
@Entity
@Table(name="MBS_TASK_RESULT_DETAIL")
public class TaskResultDetail extends RecordAuditBean {

	@Id
	@Column(name="TASK_RESULT_DET_ID")
	private int taskResultDetId;
	@Column(name="TASK_RESULT_ID")
	private int taskResultId;
	@Column(name="QUEST_ID")
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
