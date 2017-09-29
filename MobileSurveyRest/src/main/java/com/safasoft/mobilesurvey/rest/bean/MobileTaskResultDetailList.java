package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.RecordAuditBean;

/**
 * POJO table MOBILE_TASK_RESULT_DETAIL_LIST
 * @created Feb 13, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MOBILE_TASK_RESULT_DETAIL_LIST")
public class MobileTaskResultDetailList extends RecordAuditBean {

	@Id
	@Column(name="TASK_RESULT_DET_LIST_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	@ManyToOne
	@JoinColumn(name="TASK_RESULT_DET_ID")
	private MobileTaskResultDetail taskResultDetail;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IMAGE_ID")
	private MobileTaskResultImage taskResultImage;
	
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
	public MobileTaskResultDetail getTaskResultDetail() {
		return taskResultDetail;
	}
	public void setTaskResultDetail(MobileTaskResultDetail taskResultDetail) {
		this.taskResultDetail = taskResultDetail;
	}
	public MobileTaskResultImage getTaskResultImage() {
		return taskResultImage;
	}
	public void setTaskResultImage(MobileTaskResultImage taskResultImage) {
		this.taskResultImage = taskResultImage;
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
	public void setFinAnswerText(String finAanswerText) {
		this.finAnswerText = finAanswerText;
	}
	public String getFlagFinAnswerUse() {
		return flagFinAnswerUse;
	}
	public void setFlagFinAnswerUse(String flagFinAnswerUse) {
		this.flagFinAnswerUse = flagFinAnswerUse;
	}
}
