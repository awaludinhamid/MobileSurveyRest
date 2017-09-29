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
 * POJO table DETAIL_QUESTION_GROUP
 * @created Jan 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="DETAIL_QUESTION_GROUP")
public class DetailQuestionGroup implements Serializable {

	@Id
	@Column(name="DETAIL_QUEST_GROUP_ID")
	private int detailQuestGroupId;
	@Column(name="sort")
	private int sort;
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
	@ManyToOne
	@JoinColumn(name="QUEST_ID")
	private MasterQuestion question;
	@ManyToOne
	@JoinColumn(name="QUEST_GROUP_ID")
	private MasterQuestionGroup questionGroup;
	
	public int getDetailQuestGroupId() {
		return detailQuestGroupId;
	}
	public void setDetailQuestGroupId(int detailQuestGroupId) {
		this.detailQuestGroupId = detailQuestGroupId;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
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
	public MasterQuestion getQuestion() {
		return question;
	}
	public void setQuestion(MasterQuestion question) {
		this.question = question;
	}
	public MasterQuestionGroup getQuestionGroup() {
		return questionGroup;
	}
	public void setQuestionGroup(MasterQuestionGroup questionGroup) {
		this.questionGroup = questionGroup;
	}
}
