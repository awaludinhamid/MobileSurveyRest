package com.safasoft.mobilesurvey.rest.dto;

/**
 * DTO table MASTER_PRODUCT
 * @created Jan 5, 2017
 * @author awal
 */
public class MasterProductDTO {

	private int productId;
	private String productCode;
	private String productName;
	private String isAutoSurvey;
	private int tempId;
	private String tempCode;
	private String tempLabel;
	private int coyId;
	private String coyCode;
	private String coyName;
	
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
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getTempId() {
		return tempId;
	}
	public void setTempId(int tempId) {
		this.tempId = tempId;
	}
	public String getTempCode() {
		return tempCode;
	}
	public void setTempCode(String tempCode) {
		this.tempCode = tempCode;
	}
	public String getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(String tempLabel) {
		this.tempLabel = tempLabel;
	}
	public String getIsAutoSurvey() {
		return isAutoSurvey;
	}
	public void setIsAutoSurvey(String isAutoSurvey) {
		this.isAutoSurvey = isAutoSurvey;
	}
}
