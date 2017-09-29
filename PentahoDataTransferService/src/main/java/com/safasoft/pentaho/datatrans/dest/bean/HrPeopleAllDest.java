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
@Table(name="HR_PEOPLE_ALL")
public class HrPeopleAllDest implements Serializable {

  @Id
  @Column(name="PERSON_ID")
  private Double personId;
  @Column(name="PERSON_FULL_NAME")
  private String personFullName;
  @Column(name="PERSON_STATUS")
  private String personStatus;
  @Column(name="PERSON_EFF_STARTDATE")
  @Temporal(TemporalType.DATE)
  private Date personEffStartdate;
  @Column(name="PERSON_MAIN_JOB")
  private String personMainJob;
  @Column(name="PERSON_OUTLET_ID")
  private String personOutletId;
  @Column(name="CREATED_BY")
  private String createdBy;
  @Column(name="CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date createdDate;
  @Column(name="UPDATED_BY")
  private String updatedBy;
  @Column(name="UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date updatedDate;
  @Column(name="PERSON_EMPL_ID")
  private String personEmplId;
  @Column(name="PERSON_EMPL_STS")
  private String personEmplSts;
  @Column(name="PERSON_EXT_JOB1")
  private String personExtJob1;
  @Column(name="PERSON_EXT_JOB2")
  private String personExtJob2;
  @Column(name="PERSON_DEPT_ID")
  private String personDeptId;
  @Column(name="PERSON_EFF_TERMDATE")
  @Temporal(TemporalType.DATE)
  private Date personEffTermdate;
  @Column(name="PERSON_KTP_NO")
  private String personKtpNo;
  @Column(name="PERSON_KTPEXPIRED_DATE")
  @Temporal(TemporalType.DATE)
  private Date personKtpexpiredDate;
  @Column(name="PERSON_ADDR")
  private String personAddr;
  @Column(name="PERSON_ADDR_RT")
  private String personAddrRt;
  @Column(name="PERSON_ADDR_RW")
  private String personAddrRw;
  @Column(name="PERSON_ADDR_KEL")
  private String personAddrKel;
  @Column(name="PERSON_ADDR_KEC")
  private String personAddrKec;
  @Column(name="PERSON_ADDR_KABKOTA")
  private String personAddrKabkota;
  @Column(name="PERSON_ADDR_PROV")
  private String personAddrProv;
  @Column(name="PERSON_ADDR_ZIP")
  private String personAddrZip;
  @Column(name="PERSON_NICKNAME")
  private String personNickname;
  @Column(name="PERSON_BIRTHPLACE")
  private String personBirthplace;
  @Column(name="PERSON_BIRTHDATE")
  @Temporal(TemporalType.DATE)
  private Date personBirthdate;
  @Column(name="PERSON_KELAMIN")
  private String personKelamin;
  @Column(name="PERSON_STS_RUMAH")
  private String personStsRumah;
  @Column(name="PERSON_MARITAL_STS")
  private String personMaritalSts;
  @Column(name="PERSON_MARRIED_DATE")
  @Temporal(TemporalType.DATE)
  private Date personMarriedDate;
  @Column(name="PERSON_MOTHER_NAME")
  private String personMotherName;
  @Column(name="PERSON_CUST_RELIGION")
  private String personCustReligion;
  @Column(name="PERSON_CUST_WARGANEGARA")
  private String personCustWarganegara;
  @Column(name="PERSON_GOL_DARAH")
  private String personGolDarah;
  @Column(name="PERSON_CUST_RACE")
  private String personCustRace;
  @Column(name="PERSON_FAVORITE_COLOR")
  private String personFavoriteColor;
  @Column(name="PERSON_UKURAN_BAJU")
  private String personUkuranBaju;
  @Column(name="PERSON_SPECIAL_INFO")
  private String personSpecialInfo;
  @Column(name="PERSON_HOBBY_BACA")
  private String personHobbyBaca;
  @Column(name="PERSON_HOBBY_BELANJA")
  private String personHobbyBelanja;
  @Column(name="PERSON_HOBBY_SENI")
  private String personHobbySeni;
  @Column(name="PERSON_HOBBY_SENI_DESC")
  private String personHobbySeniDesc;
  @Column(name="PERSON_HOBBY_MEMANCING")
  private String personHobbyMemancing;
  @Column(name="PERSON_HOBBY_TRAVELING")
  private String personHobbyTraveling;
  @Column(name="PERSON_HOBBY_KOLEKSI")
  private String personHobbyKoleksi;
  @Column(name="PERSON_HOBBY_KOLEKSI_DESC")
  private String personHobbyKoleksiDesc;
  @Column(name="PERSON_HOBBY_MUSIK")
  private String personHobbyMusik;
  @Column(name="PERSON_HOBBY_OLAHRAGA")
  private String personHobbyOlahraga;
  @Column(name="PERSON_HOBBY_OLAHRAGA_DESC")
  private String personHobbyOlahragaDesc;
  @Column(name="PERSON_HOBBY_OTO_MTR")
  private String personHobbyOtoMtr;
  @Column(name="PERSON_HOBBY_OTO_MBL")
  private String personHobbyOtoMbl;
  @Column(name="PERSON_HOBBY_MENYELAM")
  private String personHobbyMenyelam;
  @Column(name="PERSON_HOBBY_PECINTA_ALA")
  private String personHobbyPecintaAla;
  @Column(name="PERSON_HOBBY_PIARA_BNTG")
  private String personHobbyPiaraBntg;
  @Column(name="PERSON_HOBBY_PIARA_DESC")
  private String personHobbyPiaraDesc;
  @Column(name="PERSON_HOBBY_OTHERS")
  private String personHobbyOthers;
  @Column(name="PERSON_HOBBY_OTHERS_DESC")
  private String personHobbyOthersDesc;
  @Column(name="PERSON_FAMCARD_NO")
  private String personFamcardNo;
  @Column(name="PERSON_HBASE_OUTLETID")
  private String personHbaseOutletid;
  @Column(name="PERSON_NO_JAMSOSTEK")
  private String personNoJamsostek;
  @Column(name="PERSON_TGLMSK_JAMSOSTEK")
  @Temporal(TemporalType.DATE)
  private Date personTglmskJamsostek;
  @Column(name="PERSON_TGLKLR_JAMSOSTEK")
  @Temporal(TemporalType.DATE)
  private Date personTglklrJamsostek;
  @Column(name="PERSON_INSURANCE_ID")
  private String personInsuranceId;
  @Column(name="PERSON_INSURANCE_NO")
  private String personInsuranceNo;
  @Column(name="PERSON_TGLMSK_INSURANCE")
  @Temporal(TemporalType.DATE)
  private Date personTglmskInsurance;
  @Column(name="PERSON_PTKP_STATUS")
  private String personPtkpStatus;
  @Column(name="PERSON_NPWP_NO")
  private String personNpwpNo;
  @Column(name="PERSON_NPWP_ADDR")
  private String personNpwpAddr;
  @Column(name="PERSON_NPWP_RT")
  private String personNpwpRt;
  @Column(name="PERSON_NPWP_RW")
  private String personNpwpRw;
  @Column(name="PERSON_NPWP_KEL")
  private String personNpwpKel;
  @Column(name="PERSON_NPWP_KEC")
  private String personNpwpKec;
  @Column(name="PERSON_NPWP_KABKOTA")
  private String personNpwpKabkota;
  @Column(name="PERSON_NPWP_PROV")
  private String personNpwpProv;
  @Column(name="PERSON_NPWP_ZIP")
  private String personNpwpZip;
  @Column(name="PERSON_SUPERVISOR_ID")
  private Double personSupervisorId;
  @Column(name="PERSON_PROB_ENDDATE")
  @Temporal(TemporalType.DATE)
  private Date personProbEnddate;
  @Column(name="PERSON_DIVORCE_DATE")
  @Temporal(TemporalType.DATE)
  private Date personDivorceDate;
  @Column(name="PERSON_NUMB_CHILD")
  private Double personNumbChild;
  @Column(name="PERSON_STTS_UPD_DATE")
  @Temporal(TemporalType.DATE)
  private Date personSttsUpdDate;
  @Column(name="PERSON_FATHER_NAME")
  private String personFatherName;
  @Column(name="PERSON_JP_STATUS")
  private String personJpStatus;
  @Column(name="PERSON_NO_BPJS_KES")
  private String personNoBpjsKes;
  @Column(name="PERSON_TGLMSK_BPJS_KES")
  @Temporal(TemporalType.DATE)
  private Date personTglmskBpjsKes;
  @Column(name="PERSON_TGLKLR_BPJS_KES")
  @Temporal(TemporalType.DATE)
  private Date personTglklrBpjsKes;
  
	public Double getPersonId() {
		return personId;
	}
	public void setPersonId(Double personId) {
		this.personId = personId;
	}
	public String getPersonFullName() {
		return personFullName;
	}
	public void setPersonFullName(String personFullName) {
		this.personFullName = personFullName;
	}
	public String getPersonStatus() {
		return personStatus;
	}
	public void setPersonStatus(String personStatus) {
		this.personStatus = personStatus;
	}
	public Date getPersonEffStartdate() {
		return personEffStartdate;
	}
	public void setPersonEffStartdate(Date personEffStartdate) {
		this.personEffStartdate = personEffStartdate;
	}
	public String getPersonMainJob() {
		return personMainJob;
	}
	public void setPersonMainJob(String personMainJob) {
		this.personMainJob = personMainJob;
	}
	public String getPersonOutletId() {
		return personOutletId;
	}
	public void setPersonOutletId(String personOutletId) {
		this.personOutletId = personOutletId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getPersonEmplId() {
		return personEmplId;
	}
	public void setPersonEmplId(String personEmplId) {
		this.personEmplId = personEmplId;
	}
	public String getPersonEmplSts() {
		return personEmplSts;
	}
	public void setPersonEmplSts(String personEmplSts) {
		this.personEmplSts = personEmplSts;
	}
	public String getPersonExtJob1() {
		return personExtJob1;
	}
	public void setPersonExtJob1(String personExtJob1) {
		this.personExtJob1 = personExtJob1;
	}
	public String getPersonExtJob2() {
		return personExtJob2;
	}
	public void setPersonExtJob2(String personExtJob2) {
		this.personExtJob2 = personExtJob2;
	}
	public String getPersonDeptId() {
		return personDeptId;
	}
	public void setPersonDeptId(String personDeptId) {
		this.personDeptId = personDeptId;
	}
	public Date getPersonEffTermdate() {
		return personEffTermdate;
	}
	public void setPersonEffTermdate(Date personEffTermdate) {
		this.personEffTermdate = personEffTermdate;
	}
	public String getPersonKtpNo() {
		return personKtpNo;
	}
	public void setPersonKtpNo(String personKtpNo) {
		this.personKtpNo = personKtpNo;
	}
	public Date getPersonKtpexpiredDate() {
		return personKtpexpiredDate;
	}
	public void setPersonKtpexpiredDate(Date personKtpexpiredDate) {
		this.personKtpexpiredDate = personKtpexpiredDate;
	}
	public String getPersonAddr() {
		return personAddr;
	}
	public void setPersonAddr(String personAddr) {
		this.personAddr = personAddr;
	}
	public String getPersonAddrRt() {
		return personAddrRt;
	}
	public void setPersonAddrRt(String personAddrRt) {
		this.personAddrRt = personAddrRt;
	}
	public String getPersonAddrRw() {
		return personAddrRw;
	}
	public void setPersonAddrRw(String personAddrRw) {
		this.personAddrRw = personAddrRw;
	}
	public String getPersonAddrKel() {
		return personAddrKel;
	}
	public void setPersonAddrKel(String personAddrKel) {
		this.personAddrKel = personAddrKel;
	}
	public String getPersonAddrKec() {
		return personAddrKec;
	}
	public void setPersonAddrKec(String personAddrKec) {
		this.personAddrKec = personAddrKec;
	}
	public String getPersonAddrKabkota() {
		return personAddrKabkota;
	}
	public void setPersonAddrKabkota(String personAddrKabkota) {
		this.personAddrKabkota = personAddrKabkota;
	}
	public String getPersonAddrProv() {
		return personAddrProv;
	}
	public void setPersonAddrProv(String personAddrProv) {
		this.personAddrProv = personAddrProv;
	}
	public String getPersonAddrZip() {
		return personAddrZip;
	}
	public void setPersonAddrZip(String personAddrZip) {
		this.personAddrZip = personAddrZip;
	}
	public String getPersonNickname() {
		return personNickname;
	}
	public void setPersonNickname(String personNickname) {
		this.personNickname = personNickname;
	}
	public String getPersonBirthplace() {
		return personBirthplace;
	}
	public void setPersonBirthplace(String personBirthplace) {
		this.personBirthplace = personBirthplace;
	}
	public Date getPersonBirthdate() {
		return personBirthdate;
	}
	public void setPersonBirthdate(Date personBirthdate) {
		this.personBirthdate = personBirthdate;
	}
	public String getPersonKelamin() {
		return personKelamin;
	}
	public void setPersonKelamin(String personKelamin) {
		this.personKelamin = personKelamin;
	}
	public String getPersonStsRumah() {
		return personStsRumah;
	}
	public void setPersonStsRumah(String personStsRumah) {
		this.personStsRumah = personStsRumah;
	}
	public String getPersonMaritalSts() {
		return personMaritalSts;
	}
	public void setPersonMaritalSts(String personMaritalSts) {
		this.personMaritalSts = personMaritalSts;
	}
	public Date getPersonMarriedDate() {
		return personMarriedDate;
	}
	public void setPersonMarriedDate(Date personMarriedDate) {
		this.personMarriedDate = personMarriedDate;
	}
	public String getPersonMotherName() {
		return personMotherName;
	}
	public void setPersonMotherName(String personMotherName) {
		this.personMotherName = personMotherName;
	}
	public String getPersonCustReligion() {
		return personCustReligion;
	}
	public void setPersonCustReligion(String personCustReligion) {
		this.personCustReligion = personCustReligion;
	}
	public String getPersonCustWarganegara() {
		return personCustWarganegara;
	}
	public void setPersonCustWarganegara(String personCustWarganegara) {
		this.personCustWarganegara = personCustWarganegara;
	}
	public String getPersonGolDarah() {
		return personGolDarah;
	}
	public void setPersonGolDarah(String personGolDarah) {
		this.personGolDarah = personGolDarah;
	}
	public String getPersonCustRace() {
		return personCustRace;
	}
	public void setPersonCustRace(String personCustRace) {
		this.personCustRace = personCustRace;
	}
	public String getPersonFavoriteColor() {
		return personFavoriteColor;
	}
	public void setPersonFavoriteColor(String personFavoriteColor) {
		this.personFavoriteColor = personFavoriteColor;
	}
	public String getPersonUkuranBaju() {
		return personUkuranBaju;
	}
	public void setPersonUkuranBaju(String personUkuranBaju) {
		this.personUkuranBaju = personUkuranBaju;
	}
	public String getPersonSpecialInfo() {
		return personSpecialInfo;
	}
	public void setPersonSpecialInfo(String personSpecialInfo) {
		this.personSpecialInfo = personSpecialInfo;
	}
	public String getPersonHobbyBaca() {
		return personHobbyBaca;
	}
	public void setPersonHobbyBaca(String personHobbyBaca) {
		this.personHobbyBaca = personHobbyBaca;
	}
	public String getPersonHobbyBelanja() {
		return personHobbyBelanja;
	}
	public void setPersonHobbyBelanja(String personHobbyBelanja) {
		this.personHobbyBelanja = personHobbyBelanja;
	}
	public String getPersonHobbySeni() {
		return personHobbySeni;
	}
	public void setPersonHobbySeni(String personHobbySeni) {
		this.personHobbySeni = personHobbySeni;
	}
	public String getPersonHobbySeniDesc() {
		return personHobbySeniDesc;
	}
	public void setPersonHobbySeniDesc(String personHobbySeniDesc) {
		this.personHobbySeniDesc = personHobbySeniDesc;
	}
	public String getPersonHobbyMemancing() {
		return personHobbyMemancing;
	}
	public void setPersonHobbyMemancing(String personHobbyMemancing) {
		this.personHobbyMemancing = personHobbyMemancing;
	}
	public String getPersonHobbyTraveling() {
		return personHobbyTraveling;
	}
	public void setPersonHobbyTraveling(String personHobbyTraveling) {
		this.personHobbyTraveling = personHobbyTraveling;
	}
	public String getPersonHobbyKoleksi() {
		return personHobbyKoleksi;
	}
	public void setPersonHobbyKoleksi(String personHobbyKoleksi) {
		this.personHobbyKoleksi = personHobbyKoleksi;
	}
	public String getPersonHobbyKoleksiDesc() {
		return personHobbyKoleksiDesc;
	}
	public void setPersonHobbyKoleksiDesc(String personHobbyKoleksiDesc) {
		this.personHobbyKoleksiDesc = personHobbyKoleksiDesc;
	}
	public String getPersonHobbyMusik() {
		return personHobbyMusik;
	}
	public void setPersonHobbyMusik(String personHobbyMusik) {
		this.personHobbyMusik = personHobbyMusik;
	}
	public String getPersonHobbyOlahraga() {
		return personHobbyOlahraga;
	}
	public void setPersonHobbyOlahraga(String personHobbyOlahraga) {
		this.personHobbyOlahraga = personHobbyOlahraga;
	}
	public String getPersonHobbyOlahragaDesc() {
		return personHobbyOlahragaDesc;
	}
	public void setPersonHobbyOlahragaDesc(String personHobbyOlahragaDesc) {
		this.personHobbyOlahragaDesc = personHobbyOlahragaDesc;
	}
	public String getPersonHobbyOtoMtr() {
		return personHobbyOtoMtr;
	}
	public void setPersonHobbyOtoMtr(String personHobbyOtoMtr) {
		this.personHobbyOtoMtr = personHobbyOtoMtr;
	}
	public String getPersonHobbyOtoMbl() {
		return personHobbyOtoMbl;
	}
	public void setPersonHobbyOtoMbl(String personHobbyOtoMbl) {
		this.personHobbyOtoMbl = personHobbyOtoMbl;
	}
	public String getPersonHobbyMenyelam() {
		return personHobbyMenyelam;
	}
	public void setPersonHobbyMenyelam(String personHobbyMenyelam) {
		this.personHobbyMenyelam = personHobbyMenyelam;
	}
	public String getPersonHobbyPecintaAla() {
		return personHobbyPecintaAla;
	}
	public void setPersonHobbyPecintaAla(String personHobbyPecintaAla) {
		this.personHobbyPecintaAla = personHobbyPecintaAla;
	}
	public String getPersonHobbyPiaraBntg() {
		return personHobbyPiaraBntg;
	}
	public void setPersonHobbyPiaraBntg(String personHobbyPiaraBntg) {
		this.personHobbyPiaraBntg = personHobbyPiaraBntg;
	}
	public String getPersonHobbyPiaraDesc() {
		return personHobbyPiaraDesc;
	}
	public void setPersonHobbyPiaraDesc(String personHobbyPiaraDesc) {
		this.personHobbyPiaraDesc = personHobbyPiaraDesc;
	}
	public String getPersonHobbyOthers() {
		return personHobbyOthers;
	}
	public void setPersonHobbyOthers(String personHobbyOthers) {
		this.personHobbyOthers = personHobbyOthers;
	}
	public String getPersonHobbyOthersDesc() {
		return personHobbyOthersDesc;
	}
	public void setPersonHobbyOthersDesc(String personHobbyOthersDesc) {
		this.personHobbyOthersDesc = personHobbyOthersDesc;
	}
	public String getPersonFamcardNo() {
		return personFamcardNo;
	}
	public void setPersonFamcardNo(String personFamcardNo) {
		this.personFamcardNo = personFamcardNo;
	}
	public String getPersonHbaseOutletid() {
		return personHbaseOutletid;
	}
	public void setPersonHbaseOutletid(String personHbaseOutletid) {
		this.personHbaseOutletid = personHbaseOutletid;
	}
	public String getPersonNoJamsostek() {
		return personNoJamsostek;
	}
	public void setPersonNoJamsostek(String personNoJamsostek) {
		this.personNoJamsostek = personNoJamsostek;
	}
	public Date getPersonTglmskJamsostek() {
		return personTglmskJamsostek;
	}
	public void setPersonTglmskJamsostek(Date personTglmskJamsostek) {
		this.personTglmskJamsostek = personTglmskJamsostek;
	}
	public Date getPersonTglklrJamsostek() {
		return personTglklrJamsostek;
	}
	public void setPersonTglklrJamsostek(Date personTglklrJamsostek) {
		this.personTglklrJamsostek = personTglklrJamsostek;
	}
	public String getPersonInsuranceId() {
		return personInsuranceId;
	}
	public void setPersonInsuranceId(String personInsuranceId) {
		this.personInsuranceId = personInsuranceId;
	}
	public String getPersonInsuranceNo() {
		return personInsuranceNo;
	}
	public void setPersonInsuranceNo(String personInsuranceNo) {
		this.personInsuranceNo = personInsuranceNo;
	}
	public Date getPersonTglmskInsurance() {
		return personTglmskInsurance;
	}
	public void setPersonTglmskInsurance(Date personTglmskInsurance) {
		this.personTglmskInsurance = personTglmskInsurance;
	}
	public String getPersonPtkpStatus() {
		return personPtkpStatus;
	}
	public void setPersonPtkpStatus(String personPtkpStatus) {
		this.personPtkpStatus = personPtkpStatus;
	}
	public String getPersonNpwpNo() {
		return personNpwpNo;
	}
	public void setPersonNpwpNo(String personNpwpNo) {
		this.personNpwpNo = personNpwpNo;
	}
	public String getPersonNpwpAddr() {
		return personNpwpAddr;
	}
	public void setPersonNpwpAddr(String personNpwpAddr) {
		this.personNpwpAddr = personNpwpAddr;
	}
	public String getPersonNpwpRt() {
		return personNpwpRt;
	}
	public void setPersonNpwpRt(String personNpwpRt) {
		this.personNpwpRt = personNpwpRt;
	}
	public String getPersonNpwpRw() {
		return personNpwpRw;
	}
	public void setPersonNpwpRw(String personNpwpRw) {
		this.personNpwpRw = personNpwpRw;
	}
	public String getPersonNpwpKel() {
		return personNpwpKel;
	}
	public void setPersonNpwpKel(String personNpwpKel) {
		this.personNpwpKel = personNpwpKel;
	}
	public String getPersonNpwpKec() {
		return personNpwpKec;
	}
	public void setPersonNpwpKec(String personNpwpKec) {
		this.personNpwpKec = personNpwpKec;
	}
	public String getPersonNpwpKabkota() {
		return personNpwpKabkota;
	}
	public void setPersonNpwpKabkota(String personNpwpKabkota) {
		this.personNpwpKabkota = personNpwpKabkota;
	}
	public String getPersonNpwpProv() {
		return personNpwpProv;
	}
	public void setPersonNpwpProv(String personNpwpProv) {
		this.personNpwpProv = personNpwpProv;
	}
	public String getPersonNpwpZip() {
		return personNpwpZip;
	}
	public void setPersonNpwpZip(String personNpwpZip) {
		this.personNpwpZip = personNpwpZip;
	}
	public Double getPersonSupervisorId() {
		return personSupervisorId;
	}
	public void setPersonSupervisorId(Double personSupervisorId) {
		this.personSupervisorId = personSupervisorId;
	}
	public Date getPersonProbEnddate() {
		return personProbEnddate;
	}
	public void setPersonProbEnddate(Date personProbEnddate) {
		this.personProbEnddate = personProbEnddate;
	}
	public Date getPersonDivorceDate() {
		return personDivorceDate;
	}
	public void setPersonDivorceDate(Date personDivorceDate) {
		this.personDivorceDate = personDivorceDate;
	}
	public Double getPersonNumbChild() {
		return personNumbChild;
	}
	public void setPersonNumbChild(Double personNumbChild) {
		this.personNumbChild = personNumbChild;
	}
	public Date getPersonSttsUpdDate() {
		return personSttsUpdDate;
	}
	public void setPersonSttsUpdDate(Date personSttsUpdDate) {
		this.personSttsUpdDate = personSttsUpdDate;
	}
	public String getPersonFatherName() {
		return personFatherName;
	}
	public void setPersonFatherName(String personFatherName) {
		this.personFatherName = personFatherName;
	}
	public String getPersonJpStatus() {
		return personJpStatus;
	}
	public void setPersonJpStatus(String personJpStatus) {
		this.personJpStatus = personJpStatus;
	}
	public String getPersonNoBpjsKes() {
		return personNoBpjsKes;
	}
	public void setPersonNoBpjsKes(String personNoBpjsKes) {
		this.personNoBpjsKes = personNoBpjsKes;
	}
	public Date getPersonTglmskBpjsKes() {
		return personTglmskBpjsKes;
	}
	public void setPersonTglmskBpjsKes(Date personTglmskBpjsKes) {
		this.personTglmskBpjsKes = personTglmskBpjsKes;
	}
	public Date getPersonTglklrBpjsKes() {
		return personTglklrBpjsKes;
	}
	public void setPersonTglklrBpjsKes(Date personTglklrBpjsKes) {
		this.personTglklrBpjsKes = personTglklrBpjsKes;
	}

}