package com.safasoft.mobilesurvey.rest.dto.client;

import java.sql.Date;

import com.safasoft.mobilesurvey.rest.dto.support.ControllerAuditBean;

/**
 * DTO table MOBILE_TASK_ASSIGNMENT on client side
 * @created Feb 2, 2017
 * @author awal
 */
public class MobileTaskAssignmentDTOClient extends ControllerAuditBean {
	
	private int taskId;
	private String orderId;
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
	private Date verifyDate;
	private Date assignmentDate;
	private Date retrieveDate;
	private Date submitDate;
	private Date finalizationDate;
	private Date receiveDate;
	private String assignmentStatus;
	private int userId;
	private int officeId;
	private int productId;
	private int taskStatusId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public int getOfficeId() {
		return officeId;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getTaskStatusId() {
		return taskStatusId;
	}
	public void setTaskStatusId(int taskStatusId) {
		this.taskStatusId = taskStatusId;
	}
}
