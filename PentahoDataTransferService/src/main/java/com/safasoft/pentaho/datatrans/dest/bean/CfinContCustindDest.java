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
@Table(name="CFIN_CONT_CUSTIND")
public class CfinContCustindDest implements Serializable {

	@Id
	@Column(name="CUST_CONTRACT_NO")
	private String custContractNo;
	@Column(name="CUST_FULL_NAME")
	private String custFullName;
	@Column(name="CUST_ADDR")
	private String custAddr;
	@Column(name="CUST_ADDR_RT")
	private String custAddrRt;
	@Column(name="CUST_ADDR_RW")
	private String custAddrRw;
	@Column(name="CUST_ADDR_KEL")
	private String custAddrKel;
	@Column(name="CUST_ADDR_KEC")
	private String custAddrKec;
	@Column(name="CUST_ADDR_KABKOTA")
	private String custAddrKabkota;
	@Column(name="CUST_ADDR_PROV")
	private String custAddrProv;
	@Column(name="CUST_ADDR_ZIP")
	private String custAddrZip;
	@Column(name="IND_BIRTHPLACE")
	private String indBirthplace;
	@Column(name="IND_BIRTHDATE")
	@Temporal(TemporalType.DATE)
	private Date indBirthdate;
	@Column(name="IND_KELAMIN")
	private String indKelamin;
	@Column(name="IND_STS_RUMAH")
	private String indStsRumah;
	@Column(name="IND_MARITAL_STS")
	private String indMartialSts;
	@Column(name="IND_ID_TYPE")
	private String indIdType;
	@Column(name="IND_ID_NO")
	private String indIdNo;
	@Column(name="IND_MOTHER_NAME")
	private String indMotherName;
	@Column(name="IND_CUST_CATEGRY")
	private String indCustCategory;
	@Column(name="IND_ID_OCCUP")
	private String indIdOccup;
	@Column(name="IND_CUST_EDUCATION")
	private String indCustEducation;
	@Column(name="IND_CUST_RELIGION")
	private String indCustReligion;
	@Column(name="IND_SALARY")
	private Integer indSalary;
	@Column(name="IND_SPOUSE_SALARY")
	private Integer indSpouseSalary;
	@Column(name="IND_OTHER_INCOME")
	private Integer indOtherIncome;
	@Column(name="IND_JML_TANGGUNGAN")
	private Integer indJmlTanggungan;
	@Column(name="IND_LAMA_KERJA")
	private Integer indLamaKerja;
	@Column(name="IND_EXPENSE_MONTHLY")
	private Integer indExpenseMonthly;
	@Column(name="IND_CUST_WARGANEGARA")
	private String indCustWarganegara;
	@Column(name="IND_GOL_DARAH")
	private String indGolDarah;
	@Column(name="IND_NAMA_BI")
	private String indNamaBi;
	@Column(name="IND_GELAR")
	private String indGelar;
	@Column(name="IND_NICKNAME")
	private String indNickname;
	
	public String getCustContractNo() {
		return custContractNo;
	}
	public void setCustContractNo(String custContractNo) {
		this.custContractNo = custContractNo;
	}
	public String getCustFullName() {
		return custFullName;
	}
	public void setCustFullName(String custFullName) {
		this.custFullName = custFullName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public String getCustAddrRt() {
		return custAddrRt;
	}
	public void setCustAddrRt(String custAddrRt) {
		this.custAddrRt = custAddrRt;
	}
	public String getCustAddrRw() {
		return custAddrRw;
	}
	public void setCustAddrRw(String custAddrRw) {
		this.custAddrRw = custAddrRw;
	}
	public String getCustAddrKel() {
		return custAddrKel;
	}
	public void setCustAddrKel(String custAddrKel) {
		this.custAddrKel = custAddrKel;
	}
	public String getCustAddrKec() {
		return custAddrKec;
	}
	public void setCustAddrKec(String custAddrKec) {
		this.custAddrKec = custAddrKec;
	}
	public String getCustAddrKabkota() {
		return custAddrKabkota;
	}
	public void setCustAddrKabkota(String custAddrKabkota) {
		this.custAddrKabkota = custAddrKabkota;
	}
	public String getCustAddrProv() {
		return custAddrProv;
	}
	public void setCustAddrProv(String custAddrProv) {
		this.custAddrProv = custAddrProv;
	}
	public String getCustAddrZip() {
		return custAddrZip;
	}
	public void setCustAddrZip(String custAddrZip) {
		this.custAddrZip = custAddrZip;
	}
	public String getIndBirthplace() {
		return indBirthplace;
	}
	public void setIndBirthplace(String indBirthplace) {
		this.indBirthplace = indBirthplace;
	}
	public Date getIndBirthdate() {
		return indBirthdate;
	}
	public void setIndBirthdate(Date indBirthdate) {
		this.indBirthdate = indBirthdate;
	}
	public String getIndKelamin() {
		return indKelamin;
	}
	public void setIndKelamin(String indKelamin) {
		this.indKelamin = indKelamin;
	}
	public String getIndStsRumah() {
		return indStsRumah;
	}
	public void setIndStsRumah(String indStsRumah) {
		this.indStsRumah = indStsRumah;
	}
	public String getIndMartialSts() {
		return indMartialSts;
	}
	public void setIndMartialSts(String indMartialSts) {
		this.indMartialSts = indMartialSts;
	}
	public String getIndIdType() {
		return indIdType;
	}
	public void setIndIdType(String indIdType) {
		this.indIdType = indIdType;
	}
	public String getIndIdNo() {
		return indIdNo;
	}
	public void setIndIdNo(String indIdNo) {
		this.indIdNo = indIdNo;
	}
	public String getIndMotherName() {
		return indMotherName;
	}
	public void setIndMotherName(String indMotherName) {
		this.indMotherName = indMotherName;
	}
	public String getIndCustCategory() {
		return indCustCategory;
	}
	public void setIndCustCategory(String indCustCategory) {
		this.indCustCategory = indCustCategory;
	}
	public String getIndIdOccup() {
		return indIdOccup;
	}
	public void setIndIdOccup(String indIdOccup) {
		this.indIdOccup = indIdOccup;
	}
	public String getIndCustEducation() {
		return indCustEducation;
	}
	public void setIndCustEducation(String indCustEducation) {
		this.indCustEducation = indCustEducation;
	}
	public String getIndCustReligion() {
		return indCustReligion;
	}
	public void setIndCustReligion(String indCustReligion) {
		this.indCustReligion = indCustReligion;
	}
	public Integer getIndSalary() {
		return indSalary;
	}
	public void setIndSalary(Integer indSalary) {
		this.indSalary = indSalary;
	}
	public Integer getIndSpouseSalary() {
		return indSpouseSalary;
	}
	public void setIndSpouseSalary(Integer indSpouseSalary) {
		this.indSpouseSalary = indSpouseSalary;
	}
	public Integer getIndOtherIncome() {
		return indOtherIncome;
	}
	public void setIndOtherIncome(Integer indOtherIncome) {
		this.indOtherIncome = indOtherIncome;
	}
	public Integer getIndJmlTanggungan() {
		return indJmlTanggungan;
	}
	public void setIndJmlTanggungan(Integer indJmlTanggungan) {
		this.indJmlTanggungan = indJmlTanggungan;
	}
	public Integer getIndLamaKerja() {
		return indLamaKerja;
	}
	public void setIndLamaKerja(Integer indLamaKerja) {
		this.indLamaKerja = indLamaKerja;
	}
	public Integer getIndExpenseMonthly() {
		return indExpenseMonthly;
	}
	public void setIndExpenseMonthly(Integer indExpenseMonthly) {
		this.indExpenseMonthly = indExpenseMonthly;
	}
	public String getIndCustWarganegara() {
		return indCustWarganegara;
	}
	public void setIndCustWarganegara(String indCustWarganegara) {
		this.indCustWarganegara = indCustWarganegara;
	}
	public String getIndGolDarah() {
		return indGolDarah;
	}
	public void setIndGolDarah(String indGolDarah) {
		this.indGolDarah = indGolDarah;
	}
	public String getIndNamaBi() {
		return indNamaBi;
	}
	public void setIndNamaBi(String indNamaBi) {
		this.indNamaBi = indNamaBi;
	}
	public String getIndGelar() {
		return indGelar;
	}
	public void setIndGelar(String indGelar) {
		this.indGelar = indGelar;
	}
	public String getIndNickname() {
		return indNickname;
	}
	public void setIndNickname(String indNickname) {
		this.indNickname = indNickname;
	}
}
