package com.safasoft.mobilesurvey.rest.dto;

import java.util.List;

import com.safasoft.mobilesurvey.rest.dto.support.ControllerAuditBean;

/**
 * DTO table MOBILE_TASK_RESULT_DETAIL
 * 
 * @author awal
 * @created Feb 20, 2017
 */
public class MobileTaskResultDetailDTO extends ControllerAuditBean {
	
	private int taskResultDetId;
	//task result
	private int taskResultId;
	//question
	private int questId;
	//result detail list
	private List<MobileTaskResultDetailListDTO> resultDetailLists;
	
	public int getQuestId() {
		return questId;
	}
	public void setQuestId(int questId) {
		this.questId = questId;
	}
	public List<MobileTaskResultDetailListDTO> getResultDetailLists() {
		return resultDetailLists;
	}
	public void setResultDetailLists(List<MobileTaskResultDetailListDTO> resultDetailLists) {
		this.resultDetailLists = resultDetailLists;
	}
	public int getTaskResultDetId() {
		return taskResultDetId;
	}
	public void setTaskResultDetId(int taskResultDetailId) {
		this.taskResultDetId = taskResultDetailId;
	}
	public int getTaskResultId() {
		return taskResultId;
	}
	public void setTaskResultId(int taskResultId) {
		this.taskResultId = taskResultId;
	}
}
