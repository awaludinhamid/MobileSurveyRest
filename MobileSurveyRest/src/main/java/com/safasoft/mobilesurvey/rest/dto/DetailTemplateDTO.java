package com.safasoft.mobilesurvey.rest.dto;

/**
 * DTO table DETAIL_TEMPLATE
 * @created Jan 15, 2017
 * @author awal
 */
public class DetailTemplateDTO {

	private int detailTempId;
	private int sort;
	private int tempId;
	private String tempLabel;
	private int questGroupId;
	private String questGroupLabel;
	
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
	public int getTempId() {
		return tempId;
	}
	public void setTempId(int tempId) {
		this.tempId = tempId;
	}
	public String getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(String tempLabel) {
		this.tempLabel = tempLabel;
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
	
}
