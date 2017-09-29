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
 * POJO table MASTER_QUESTION_GROUP
 * @created Jan 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_QUESTION_GROUP")
public class MasterQuestionGroup implements Serializable {

	@Id
	@Column(name="QUEST_GROUP_ID")
	private int questGroupId;
	@Column(name="QUEST_GROUP_LABEL")
	private String questGroupLabel;
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
	@ManyToOne
	@JoinColumn(name="COY_ID")
	private MasterCompany company;
	
	public int getQuestGroupId() {
		return questGroupId;
	}
	public void setQuestGroupId(int questGroupId) {
		this.questGroupId = questGroupId;
	}
	public String getQuestGroupLabel() {
		return questGroupLabel;
	}
	public void setQuestGroupLabel(String questGroupLabel) {
		this.questGroupLabel = questGroupLabel;
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
	
}
