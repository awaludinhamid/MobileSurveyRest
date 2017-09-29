package com.safasoft.mobilesurvey.rest.dto;

/**
 * DTO table MASTER_QUESTION
 * @created Jan 5, 2017
 * @author awal
 */
public class MasterQuestionDTO {

	private int questId;
	private String questLabel;
	private Integer maxLength;
	private String isMandatory;
	private int coyId;
	private String coyCode;
	private String coyName;
	private int answerTypeId;
	private String answerTypeName;
	private int optionAnswerId;
	private String tableName;
	private String optionAnswerName;
	private Integer groupParamId;
	private String groupParamCode;
	private String groupParamName;
	
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
	public Integer getGroupParamId() {
		return groupParamId;
	}
	public void setGroupParamId(Integer groupParamId) {
		this.groupParamId = groupParamId;
	}
	public String getGroupParamCode() {
		return groupParamCode;
	}
	public void setGroupParamCode(String groupParamCode) {
		this.groupParamCode = groupParamCode;
	}
	public String getGroupParamName() {
		return groupParamName;
	}
	public void setGroupParamName(String groupParamName) {
		this.groupParamName = groupParamName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	}
