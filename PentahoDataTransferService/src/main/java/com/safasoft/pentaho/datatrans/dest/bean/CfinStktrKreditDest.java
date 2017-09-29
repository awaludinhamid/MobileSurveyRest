package com.safasoft.pentaho.datatrans.dest.bean;

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
@Table(name="CFIN_STKTR_KREDIT")
public class CfinStktrKreditDest implements Serializable {

	@Id
	@Column(name="STKTR_ORDER_ID")
	private String stktrOrderId;                                                                   
	@Id
	@Column(name="STKTR_VERSION_NO")
	private Integer stktrVersionNo;                                                              
	@Column(name="STKTR_TOT_OBJTPRICE")
	private Integer stktrTotObjtprice;                                                           
	@Column(name="STKTR_NMB_UNITOBJT")
	private Integer stktrNmbUnitobjt;                                                             
	@Column(name="STKTR_TOTL_GROSS_DP")
	private Integer stktrTotlGrossDp;                                                            
	@Column(name="STKTR_AMTDP_CUST")
	private Integer stktrAmtdpCust;                                                                 
	@Column(name="STKTR_SUBSDCOY_DP")
	private Integer stktrSubsdcoyDp;                                                               
	@Column(name="STKTR_SUBSDDLR_DP")
	private Integer stktrSubsddlrDp;                                                               
	@Column(name="STKTR_SUBSDOTHR_DP")
	private Integer stktrSubsdothrDp;                                                             
	@Column(name="STKTR_NET_DP")
	private Integer stktrNetDp;                                                                         
	@Column(name="STKTR_INSC_CASH")
	private Integer stktrInscCash;                                                                   
	@Column(name="STKTR_NET_ADM")
	private Integer stktrNetAdm;                                                                       
	@Column(name="STKTR_UPPCOY1_ADM")
	private Integer stktrUppcoy1Adm;                                                               
	@Column(name="STKTR_UPPCOY2_ADM")
	private Integer stktrUppcoy2Adm;                                                               
	@Column(name="STKTR_UPPDELR_ADM")
	private Integer stktrUppdelrAdm;                                                               
	@Column(name="STKTR_TOTL_ADM")
	private Integer stktrTotlAdm;                                                                     
	@Column(name="STKTR_AD_AR_FLAG")
	private String stktrAdArFlag;                                                                   
	@Column(name="STKTR_INSTL_TYPE")
	private String stktrInstlType;                                                                  
	@Column(name="STKTR_PKK_PEMBIAYAAN")
	private Integer stktrPkkPembiayaan;                                                         
	@Column(name="STKTR_BNG_OR_MARGIN")
	private Integer stktrBngOrMargin;                                                            
	@Column(name="STKTR_PCT_FLAT")
	private Double stktrPctFlat;                                                                      
	@Column(name="STKTR_PCT_EFF")
	private Double stktrPctEff;                                                                        
	@Column(name="STKTR_TENOR")
	private Integer stktrTenor;                                                                          
	@Column(name="STKTR_ANGS_PERBLN")
	private Integer stktrAngsPerbln;                                                               
	@Column(name="STKTR_ANGS_TERAKHIR")
	private Integer stktrAngsTerakhir;                                                           
	@Column(name="STKTR_CREATED_BY")
	private String stktrCreatedBy;                                                                  
	@Column(name="STKTR_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date stktrCreatedDate;                                    
	@Column(name="STKTR_UPDATED_BY")
	private String stktrUpdatedBy;                                                                  
	@Column(name="STKTR_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date stktrUpdatedDate;                                    
	@Column(name="STKTR_BY_RATE_OR_ANGS")
	private String stktrByRateOrAngs;                                                          
	@Column(name="STKTR_PCT_FLAT_ACT")
	private Double stktrPctFlatAct;                                                               
	@Column(name="STKTR_PCT_EFF_ACT")
	private Double stktrPctEffAct;                                                                 
	@Column(name="STKTR_JRK_ANGS")
	private Integer stktrJrkAngs;                                                                     
	@Column(name="STKTR_JML_ANGS")
	private Integer stktrJmlAngs;                                                                     
	@Column(name="STKTR_BYA_PROVISI")
	private Integer stktrByaProvisi;                                                               
	@Column(name="STKTR_PERIOD_TYPE")
	private String stktrPeriodType;                                                                
	@Column(name="STKTR_INSC_CREDIT")
	private Integer stktrInscCredit;                                                               
	@Column(name="STKTR_TOT_SUBS_BNG")
	private Integer stktrTotSubsBng;                                                              
	@Column(name="STKTR_PCT_PROVISI")
	private Double stktrPctProvisi;                                                                
	@Column(name="STKTR_COY_SUBS1")
	private Integer stktrCoySubs1;                                                                   
	@Column(name="STKTR_COY_SUBS2")
	private Integer stktrCoySubs2;                                                                   
	@Column(name="STKTR_SUPL_REFUND1")
	private Integer stktrSuplRefund1;                                                             
	@Column(name="STKTR_SUPL_REFUND2")
	private Integer stktrSuplRefund2;                                                             
	@Column(name="STKTR_PINJAMAN")
	private Integer stktrPinjaman;                                                                    
	@Column(name="STKTR_KOND_UNIT")
	private Double stktrKondUnit;
	
	public String getStktrOrderId() {
		return stktrOrderId;
	}
	public void setStktrOrderId(String stktrOrderId) {
		this.stktrOrderId = stktrOrderId;
	}
	public Integer getStktrVersionNo() {
		return stktrVersionNo;
	}
	public void setStktrVersionNo(Integer stktrVersionNo) {
		this.stktrVersionNo = stktrVersionNo;
	}
	public Integer getStktrTotObjtprice() {
		return stktrTotObjtprice;
	}
	public void setStktrTotObjtprice(Integer stktrTotObjtprice) {
		this.stktrTotObjtprice = stktrTotObjtprice;
	}
	public Integer getStktrNmbUnitobjt() {
		return stktrNmbUnitobjt;
	}
	public void setStktrNmbUnitobjt(Integer stktrNmbUnitobjt) {
		this.stktrNmbUnitobjt = stktrNmbUnitobjt;
	}
	public Integer getStktrTotlGrossDp() {
		return stktrTotlGrossDp;
	}
	public void setStktrTotlGrossDp(Integer stktrTotlGrossDp) {
		this.stktrTotlGrossDp = stktrTotlGrossDp;
	}
	public Integer getStktrAmtdpCust() {
		return stktrAmtdpCust;
	}
	public void setStktrAmtdpCust(Integer stktrAmtdpCust) {
		this.stktrAmtdpCust = stktrAmtdpCust;
	}
	public Integer getStktrSubsdcoyDp() {
		return stktrSubsdcoyDp;
	}
	public void setStktrSubsdcoyDp(Integer stktrSubsdcoyDp) {
		this.stktrSubsdcoyDp = stktrSubsdcoyDp;
	}
	public Integer getStktrSubsddlrDp() {
		return stktrSubsddlrDp;
	}
	public void setStktrSubsddlrDp(Integer stktrSubsddlrDp) {
		this.stktrSubsddlrDp = stktrSubsddlrDp;
	}
	public Integer getStktrSubsdothrDp() {
		return stktrSubsdothrDp;
	}
	public void setStktrSubsdothrDp(Integer stktrSubsdothrDp) {
		this.stktrSubsdothrDp = stktrSubsdothrDp;
	}
	public Integer getStktrNetDp() {
		return stktrNetDp;
	}
	public void setStktrNetDp(Integer stktrNetDp) {
		this.stktrNetDp = stktrNetDp;
	}
	public Integer getStktrInscCash() {
		return stktrInscCash;
	}
	public void setStktrInscCash(Integer stktrInscCash) {
		this.stktrInscCash = stktrInscCash;
	}
	public Integer getStktrNetAdm() {
		return stktrNetAdm;
	}
	public void setStktrNetAdm(Integer stktrNetAdm) {
		this.stktrNetAdm = stktrNetAdm;
	}
	public Integer getStktrUppcoy1Adm() {
		return stktrUppcoy1Adm;
	}
	public void setStktrUppcoy1Adm(Integer stktrUppcoy1Adm) {
		this.stktrUppcoy1Adm = stktrUppcoy1Adm;
	}
	public Integer getStktrUppcoy2Adm() {
		return stktrUppcoy2Adm;
	}
	public void setStktrUppcoy2Adm(Integer stktrUppcoy2Adm) {
		this.stktrUppcoy2Adm = stktrUppcoy2Adm;
	}
	public Integer getStktrUppdelrAdm() {
		return stktrUppdelrAdm;
	}
	public void setStktrUppdelrAdm(Integer stktrUppdelrAdm) {
		this.stktrUppdelrAdm = stktrUppdelrAdm;
	}
	public Integer getStktrTotlAdm() {
		return stktrTotlAdm;
	}
	public void setStktrTotlAdm(Integer stktrTotlAdm) {
		this.stktrTotlAdm = stktrTotlAdm;
	}
	public String getStktrAdArFlag() {
		return stktrAdArFlag;
	}
	public void setStktrAdArFlag(String stktrAdArFlag) {
		this.stktrAdArFlag = stktrAdArFlag;
	}
	public String getStktrInstlType() {
		return stktrInstlType;
	}
	public void setStktrInstlType(String stktrInstlType) {
		this.stktrInstlType = stktrInstlType;
	}
	public Integer getStktrPkkPembiayaan() {
		return stktrPkkPembiayaan;
	}
	public void setStktrPkkPembiayaan(Integer stktrPkkPembiayaan) {
		this.stktrPkkPembiayaan = stktrPkkPembiayaan;
	}
	public Integer getStktrBngOrMargin() {
		return stktrBngOrMargin;
	}
	public void setStktrBngOrMargin(Integer stktrBngOrMargin) {
		this.stktrBngOrMargin = stktrBngOrMargin;
	}
	public Double getStktrPctFlat() {
		return stktrPctFlat;
	}
	public void setStktrPctFlat(Double stktrPctFlat) {
		this.stktrPctFlat = stktrPctFlat;
	}
	public Double getStktrPctEff() {
		return stktrPctEff;
	}
	public void setStktrPctEff(Double stktrPctEff) {
		this.stktrPctEff = stktrPctEff;
	}
	public Integer getStktrTenor() {
		return stktrTenor;
	}
	public void setStktrTenor(Integer stktrTenor) {
		this.stktrTenor = stktrTenor;
	}
	public Integer getStktrAngsPerbln() {
		return stktrAngsPerbln;
	}
	public void setStktrAngsPerbln(Integer stktrAngsPerbln) {
		this.stktrAngsPerbln = stktrAngsPerbln;
	}
	public Integer getStktrAngsTerakhir() {
		return stktrAngsTerakhir;
	}
	public void setStktrAngsTerakhir(Integer stktrAngsTerakhir) {
		this.stktrAngsTerakhir = stktrAngsTerakhir;
	}
	public String getStktrCreatedBy() {
		return stktrCreatedBy;
	}
	public void setStktrCreatedBy(String stktrCreatedBy) {
		this.stktrCreatedBy = stktrCreatedBy;
	}
	public Date getStktrCreatedDate() {
		return stktrCreatedDate;
	}
	public void setStktrCreatedDate(Date stktrCreatedDate) {
		this.stktrCreatedDate = stktrCreatedDate;
	}
	public String getStktrUpdatedBy() {
		return stktrUpdatedBy;
	}
	public void setStktrUpdatedBy(String stktrUpdatedBy) {
		this.stktrUpdatedBy = stktrUpdatedBy;
	}
	public Date getStktrUpdatedDate() {
		return stktrUpdatedDate;
	}
	public void setStktrUpdatedDate(Date stktrUpdatedDate) {
		this.stktrUpdatedDate = stktrUpdatedDate;
	}
	public String getStktrByRateOrAngs() {
		return stktrByRateOrAngs;
	}
	public void setStktrByRateOrAngs(String stktrByRateOrAngs) {
		this.stktrByRateOrAngs = stktrByRateOrAngs;
	}
	public Double getStktrPctFlatAct() {
		return stktrPctFlatAct;
	}
	public void setStktrPctFlatAct(Double stktrPctFlatAct) {
		this.stktrPctFlatAct = stktrPctFlatAct;
	}
	public Double getStktrPctEffAct() {
		return stktrPctEffAct;
	}
	public void setStktrPctEffAct(Double stktrPctEffAct) {
		this.stktrPctEffAct = stktrPctEffAct;
	}
	public Integer getStktrJrkAngs() {
		return stktrJrkAngs;
	}
	public void setStktrJrkAngs(Integer stktrJrkAngs) {
		this.stktrJrkAngs = stktrJrkAngs;
	}
	public Integer getStktrJmlAngs() {
		return stktrJmlAngs;
	}
	public void setStktrJmlAngs(Integer stktrJmlAngs) {
		this.stktrJmlAngs = stktrJmlAngs;
	}
	public Integer getStktrByaProvisi() {
		return stktrByaProvisi;
	}
	public void setStktrByaProvisi(Integer stktrByaProvisi) {
		this.stktrByaProvisi = stktrByaProvisi;
	}
	public String getStktrPeriodType() {
		return stktrPeriodType;
	}
	public void setStktrPeriodType(String stktrPeriodType) {
		this.stktrPeriodType = stktrPeriodType;
	}
	public Integer getStktrInscCredit() {
		return stktrInscCredit;
	}
	public void setStktrInscCredit(Integer stktrInscCredit) {
		this.stktrInscCredit = stktrInscCredit;
	}
	public Integer getStktrTotSubsBng() {
		return stktrTotSubsBng;
	}
	public void setStktrTotSubsBng(Integer stktrTotSubsBng) {
		this.stktrTotSubsBng = stktrTotSubsBng;
	}
	public Double getStktrPctProvisi() {
		return stktrPctProvisi;
	}
	public void setStktrPctProvisi(Double stktrPctProvisi) {
		this.stktrPctProvisi = stktrPctProvisi;
	}
	public Integer getStktrCoySubs1() {
		return stktrCoySubs1;
	}
	public void setStktrCoySubs1(Integer stktrCoySubs1) {
		this.stktrCoySubs1 = stktrCoySubs1;
	}
	public Integer getStktrCoySubs2() {
		return stktrCoySubs2;
	}
	public void setStktrCoySubs2(Integer stktrCoySubs2) {
		this.stktrCoySubs2 = stktrCoySubs2;
	}
	public Integer getStktrSuplRefund1() {
		return stktrSuplRefund1;
	}
	public void setStktrSuplRefund1(Integer stktrSuplRefund1) {
		this.stktrSuplRefund1 = stktrSuplRefund1;
	}
	public Integer getStktrSuplRefund2() {
		return stktrSuplRefund2;
	}
	public void setStktrSuplRefund2(Integer stktrSuplRefund2) {
		this.stktrSuplRefund2 = stktrSuplRefund2;
	}
	public Integer getStktrPinjaman() {
		return stktrPinjaman;
	}
	public void setStktrPinjaman(Integer stktrPinjaman) {
		this.stktrPinjaman = stktrPinjaman;
	}
	public Double getStktrKondUnit() {
		return stktrKondUnit;
	}
	public void setStktrKondUnit(Double stktrKondUnit) {
		this.stktrKondUnit = stktrKondUnit;
	}                                                                    
}
