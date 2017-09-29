package com.safasoft.mobilesurvey.rest.dto;

/**
 * DTO table DETAIL_QUESTION_GROUP
 * @created Jan 13, 2017
 * @author awal
 */
public class DetailQuestionGroupDTO {
	
	private int detailQuestGroupId;
	private Integer sort;
	private int questGroupId;
	private String questGroupLabel;
	private int questId;
	private String questLabel;
	private Integer maxLength;
	private String isMandatory;
	
	public int getDetailQuestGroupId() {
		return detailQuestGroupId;
	}
	public void setDetailQuestGroupId(int detailQuestGroupId) {
		this.detailQuestGroupId = detailQuestGroupId;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
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
}
