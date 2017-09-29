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
 * POJO table MASTER_PRODUCT
 * @created Jan 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_PRODUCT")
public class MasterProduct implements Serializable {

	@Id
	@Column(name="PRODUCT_ID")
	private int productId;
	@Column(name="PRODUCT_CODE")
	private String productCode;
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
	@Column(name="IS_AUTO_SURVEY")
	private String isAutoSurvey;
	@ManyToOne
	@JoinColumn(name="TEMP_ID")
	private MasterTemplate template;
	
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
	public String getIsAutoSurvey() {
		return isAutoSurvey;
	}
	public void setIsAutoSurvey(String isAutoSurvey) {
		this.isAutoSurvey = isAutoSurvey;
	}
}
