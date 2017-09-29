package com.safasoft.mobilesurvey.rest.dto;

/**
 * DTO table MASTER_QUESTION_GROUP
 * @created Jan 10, 2017
 * @author awal
 */
public class MasterQuestionGroupDTO {

	private int questGroupId;
	private String questGroupLabel;
	private int coyId;
	private String coyCode;
	private String coyName;
	
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
	public int getCoyId() {
		return coyId;
	}
	public void setCoyId(int coyId) {
		this.coyId = coyId;
	}
	public String getCoyCode() {
		return coyCode;
	}
	public void setCoyCode(String coyCode) {
		this.coyCode = coyCode;
	}
	public String getCoyName() {
		return coyName;
	}
	public void setCoyName(String coyName) {
		this.coyName = coyName;
	}
}
