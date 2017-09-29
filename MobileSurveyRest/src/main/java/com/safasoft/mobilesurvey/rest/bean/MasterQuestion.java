package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * POJO table MASTER_QUESTION
 * @created Jan 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_QUESTION")
public class MasterQuestion implements Serializable{

	@Id
	@Column(name="QUEST_ID")
	private int questId;
	@Column(name="QUEST_LABEL")
	private String questLabel;
	@Column(name="MAX_LENGTH")
	private Integer maxLength;
	@Column(name="IS_MANDATORY")
	private String isMandatory;
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
	@ManyToOne
	@JoinColumn(name="COY_ID")
	private MasterCompany company;
	@ManyToOne
	@JoinColumn(name="ANSWER_TYPE_ID")
	private MasterAnswerType answerType;
	@ManyToOne
	@JoinColumn(name="OPTION_ANSWER_ID")
	private MasterOptionAnswer optionAnswer;
	
	public int getQuestId() {
		return questId;
	}
	public void setQuestId(int questId) {
		this.questId = questId;
	}
	public String getQuestLabel() {
		return questLabel;
	}
	public void setQuestLabel(String questLabel) {
		this.questLabel = questLabel;
	}
	public Integer getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}
	public String getIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(String isMandatory) {
		this.isMandatory = isMandatory;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public MasterCompany getCompany() {
		return company;
	}
	public void setCompany(MasterCompany company) {
		this.company = company;
	}
	public MasterAnswerType getAnswerType() {
		return answerType;
	}
	public void setAnswerType(MasterAnswerType answerType) {
		this.answerType = answerType;
	}
	public MasterOptionAnswer getOptionAnswer() {
		return optionAnswer;
	}
	public void setOptionAnswer(MasterOptionAnswer optionAnswer) {
		this.optionAnswer = optionAnswer;
	}
	
}
