package com.safasoft.mobilesurvey.rest.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.safasoft.mobilesurvey.rest.dto.support.ControllerAuditBean;
import com.safasoft.mobilesurvey.rest.util.CustomJsonTimeSerializerWithoutTimeZone;

/**
 * DTO table MOBILE_TASK_ASSIGNMENT
 * @created Feb 2, 2017
 * @author awal
 */
public class MobileTaskAssignmentDTO extends ControllerAuditBean {
	
	private int taskId;
	private String orderId;
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	private String customerId;
	private String customerName;
	private String customerAddress;
	private String customerPhone;
	private String customerZipcode;
	private String customerSubZipcode;
	private String customerRt;
	private String customerRw;
	private String priority;
	private String notes;
	private String verifyBy;
	@Temporal(TemporalType.TIMESTAMP)
  @JsonSerialize(using = CustomJsonTimeSerializerWithoutTimeZone.class)
	private Date verifyDate;
	@Temporal(TemporalType.TIMESTAMP)
  @JsonSerialize(using = CustomJsonTimeSerializerWithoutTimeZone.class)
	private Date assignmentDate;
	@Temporal(TemporalType.TIMESTAMP)
  @JsonSerialize(using = CustomJsonTimeSerializerWithoutTimeZone.class)
	private Date retrieveDate;
	@Temporal(TemporalType.TIMESTAMP)
  @JsonSerialize(using = CustomJsonTimeSerializerWithoutTimeZone.class)
	private Date submitDate;
	@Temporal(TemporalType.TIMESTAMP)
  @JsonSerialize(using = CustomJsonTimeSerializerWithoutTimeZone.class)
	private Date finalizationDate;
	@Temporal(TemporalType.TIMESTAMP)
  @JsonSerialize(using = CustomJsonTimeSerializerWithoutTimeZone.class)
	private Date receiveDate;
	private String assignmentStatus;
	private Integer userId;
	private String userCode;
	private String userName;
	private Integer officeId;
	private String officeCode;
	private String officeName;
	private Integer coyId;
	private String coyCode;
	private String coyName;
	private Integer tempId;
	private String tempLabel;
	private Integer productId;
	private String productCode;
	private String productName;
	private Integer taskStatusId;
	private String taskStatusCode;
	private String taskStatusName;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerZipcode() {
		return customerZipcode;
	}
	public void setCustomerZipcode(String customerZipcode) {
		this.customerZipcode = customerZipcode;
	}
	public String getCustomerSubZipcode() {
		return customerSubZipcode;
	}
	public void setCustomerSubZipcode(String customerSubZipcode) {
		this.customerSubZipcode = customerSubZipcode;
	}
	public String getCustomerRt() {
		return customerRt;
	}
	public void setCustomerRt(String customerRt) {
		this.customerRt = customerRt;
	}
	public String getCustomerRw() {
		return customerRw;
	}
	public void setCustomerRw(String customerRw) {
		this.customerRw = customerRw;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getVerifyBy() {
		return verifyBy;
	}
	public void setVerifyBy(String verifyBy) {
		this.verifyBy = verifyBy;
	}
	public Date getVerifyDate() {
		return verifyDate;
	}
	public void setVerifyDate(Date verifyDate) {
		this.verifyDate = verifyDate;
	}
	public Date getAssignmentDate() {
		return assignmentDate;
	}
	public void setAssignmentDate(Date assignmentDate) {
		this.assignmentDate = assignmentDate;
	}
	public Date getRetrieveDate() {
		return retrieveDate;
	}
	public void setRetrieveDate(Date retrieveDate) {
		this.retrieveDate = retrieveDate;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	public Date getFinalizationDate() {
		return finalizationDate;
	}
	public void setFinalizationDate(Date finalizationDate) {
		this.finalizationDate = finalizationDate;
	}
	public Date getReceiveDate() {
		return receiveDate;
	}
	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}
	public String getAssignmentStatus() {
		return assignmentStatus;
	}
	public void setAssignmentStatus(String assignmentStatus) {
		this.assignmentStatus = assignmentStatus;
	}
	public Integer getOfficeId() {
		return officeId;
	}
	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public Integer getCoyId() {
		return coyId;
	}
	public void setCoyId(Integer coyId) {
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
	public Integer getTempId() {
		return tempId;
	}
	public void setTempId(Integer tempId) {
		this.tempId = tempId;
	}
	public String getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(String tempLabel) {
		this.tempLabel = tempLabel;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
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
	public Integer getTaskStatusId() {
		return taskStatusId;
	}
	public void setTaskStatusId(Integer taskStatusId) {
		this.taskStatusId = taskStatusId;
	}
	public String getTaskStatusCode() {
		return taskStatusCode;
	}
	public void setTaskStatusCode(String taskStatusCode) {
		this.taskStatusCode = taskStatusCode;
	}
	public String getTaskStatusName() {
		return taskStatusName;
	}
	public void setTaskStatusName(String taskStatusName) {
		this.taskStatusName = taskStatusName;
	}
}
