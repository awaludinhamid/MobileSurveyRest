package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * POJO table MASTER_ANSWER_TYPE
 * @created Jan 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_ANSWER_TYPE")
public class MasterAnswerType implements Serializable {

	@Id
	@Column(name="ANSWER_TYPE_ID")
	private int answerTypeId;
	@Column(name="ANSWER_TYPE_NAME")
	private String answerTypeName;
	
	public int getAnswerTypeId() {
		return answerTypeId;
	}
	public void setAnswerTypeId(int answerTypeId) {
		this.answerTypeId = answerTypeId;
	}
	public String getAnswerTypeName() {
		return answerTypeName;
	}
	public void setAnswerTypeName(String answerTypeName) {
		this.answerTypeName = answerTypeName;
	}
}
