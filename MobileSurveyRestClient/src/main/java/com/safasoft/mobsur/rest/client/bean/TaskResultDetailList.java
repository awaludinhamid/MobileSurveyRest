package com.safasoft.mobsur.rest.client.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.safasoft.mobsur.rest.client.bean.support.RecordAuditBean;

@SuppressWarnings("serial")
@Entity
@Table(name="MBS_TASK_RESULT_DETAIL_LIST")
public class TaskResultDetailList extends RecordAuditBean {

	@Id
	@Column(name="TASK_RESULT_DET_LIST_ID")
	private int taskResultDetListId;
	@Column(name="ANSWER_ID")
	private Integer answerId;
	@Column(name="ANSWER_TEXT")
	private String answerText;
	@Column(name="OLD_ANSWER_ID")
	private Integer oldAnswerId;
	@Column(name="OLD_ANSWER_TEXT")
	private String oldAnswerText;
	@Column(name="EDIT_ANSWER_ID")
	private Integer editAnswerId;
	@Column(name="EDIT_ANSWER_TEXT")
	private String editAnswerText;
	@Column(name="FIN_ANSWER_ID")
	private Integer finAnswerId;
	@Column(name="FIN_ANSWER_TEXT")
	private String finAnswerText;
	@Column(name="FLAG_FIN_ANSWER_USE")
	private String flagFinAnswerUse;
	@Column(name="TASK_RESULT_DET_ID")
	private int taskResultDetId;
	@Column(name="IMAGE_ID")
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
