package com.safasoft.mobilesurvey.rest.dto;

import com.safasoft.mobilesurvey.rest.dto.support.ControllerAuditBean;

/**
 * DTO table MOBILE_TASK_RESULT_DETAIL_LIST
 * 
 * @author awal
 * @created Feb 20, 2017
 */
public class MobileTaskResultDetailListDTO extends ControllerAuditBean {

	private int taskResultDetListId;
	private Integer answerId;
	private String answerText;
	private Integer oldAnswerId;
	private String oldAnswerText;
	private Integer editAnswerId;
	private String editAnswerText;
	private Integer finAnswerId;
	private String finAnswerText;
	private String flagFinAnswerUse;
	//task result detail
	private int taskResultDetId;
	//task result image
	private Integer imageId;
	private byte[] image;
	private String imageStr64;
	//image text
	private String imageText;
	
	public Integer getAnswerId() {
		return answerId;
	}
	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public String getImageStr64() {
		return imageStr64;
	}
	public void setImageStr64(String imageStr64) {
		this.imageStr64 = imageStr64;
	}
	public String getImageText() {
		return imageText;
	}
	public void setImageText(String imageText) {
		this.imageText = imageText;
	}
	public Integer getOldAnswerId() {
		return oldAnswerId;
	}
	public void setOldAnswerId(Integer oldAnswerId) {
		this.oldAnswerId = oldAnswerId;
	}
	public String getOldAnswerText() {
		return oldAnswerText;
	}
	public void setOldAnswerText(String oldAnswerText) {
		this.oldAnswerText = oldAnswerText;
	}
	public Integer getEditAnswerId() {
		return editAnswerId;
	}
	public void setEditAnswerId(Integer editAnswerId) {
		this.editAnswerId = editAnswerId;
	}
	public String getEditAnswerText() {
		return editAnswerText;
	}
	public void setEditAnswerText(String editAnswerText) {
		this.editAnswerText = editAnswerText;
	}
	public Integer getFinAnswerId() {
		return finAnswerId;
	}
	public void setFinAnswerId(Integer finAnswerId) {
		this.finAnswerId = finAnswerId;
	}
	public String getFinAnswerText() {
		return finAnswerText;
	}
	public void setFinAnswerText(String finAnswerText) {
		this.finAnswerText = finAnswerText;
	}
	public Integer getImageId() {
		return imageId;
	}
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}
	public int getTaskResultDetListId() {
		return taskResultDetListId;
	}
	public void setTaskResultDetListId(int taskResultDetListId) {
		this.taskResultDetListId = taskResultDetListId;
	}
	public int getTaskResultDetId() {
		return taskResultDetId;
	}
	public void setTaskResultDetId(int taskResultDetId) {
		this.taskResultDetId = taskResultDetId;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getFlagFinAnswerUse() {
		return flagFinAnswerUse;
	}
	public void setFlagFinAnswerUse(String flagFinAnswerUse) {
		this.flagFinAnswerUse = flagFinAnswerUse;
	}
}
