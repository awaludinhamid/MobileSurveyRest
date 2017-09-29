package com.safasoft.pentaho.datatrans.dest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="CFIN_MST_CFGACCT")
public class CfinMstCfgacctDest implements Serializable {

  @Id
  @Column(name="CFGACCT_CODE")
  private String cfgacctCode;
  @Column(name="CFGACCT_DESC")
  private String cfgacctDesc;
  @Column(name="CFGACCT_SEQN")
  private Integer cfgacctSeqn;
  
	public String getCfgacctCode() {
		return cfgacctCode;
	}
	public void setCfgacctCode(String cfgacctCode) {
		this.cfgacctCode = cfgacctCode;
	}
	public String getCfgacctDesc() {
		return cfgacctDesc;
	}
	public void setCfgacctDesc(String cfgacctDesc) {
		this.cfgacctDesc = cfgacctDesc;
	}
	public Integer getCfgacctSeqn() {
		return cfgacctSeqn;
	}
	public void setCfgacctSeqn(Integer cfgacctSeqn) {
		this.cfgacctSeqn = cfgacctSeqn;
	}

}