package com.safasoft.mobilesurvey.rest.bean;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.safasoft.mobilesurvey.rest.bean.support.RecordAuditBean;

/**
 * POJO table MOBILE_TASK_ASSIGNMENT
 * @created Feb 2, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MOBILE_TASK_ASSIGNMENT")
public class MobileTaskAssignment extends RecordAuditBean {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TASK_ID")
	private int taskId;
	@Column(name="ORDER_ID")
	private String orderId;
	@Column(name="ORDER_DATE")
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	@Column(name="CUSTOMER_ID")
	private String customerId;
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	@Column(name="CUSTOMER_ADDRESS")
	private String customerAddress;
	@Column(name="CUSTOMER_PHONE")
	private String customerPhone;
	@Column(name="CUSTOMER_ZIPCODE")
	private String customerZipcode;
	@Column(name="CUSTOMER_SUB_ZIPCODE")
	private String customerSubZipcode;
	@Column(name="CUSTOMER_RT")
	private String customerRt;
	@Column(name="CUSTOMER_RW")
	private String customerRw;
	@Column(name="PRIORITY")
	private String priority;
	@Column(name="NOTES")
	private String notes;
	@Column(name="VERIFY_BY")
	private String verifyBy;
	@Column(name="VERIFY_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date verifyDate;
	@Column(name="ASSIGNMENT_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date assignmentDate;
	@Column(name="RETRIEVE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date retrieveDate;
	@Column(name="SUBMIT_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date submitDate;
	@Column(name="FINALIZATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date finalizationDate;
	@Column(name="RECEIVE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date receiveDate;
	@Column(name="ASSIGNMENT_STATUS")
	private String assignmentStatus;
	@ManyToOne(optional=true)
	@JoinColumn(name="USER_ID")
	private MasterUser user;
	@ManyToOne(optional=true)
	@JoinColumn(name="PRODUCT_ID")
	private MasterProduct product;
	@ManyToOne(optional=true)
	@JoinColumn(name="OFFICE_ID")
	private MasterOffice office;
	@ManyToOne(optional=true)
	@JoinColumn(name="TASK_STATUS_ID")
	private MasterTaskStatus taskStatus;
	@OneToMany(mappedBy="task")
	private Set<MobileTaskResult> taskResults;
	
	
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
	public MasterUser getUser() {
		return user;
	}
	public void setUser(MasterUser user) {
		this.user = user;
	}
	public MasterProduct getProduct() {
		return product;
	}
	public void setProduct(MasterProduct product) {
		this.product = product;
	}
	public MasterOffice getOffice() {
		return office;
	}
	public void setOffice(MasterOffice office) {
		this.office = office;
	}
	public MasterTaskStatus getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(MasterTaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}
	public Set<MobileTaskResult> getTaskResults() {
		return taskResults;
	}
	public void setTaskResults(Set<MobileTaskResult> taskResults) {
		this.taskResults = taskResults;
	}
}
