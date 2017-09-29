package com.safasoft.mobsur.rest.client.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
@Table(name="MBS_ORDER_TASK")
public class OrderTask implements Serializable {

	@Id
	@Column(name="MBS_ORDER_ID")
	private String orderId;
	@Column(name="MBS_OUTLET_ID")
	private String officeId;
	@Column(name="MBS_ORDER_DATE")
	private Date orderDate;
	@Column(name="MBS_CUST_ID")
	private String customerId;
	@Column(name="MBS_CUST_FULL_NAME")
	private String customerName;
	@Column(name="MBS_CUST_ADDR")
	private String customerAddress;
	@Column(name="MBS_CUST_ADDR_RT")
	private String customerRt;
	@Column(name="MBS_CUST_ADDR_RW")
	private String customerRw;
	@Column(name="MBS_CUST_ADDR_KEL")
	private String customerKel;
	@Column(name="MBS_CUST_ADDR_KEC")
	private String customerKec;
	@Column(name="MBS_CUST_ADDR_KABKOTA")
	private String customerKabkota;
	@Column(name="MBS_CUST_ADDR_PROV")
	private String customerProv;
	@Column(name="MBS_CUST_ADDR_ZIP")
	private String customerZipcode;
	@Column(name="MBS_CUST_SUBZIP")
	private String customerSubZipcode;
	@Column(name="MBS_CUST_PHONE")
	private String customerPhone;
	@Column(name="MBS_STATUS")
	private String taskStatusId;
	@Column(name="MBS_CUST_CREATED_BY")
	private String createdBy;
	@Column(name="MBS_CUST_CREATED_DATE")
	private Date createdDate;
	@Column(name="MBS_CUST_UPDATED_BY")
	private String updatedBy;
	@Column(name="MBS_CUST_UPDATED_DATE")
	private Date updatedDate;
	@Column(name="MBS_PRIORITY_ID")
	private String priority;
	@Column(name="MBS_NOTES")
	private String notes;
	@Column(name="MBS_VERIFY_BY")
	private String verifyBy;
	@Column(name="MBS_VERIFY_DATE")
	private Date verifyDate;
	@Column(name="MBS_ASSIGNMENT_DATE")
  @Temporal(TemporalType.TIMESTAMP)
	private Date assignmentDate;
	@Column(name="MBS_RETRIEVE_DATE")
  @Temporal(TemporalType.TIMESTAMP)
	private Date retrieveDate;
	@Column(name="MBS_SUBMIT_DATE")
  @Temporal(TemporalType.TIMESTAMP)
	private Date submitDate;
	@Column(name="MBS_FINALIZATION_DATE")
  @Temporal(TemporalType.TIMESTAMP)
	private Date finalizationDate;
	@Column(name="MBS_RECEIVE_DATE")
  @Temporal(TemporalType.TIMESTAMP)
	private Date receiveDate;
	@Column(name="MBS_PRODUCT_ID")
	private String productId;
	@Column(name="MBS_USER_ID")
	private String userId;
	
	@Transient
	private int taskId;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
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
	public String getCustomerKel() {
		return customerKel;
	}
	public void setCustomerKel(String customerKel) {
		this.customerKel = customerKel;
	}
	public String getCustomerKec() {
		return customerKec;
	}
	public void setCustomerKec(String customerKec) {
		this.customerKec = customerKec;
	}
	public String getCustomerKabkota() {
		return customerKabkota;
	}
	public void setCustomerKabkota(String customerKabkota) {
		this.customerKabkota = customerKabkota;
	}
	public String getCustomerProv() {
		return customerProv;
	}
	public void setCustomerProv(String customerProv) {
		this.customerProv = customerProv;
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
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getTaskStatusId() {
		return taskStatusId;
	}
	public void setTaskStatusId(String taskStatusId) {
		this.taskStatusId = taskStatusId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String orderCreatedBy) {
		this.createdBy = orderCreatedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date orderCreatedDate) {
		this.createdDate = orderCreatedDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String orderUpdatedBy) {
		this.updatedBy = orderUpdatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date orderUpdatedDate) {
		this.updatedDate = orderUpdatedDate;
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
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}	
}
