package com.safasoft.mobilesurvey.rest.client.bean;

import com.safasoft.mobilesurvey.rest.client.bean.support.RecordAuditBean;

/**
 * POJO for Task Result Detail List entity
 * @created Jan 9, 2017
 * @author awal
 */
public class TaskResultDetailList extends RecordAuditBean {

	private int taskResultDetListId;
	private Integer answerId;
	private String answerText;
	private Integer oldAnswerId;
	private String oldAnswerText;
	private Integer editAnswerId;
	private String editAnswerText;
	private Integer finAnswerId;
	private String finAnswerText;
	private String flagFinAnswerUse;
	private int taskResultDetId;
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
	public String getFlagFinAnswerUse() {
		return flagFinAnswerUse;
	}
	public void setFlagFinAnswerUse(String flagFinAnswerUse) {
		this.flagFinAnswerUse = flagFinAnswerUse;
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
