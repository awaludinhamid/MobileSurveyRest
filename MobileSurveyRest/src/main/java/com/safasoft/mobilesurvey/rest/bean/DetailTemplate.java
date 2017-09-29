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
 * POJO table DETAIL_TEMPLATE
 * @created Jan 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="DETAIL_TEMPLATE")
public class DetailTemplate implements Serializable {

	@Id
	@Column(name="DETAIL_TEMP_ID")
	private int detailTempId;
	@Column(name="sort")
	private int sort;
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
	@ManyToOne
	@JoinColumn(name="TEMP_ID")
	private MasterTemplate template;
	@ManyToOne
	@JoinColumn(name="QUEST_GROUP_ID")
	private MasterQuestionGroup questionGroup;
	
	public int getDetailTempId() {
		return detailTempId;
	}
	public void setDetailTempId(int detailTempId) {
		this.detailTempId = detailTempId;
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
	public MasterTemplate getTemplate() {
		return template;
	}
	public void setTemplate(MasterTemplate template) {
		this.template = template;
	}
	public MasterQuestionGroup getQuestionGroup() {
		return questionGroup;
	}
	public void setQuestionGroup(MasterQuestionGroup questionGroup) {
		this.questionGroup = questionGroup;
	}
}
