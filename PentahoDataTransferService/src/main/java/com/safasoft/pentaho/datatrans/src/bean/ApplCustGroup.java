package com.safasoft.pentaho.datatrans.src.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name="APPL_CUST_GROUP",schema="APPL")
public class ApplCustGroup implements Serializable {

	@Id
	@Column(name="GROUP_GRP_ID")
	private String groupGrpId;
	@Column(name="GROUP_MOU_NO")
	private String groupMouNo;
	@Column(name="GROUP_PTG_GAJI_FLAG")
	private String groupPtgGajiFlag;
	@Column(name="GROUP_PIC_ID")
	private String groupPicId;
	@Column(name="GROUP_PIC_POSITION")
	private String groupPicPosition;
	@Column(name="GROUP_SAL_DATE")
	private Integer groupSalDate;
	@Column(name="GROUP_COLLECT_DATE")
	private Integer groupCollectDate;
	@Column(name="GROUP_CREATED_BY")
	private String groupCreatedBy;
	@Column(name="GROUP_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date groupCreatedDate;
	@Column(name="GROUP_UPDATED_BY")
	private String groupUpdatedBy;
	@Column(name="GROUP_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date groupUpdatedDate;
	
	public String getGroupGrpId() {
		return groupGrpId;
	}
	public void setGroupGrpId(String groupGrpId) {
		this.groupGrpId = groupGrpId;
	}
	public String getGroupMouNo() {
		return groupMouNo;
	}
	public void setGroupMouNo(String groupMouNo) {
		this.groupMouNo = groupMouNo;
	}
	public String getGroupPtgGajiFlag() {
		return groupPtgGajiFlag;
	}
	public void setGroupPtgGajiFlag(String groupPtgGajiFlag) {
		this.groupPtgGajiFlag = groupPtgGajiFlag;
	}
	public String getGroupPicId() {
		return groupPicId;
	}
	public void setGroupPicId(String groupPicId) {
		this.groupPicId = groupPicId;
	}
	public String getGroupPicPosition() {
		return groupPicPosition;
	}
	public void setGroupPicPosition(String groupPicPosition) {
		this.groupPicPosition = groupPicPosition;
	}
	public Integer getGroupSalDate() {
		return groupSalDate;
	}
	public void setGroupSalDate(Integer groupSalDate) {
		this.groupSalDate = groupSalDate;
	}
	public Integer getGroupCollectDate() {
		return groupCollectDate;
	}
	public void setGroupCollectDate(Integer groupCollectDate) {
		this.groupCollectDate = groupCollectDate;
	}
	public String getGroupCreatedBy() {
		return groupCreatedBy;
	}
	public void setGroupCreatedBy(String groupCreatedBy) {
		this.groupCreatedBy = groupCreatedBy;
	}
	public Date getGroupCreatedDate() {
		return groupCreatedDate;
	}
	public void setGroupCreatedDate(Date groupCreatedDate) {
		this.groupCreatedDate = groupCreatedDate;
	}
	public String getGroupUpdatedBy() {
		return groupUpdatedBy;
	}
	public void setGroupUpdatedBy(String groupUpdatedBy) {
		this.groupUpdatedBy = groupUpdatedBy;
	}
	public Date getGroupUpdatedDate() {
		return groupUpdatedDate;
	}
	public void setGroupUpdatedDate(Date groupUpdatedDate) {
		this.groupUpdatedDate = groupUpdatedDate;
	}
}
