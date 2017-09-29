package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * POJO table MASTER_OPTION_ANSWER
 * @created Jan 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_OPTION_ANSWER")
public class MasterOptionAnswer implements Serializable {

	@Id
	@Column(name="OPTION_ANSWER_ID")
	private int optionAnswerId;
	@Column(name="OPTION_ANSWER_NAME")
	private String optionAnswerName;
	@Column(name="TABLE_NAME")
	private String tableName;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="GROUP_PARAM_ID")
	private MasterGroupParam groupParam;
	
	public int getOptionAnswerId() {
		return optionAnswerId;
	}
	public void setOptionAnswerId(int optionAnswerId) {
		this.optionAnswerId = optionAnswerId;
	}
	public String getOptionAnswerName() {
		return optionAnswerName;
	}
	public void setOptionAnswerName(String optionAnswerName) {
		this.optionAnswerName = optionAnswerName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public MasterGroupParam getGroupParam() {
		return groupParam;
	}
	public void setGroupParam(MasterGroupParam groupParam) {
		this.groupParam = groupParam;
	}
}
