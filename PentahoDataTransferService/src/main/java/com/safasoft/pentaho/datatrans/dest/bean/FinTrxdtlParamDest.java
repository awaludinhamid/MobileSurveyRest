package com.safasoft.pentaho.datatrans.dest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="FIN_TRXDTL_PARAM")
public class FinTrxdtlParamDest implements Serializable {

  @Id
  @Column(name="PARAM_CODE")
  private String paramCode;
  @Column(name="PARAM_DESC")
  private String paramDesc;
  @Column(name="PARAM_SEQN")
  private Integer paramSeqn;
  @Column(name="PARAM_CFGROUP")
  private String paramCfgroup;
  
	public String getParamCode() {
		return paramCode;
	}
	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}
	public String getParamDesc() {
		return paramDesc;
	}
	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}
	public Integer getParamSeqn() {
		return paramSeqn;
	}
	public void setParamSeqn(Integer paramSeqn) {
		this.paramSeqn = paramSeqn;
	}
	public String getParamCfgroup() {
		return paramCfgroup;
	}
	public void setParamCfgroup(String paramCfgroup) {
		this.paramCfgroup = paramCfgroup;
	}

}