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
@Table(name="FIN_MST_PYMTCARD",schema="FINA")
public class FinMstPymtcard implements Serializable {

  @Id
  @Column(name="CARD_NAME")
  private String cardName;
  @Column(name="CARD_TYPE")
  private String cardType;
  @Column(name="CARD_CREATED_BY")
  private String cardCreatedBy;
  @Column(name="CARD_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date cardCreatedDate;
  @Column(name="CARD_UPDATED_BY")
  private String cardUpdatedBy;
  @Column(name="CARD_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date cardUpdatedDate;
  
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardCreatedBy() {
		return cardCreatedBy;
	}
	public void setCardCreatedBy(String cardCreatedBy) {
		this.cardCreatedBy = cardCreatedBy;
	}
	public Date getCardCreatedDate() {
		return cardCreatedDate;
	}
	public void setCardCreatedDate(Date cardCreatedDate) {
		this.cardCreatedDate = cardCreatedDate;
	}
	public String getCardUpdatedBy() {
		return cardUpdatedBy;
	}
	public void setCardUpdatedBy(String cardUpdatedBy) {
		this.cardUpdatedBy = cardUpdatedBy;
	}
	public Date getCardUpdatedDate() {
		return cardUpdatedDate;
	}
	public void setCardUpdatedDate(Date cardUpdatedDate) {
		this.cardUpdatedDate = cardUpdatedDate;
	}

}