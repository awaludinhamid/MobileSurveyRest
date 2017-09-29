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
@Table(name="APPL_CUST_IND")
public class ApplCustIndDest implements Serializable {

	@Id
	@Column(name="IND_CUST_ID")
	private String indCustId;
	@Column(name="IND_NICKNAME")
	private String indNickname;
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
	private String indMaritalSts;
	@Column(name="IND_MARRIED_DATE")
	@Temporal(TemporalType.DATE)
	private Date indMarriedDate;
	@Column(name="IND_ID_TYPE")
	private String indIdType;
	@Column(name="IND_ID_NO")
	private String indIdNo;
	@Column(name="IND_MOTHER_NAME")
	private String indMotherName;
	@Column(name="IND_CUST_CATEGRY")
	private String indCustCategry;
	@Column(name="IND_CUST_OCCUP")
	private String indCustOccup;
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
	@Column(name="IND_MBL_PHONE1")
	private String indMblPhone1;
	@Column(name="IND_MBL_PHONE2")
	private String indMblPhone2;
	@Column(name="IND_OFF_AREA_PH")
	private String indOffAreaPh;
	@Column(name="IND_OFF_PHONE")
	private String indOffphone;
	@Column(name="IND_OFFPHONE_EXT1")
	private String indOffphoneExt1;
	@Column(name="IND_OFFPHONE_EXT2")
	private String indOffphoneExt2;
	@Column(name="IND_EMGRCY_ADDR")
	private String indEmgrcyAddr;
	@Column(name="IND_EMGRCY_RT")
	private String indEmgrcyRt;
	@Column(name="IND_EMGRCY_RW")
	private String indEmgrcyRw;
	@Column(name="IND_EMGRCY_KEL")
	private String indEmgrcyKel;
	@Column(name="IND_EMGRCY_KEC")
	private String indEmgrcyKec;
	@Column(name="IND_EMGRCY_KABKOTA")
	private String indEmgrcyKabkota;
	@Column(name="IND_EMGRCY_PROV")
	private String indEmgrcyProv;
	@Column(name="IND_EMGRCY_ZIP")
	private String indEmgrcyZip;
	@Column(name="IND_EMGRCY_AREA_PH")
	private String indEmgrcyAreaPh;
	@Column(name="IND_EMGRCY_PHONE")
	private String indEmgrcyPhone;
	@Column(name="IND_EMGRCY_MBLPHONE")
	private String indEmgrcyMblphone;
	@Column(name="IND_CUST_WARGANEGARA")
	private String indCustWarganegara;
	@Column(name="IND_GOL_DARAH")
	private String indGolDarah;
	@Column(name="IND_CUST_RACE")
	private String indCustRace;
	@Column(name="IND_FAVORITE_COLOR")
	private String indFavoriteColor;
	@Column(name="IND_UKURAN_BAJU")
	private String indUkuranBaju;
	@Column(name="IND_SPOUSE_CUST_ID")
	private String indSpouseCustId;
	@Column(name="IND_PARENT_CUST_ID")
	private String indParentCustId;
	@Column(name="IND_OTHERS_BUSINESS1")
	private String indOthersBusiness1;
	@Column(name="IND_OTHERS_BUSINESS2")
	private String indOthersBusiness2;
	@Column(name="IND_OTHERS_BUSINESS3")
	private String indOthersBusiness3;
	@Column(name="IND_SPECIAL_INFO")
	private String indSpecialInfo;
	@Column(name="IND_HOBBY_BACA")
	private String indHobbyBaca;
	@Column(name="IND_HOBBY_BELANJA")
	private String indHobbyBelanja;
	@Column(name="IND_HOBBY_SENI")
	private String indHobbySeni;
	@Column(name="IND_HOBBY_SENI_DESC")
	private String indHobbySeniDesc;
	@Column(name="IND_HOBBY_MEMANCING")
	private String indHobbyMemancing;
	@Column(name="IND_HOBBY_TRAVELING")
	private String indHobbyTraveling;
	@Column(name="IND_HOBBY_KOLEKSI")
	private String indHobbyKoleksi;
	@Column(name="IND_HOBBY_KOLEKSI_DESC")
	private String indHobbyKoleksiDesc;
	@Column(name="IND_HOBBY_MUSIK")
	private String indHobbyMusik;
	@Column(name="IND_HOBBY_OLAHRAGA")
	private String indHobbyOlahraga;
	@Column(name="IND_HOBBY_OLAHRAGA_DESC")
	private String indHobbyOlahragaDesc;
	@Column(name="IND_HOBBY_OTO_MTR")
	private String indHobbyOtoMtr;
	@Column(name="IND_HOBBY_OTO_MBL")
	private String indHobbyOtoMbl;
	@Column(name="IND_HOBBY_MENYELAM")
	private String indHobbyMenyelam;
	@Column(name="IND_HOBBY_PECINTA_ALA")
	private String indHobbyPecintaAla;
	@Column(name="IND_HOBBY_PIARA_BNTG")
	private String indHobbyPiaraBntg;
	@Column(name="IND_HOBBY_PIARA_DESC")
	private String indHobbyPiaraDesc;
	@Column(name="IND_HOBBY_OTHERS")
	private String indHobbyOthers;
	@Column(name="IND_HOBBY_OTHERS_DESC")
	private String indHobbyOthersDesc;
	@Column(name="IND_CREATED_BY")
	private String indCreatedBy;
	@Column(name="IND_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date indCreatedDate;
	@Column(name="IND_UPDATED_BY")
	private String indUpdatedBy;
	@Column(name="IND_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date indUpdatedDate;
	@Column(name="IND_EMGRCY_NAME")
	private String indEmgrcyName;
	@Column(name="IND_EMAIL_ADDR")
	private String indEmailAddr;
	@Column(name="IND_NAMA_BI")
	private String indnamaBi;
	@Column(name="IND_GELAR")
	private String indGelar;
	@Column(name="IND_DOM_ADDR")
	private String indDomAddr;
	
	public String getIndCustId() {
		return indCustId;
	}
	public void setIndCustId(String indCustId) {
		this.indCustId = indCustId;
	}
	public String getIndNickname() {
		return indNickname;
	}
	public void setIndNickname(String indNickname) {
		this.indNickname = indNickname;
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
	public String getIndMaritalSts() {
		return indMaritalSts;
	}
	public void setIndMaritalSts(String indMaritalSts) {
		this.indMaritalSts = indMaritalSts;
	}
	public Date getIndMarriedDate() {
		return indMarriedDate;
	}
	public void setIndMarriedDate(Date indMarriedDate) {
		this.indMarriedDate = indMarriedDate;
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
	public String getIndCustCategry() {
		return indCustCategry;
	}
	public void setIndCustCategry(String indCustCategry) {
		this.indCustCategry = indCustCategry;
	}
	public String getIndCustOccup() {
		return indCustOccup;
	}
	public void setIndCustOccup(String indCustOccup) {
		this.indCustOccup = indCustOccup;
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
	public String getIndMblPhone1() {
		return indMblPhone1;
	}
	public void setIndMblPhone1(String indMblPhone1) {
		this.indMblPhone1 = indMblPhone1;
	}
	public String getIndMblPhone2() {
		return indMblPhone2;
	}
	public void setIndMblPhone2(String indMblPhone2) {
		this.indMblPhone2 = indMblPhone2;
	}
	public String getIndOffAreaPh() {
		return indOffAreaPh;
	}
	public void setIndOffAreaPh(String indOffAreaPh) {
		this.indOffAreaPh = indOffAreaPh;
	}
	public String getIndOffphone() {
		return indOffphone;
	}
	public void setIndOffphone(String indOffphone) {
		this.indOffphone = indOffphone;
	}
	public String getIndOffphoneExt1() {
		return indOffphoneExt1;
	}
	public void setIndOffphoneExt1(String indOffphoneExt1) {
		this.indOffphoneExt1 = indOffphoneExt1;
	}
	public String getIndOffphoneExt2() {
		return indOffphoneExt2;
	}
	public void setIndOffphoneExt2(String indOffphoneExt2) {
		this.indOffphoneExt2 = indOffphoneExt2;
	}
	public String getIndEmgrcyAddr() {
		return indEmgrcyAddr;
	}
	public void setIndEmgrcyAddr(String indEmgrcyAddr) {
		this.indEmgrcyAddr = indEmgrcyAddr;
	}
	public String getIndEmgrcyRt() {
		return indEmgrcyRt;
	}
	public void setIndEmgrcyRt(String indEmgrcyRt) {
		this.indEmgrcyRt = indEmgrcyRt;
	}
	public String getIndEmgrcyRw() {
		return indEmgrcyRw;
	}
	public void setIndEmgrcyRw(String indEmgrcyRw) {
		this.indEmgrcyRw = indEmgrcyRw;
	}
	public String getIndEmgrcyKel() {
		return indEmgrcyKel;
	}
	public void setIndEmgrcyKel(String indEmgrcyKel) {
		this.indEmgrcyKel = indEmgrcyKel;
	}
	public String getIndEmgrcyKec() {
		return indEmgrcyKec;
	}
	public void setIndEmgrcyKec(String indEmgrcyKec) {
		this.indEmgrcyKec = indEmgrcyKec;
	}
	public String getIndEmgrcyKabkota() {
		return indEmgrcyKabkota;
	}
	public void setIndEmgrcyKabkota(String indEmgrcyKabkota) {
		this.indEmgrcyKabkota = indEmgrcyKabkota;
	}
	public String getIndEmgrcyProv() {
		return indEmgrcyProv;
	}
	public void setIndEmgrcyProv(String indEmgrcyProv) {
		this.indEmgrcyProv = indEmgrcyProv;
	}
	public String getIndEmgrcyZip() {
		return indEmgrcyZip;
	}
	public void setIndEmgrcyZip(String indEmgrcyZip) {
		this.indEmgrcyZip = indEmgrcyZip;
	}
	public String getIndEmgrcyAreaPh() {
		return indEmgrcyAreaPh;
	}
	public void setIndEmgrcyAreaPh(String indEmgrcyAreaPh) {
		this.indEmgrcyAreaPh = indEmgrcyAreaPh;
	}
	public String getIndEmgrcyPhone() {
		return indEmgrcyPhone;
	}
	public void setIndEmgrcyPhone(String indEmgrcyPhone) {
		this.indEmgrcyPhone = indEmgrcyPhone;
	}
	public String getIndEmgrcyMblphone() {
		return indEmgrcyMblphone;
	}
	public void setIndEmgrcyMblphone(String indEmgrcyMblphone) {
		this.indEmgrcyMblphone = indEmgrcyMblphone;
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
	public String getIndCustRace() {
		return indCustRace;
	}
	public void setIndCustRace(String indCustRace) {
		this.indCustRace = indCustRace;
	}
	public String getIndFavoriteColor() {
		return indFavoriteColor;
	}
	public void setIndFavoriteColor(String indFavoriteColor) {
		this.indFavoriteColor = indFavoriteColor;
	}
	public String getIndUkuranBaju() {
		return indUkuranBaju;
	}
	public void setIndUkuranBaju(String indUkuranBaju) {
		this.indUkuranBaju = indUkuranBaju;
	}
	public String getIndSpouseCustId() {
		return indSpouseCustId;
	}
	public void setIndSpouseCustId(String indSpouseCustId) {
		this.indSpouseCustId = indSpouseCustId;
	}
	public String getIndParentCustId() {
		return indParentCustId;
	}
	public void setIndParentCustId(String indParentCustId) {
		this.indParentCustId = indParentCustId;
	}
	public String getIndOthersBusiness1() {
		return indOthersBusiness1;
	}
	public void setIndOthersBusiness1(String indOthersBusiness1) {
		this.indOthersBusiness1 = indOthersBusiness1;
	}
	public String getIndOthersBusiness2() {
		return indOthersBusiness2;
	}
	public void setIndOthersBusiness2(String indOthersBusiness2) {
		this.indOthersBusiness2 = indOthersBusiness2;
	}
	public String getIndOthersBusiness3() {
		return indOthersBusiness3;
	}
	public void setIndOthersBusiness3(String indOthersBusiness3) {
		this.indOthersBusiness3 = indOthersBusiness3;
	}
	public String getIndSpecialInfo() {
		return indSpecialInfo;
	}
	public void setIndSpecialInfo(String indSpecialInfo) {
		this.indSpecialInfo = indSpecialInfo;
	}
	public String getIndHobbyBaca() {
		return indHobbyBaca;
	}
	public void setIndHobbyBaca(String indHobbyBaca) {
		this.indHobbyBaca = indHobbyBaca;
	}
	public String getIndHobbyBelanja() {
		return indHobbyBelanja;
	}
	public void setIndHobbyBelanja(String indHobbyBelanja) {
		this.indHobbyBelanja = indHobbyBelanja;
	}
	public String getIndHobbySeni() {
		return indHobbySeni;
	}
	public void setIndHobbySeni(String indHobbySeni) {
		this.indHobbySeni = indHobbySeni;
	}
	public String getIndHobbySeniDesc() {
		return indHobbySeniDesc;
	}
	public void setIndHobbySeniDesc(String indHobbySeniDesc) {
		this.indHobbySeniDesc = indHobbySeniDesc;
	}
	public String getIndHobbyMemancing() {
		return indHobbyMemancing;
	}
	public void setIndHobbyMemancing(String indHobbyMemancing) {
		this.indHobbyMemancing = indHobbyMemancing;
	}
	public String getIndHobbyTraveling() {
		return indHobbyTraveling;
	}
	public void setIndHobbyTraveling(String indHobbyTraveling) {
		this.indHobbyTraveling = indHobbyTraveling;
	}
	public String getIndHobbyKoleksi() {
		return indHobbyKoleksi;
	}
	public void setIndHobbyKoleksi(String indHobbyKoleksi) {
		this.indHobbyKoleksi = indHobbyKoleksi;
	}
	public String getIndHobbyKoleksiDesc() {
		return indHobbyKoleksiDesc;
	}
	public void setIndHobbyKoleksiDesc(String indHobbyKoleksiDesc) {
		this.indHobbyKoleksiDesc = indHobbyKoleksiDesc;
	}
	public String getIndHobbyMusik() {
		return indHobbyMusik;
	}
	public void setIndHobbyMusik(String indHobbyMusik) {
		this.indHobbyMusik = indHobbyMusik;
	}
	public String getIndHobbyOlahraga() {
		return indHobbyOlahraga;
	}
	public void setIndHobbyOlahraga(String indHobbyOlahraga) {
		this.indHobbyOlahraga = indHobbyOlahraga;
	}
	public String getIndHobbyOlahragaDesc() {
		return indHobbyOlahragaDesc;
	}
	public void setIndHobbyOlahragaDesc(String indHobbyOlahragaDesc) {
		this.indHobbyOlahragaDesc = indHobbyOlahragaDesc;
	}
	public String getIndHobbyOtoMtr() {
		return indHobbyOtoMtr;
	}
	public void setIndHobbyOtoMtr(String indHobbyOtoMtr) {
		this.indHobbyOtoMtr = indHobbyOtoMtr;
	}
	public String getIndHobbyOtoMbl() {
		return indHobbyOtoMbl;
	}
	public void setIndHobbyOtoMbl(String indHobbyOtoMbl) {
		this.indHobbyOtoMbl = indHobbyOtoMbl;
	}
	public String getIndHobbyMenyelam() {
		return indHobbyMenyelam;
	}
	public void setIndHobbyMenyelam(String indHobbyMenyelam) {
		this.indHobbyMenyelam = indHobbyMenyelam;
	}
	public String getIndHobbyPecintaAla() {
		return indHobbyPecintaAla;
	}
	public void setIndHobbyPecintaAla(String indHobbyPecintaAla) {
		this.indHobbyPecintaAla = indHobbyPecintaAla;
	}
	public String getIndHobbyPiaraBntg() {
		return indHobbyPiaraBntg;
	}
	public void setIndHobbyPiaraBntg(String indHobbyPiaraBntg) {
		this.indHobbyPiaraBntg = indHobbyPiaraBntg;
	}
	public String getIndHobbyPiaraDesc() {
		return indHobbyPiaraDesc;
	}
	public void setIndHobbyPiaraDesc(String indHobbyPiaraDesc) {
		this.indHobbyPiaraDesc = indHobbyPiaraDesc;
	}
	public String getIndHobbyOthers() {
		return indHobbyOthers;
	}
	public void setIndHobbyOthers(String indHobbyOthers) {
		this.indHobbyOthers = indHobbyOthers;
	}
	public String getIndHobbyOthersDesc() {
		return indHobbyOthersDesc;
	}
	public void setIndHobbyOthersDesc(String indHobbyOthersDesc) {
		this.indHobbyOthersDesc = indHobbyOthersDesc;
	}
	public String getIndCreatedBy() {
		return indCreatedBy;
	}
	public void setIndCreatedBy(String indCreatedBy) {
		this.indCreatedBy = indCreatedBy;
	}
	public Date getIndCreatedDate() {
		return indCreatedDate;
	}
	public void setIndCreatedDate(Date indCreatedDate) {
		this.indCreatedDate = indCreatedDate;
	}
	public String getIndUpdatedBy() {
		return indUpdatedBy;
	}
	public void setIndUpdatedBy(String indUpdatedBy) {
		this.indUpdatedBy = indUpdatedBy;
	}
	public Date getIndUpdatedDate() {
		return indUpdatedDate;
	}
	public void setIndUpdatedDate(Date indUpdatedDate) {
		this.indUpdatedDate = indUpdatedDate;
	}
	public String getIndEmgrcyName() {
		return indEmgrcyName;
	}
	public void setIndEmgrcyName(String indEmgrcyName) {
		this.indEmgrcyName = indEmgrcyName;
	}
	public String getIndEmailAddr() {
		return indEmailAddr;
	}
	public void setIndEmailAddr(String indEmailAddr) {
		this.indEmailAddr = indEmailAddr;
	}
	public String getIndnamaBi() {
		return indnamaBi;
	}
	public void setIndnamaBi(String indnamaBi) {
		this.indnamaBi = indnamaBi;
	}
	public String getIndGelar() {
		return indGelar;
	}
	public void setIndGelar(String indGelar) {
		this.indGelar = indGelar;
	}
	public String getIndDomAddr() {
		return indDomAddr;
	}
	public void setIndDomAddr(String indDomAddr) {
		this.indDomAddr = indDomAddr;
	}
}
