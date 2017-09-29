package com.safasoft.mobilesurvey.rest.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.RecordAuditBean;

/**
 * POJO table MOBILE_TASK_RESULT_DETAIL
 * @created Feb 13, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MOBILE_TASK_RESULT_DETAIL")
public class MobileTaskResultDetail extends RecordAuditBean {

	@Id
	@Column(name="TASK_RESULT_DET_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int taskResultDetId;
	@ManyToOne
	@JoinColumn(name="TASK_RESULT_ID")
	private MobileTaskResult taskResult;
	@ManyToOne
	@JoinColumn(name="QUEST_ID")
	private MasterQuestion question;
	@OneToMany(mappedBy="taskResultDetail",cascade=CascadeType.ALL)
	private Set<MobileTaskResultDetailList> taskResultDetailLists;
	
	public int getTaskResultDetId() {
		return taskResultDetId;
	}
	public void setTaskResultDetId(int taskResultDetId) {
		this.taskResultDetId = taskResultDetId;
	}
	public MobileTaskResult getTaskResult() {
		return taskResult;
	}
	public void setTaskResult(MobileTaskResult taskResult) {
		this.taskResult = taskResult;
	}
	public MasterQuestion getQuestion() {
		return question;
	}
	public void setQuestion(MasterQuestion question) {
		this.question = question;
	}
	public Set<MobileTaskResultDetailList> getTaskResultDetailLists() {
		return taskResultDetailLists;
	}
	public void setTaskResultDetailLists(Set<MobileTaskResultDetailList> taskResultDetailLists) {
		this.taskResultDetailLists = taskResultDetailLists;
	}
}
