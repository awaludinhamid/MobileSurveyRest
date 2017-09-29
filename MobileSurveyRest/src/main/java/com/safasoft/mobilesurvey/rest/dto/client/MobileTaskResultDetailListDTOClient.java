package com.safasoft.mobilesurvey.rest.dto.client;

import com.safasoft.mobilesurvey.rest.dto.support.ControllerAuditBean;

/**
 * DTO table MOBILE_TASK_RESULT_DETAIL_LIST on client side
 * 
 * @author awal
 * @created Feb 20, 2017
 */
public class MobileTaskResultDetailListDTOClient extends ControllerAuditBean {

	private int taskResultDetListId;
	private Integer answerId;
	private String answerText;
	private Integer oldAnswerId;
	private String oldAnswerText;
	private Integer editAnswerId;
	private String editAnswerText;
	private Integer finAnswerId;
	private String finAnswerText;
	private String flagFinAnswerUsed;
	//task result detail
	private int taskResultDetId;
	//task result image
	private Integer imageId;
	
	public int getTaskResultDetListId() {
		return taskResultDetListId;
	}
	public void setTaskResultDetListId(int taskResultDetListId) {
		this.taskResultDetListId = taskResultDetListId;
	}
	public Integer getAnswerId() {
		return answerId;
	}
	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public Integer getOldAnswerId() {
		return oldAnswerId;
	}
	public void setOldAnswerId(Integer oldAnswerId) {
		this.oldAnswerId = oldAnswerId;
	}
	public String getOldAnswerText() {
		return oldAnswerText;
	}
	public void setOldAnswerText(String oldAnswerText) {
		this.oldAnswerText = oldAnswerText;
	}
	public Integer getEditAnswerId() {
		return editAnswerId;
	}
	public void setEditAnswerId(Integer editAnswerId) {
		this.editAnswerId = editAnswerId;
	}
	public String getEditAnswerText() {
		return editAnswerText;
	}
	public void setEditAnswerText(String editAnswerText) {
		this.editAnswerText = editAnswerText;
	}
	public Integer getFinAnswerId() {
		return finAnswerId;
	}
	public void setFinAnswerId(Integer finAnswerId) {
		this.finAnswerId = finAnswerId;
	}
	public String getFinAnswerText() {
		return finAnswerText;
	}
	public void setFinAnswerText(String finAnswerText) {
		this.finAnswerText = finAnswerText;
	}
	public String getFlagFinAnswerUsed() {
		return flagFinAnswerUsed;
	}
	public void setFlagFinAnswerUsed(String flagFinAnswerUsed) {
		this.flagFinAnswerUsed = flagFinAnswerUsed;
	}
	public int getTaskResultDetId() {
		return taskResultDetId;
	}
	public void setTaskResultDetId(int taskResultDetId) {
		this.taskResultDetId = taskResultDetId;
	}
	public Integer getImageId() {
		return imageId;
	}
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

}
