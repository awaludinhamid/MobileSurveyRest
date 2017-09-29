package com.safasoft.pentaho.datatrans.src.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="FIN_RVHDR_MSTPARAM",schema="FINA")
public class FinRvhdrMstparam implements Serializable {

  @Id
  @Column(name="PARAM_CODE")
  private String paramCode;
  @Column(name="PARAM_SEQN")
  private Integer paramSeqn;
  
	public String getParamCode() {
		return paramCode;
	}
	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}
	public Integer getParamSeqn() {
		return paramSeqn;
	}
	public void setParamSeqn(Integer paramSeqn) {
		this.paramSeqn = paramSeqn;
	}

}