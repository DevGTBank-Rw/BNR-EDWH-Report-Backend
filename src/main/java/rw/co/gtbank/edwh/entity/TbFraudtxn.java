package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbFraudtxn.class)
public class TbFraudtxn implements Serializable {
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	@Id
	private int fraudSequence;
	private String visionOuc;
	private String nameFraudster;
	private String fraudBy;
	private String fraudType;
	private int fraudScheme;
	private String descriptionOfFraud;
	private boolean fraudTxnStatus;
	private String currency;
	private BigDecimal fraudAmountFcy;
	private BigDecimal fraudAmountLcy;
	private BigDecimal amountPaidFcy;
	private BigDecimal amountPaidLcy;
	private String adoptToAvoid;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLeBook() {
		return leBook;
	}

	public void setLeBook(String leBook) {
		this.leBook = leBook;
	}

	public java.sql.Date getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(java.sql.Date businessDate) {
		this.businessDate = businessDate;
	}

	public int getFraudSequence() {
		return fraudSequence;
	}

	public void setFraudSequence(int fraudSequence) {
		this.fraudSequence = fraudSequence;
	}

	public String getVisionOuc() {
		return visionOuc;
	}

	public void setVisionOuc(String visionOuc) {
		this.visionOuc = visionOuc;
	}

	public String getNameFraudster() {
		return nameFraudster;
	}

	public void setNameFraudster(String nameFraudster) {
		this.nameFraudster = nameFraudster;
	}

	public String getFraudBy() {
		return fraudBy;
	}

	public void setFraudBy(String fraudBy) {
		this.fraudBy = fraudBy;
	}

	public String getFraudType() {
		return fraudType;
	}

	public void setFraudType(String fraudType) {
		this.fraudType = fraudType;
	}

	public int getFraudScheme() {
		return fraudScheme;
	}

	public void setFraudScheme(int fraudScheme) {
		this.fraudScheme = fraudScheme;
	}

	public String getDescriptionOfFraud() {
		return descriptionOfFraud;
	}

	public void setDescriptionOfFraud(String descriptionOfFraud) {
		this.descriptionOfFraud = descriptionOfFraud;
	}

	public boolean isFraudTxnStatus() {
		return fraudTxnStatus;
	}

	public void setFraudTxnStatus(boolean fraudTxnStatus) {
		this.fraudTxnStatus = fraudTxnStatus;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getFraudAmountFcy() {
		return fraudAmountFcy;
	}

	public void setFraudAmountFcy(BigDecimal fraudAmountFcy) {
		this.fraudAmountFcy = fraudAmountFcy;
	}

	public BigDecimal getFraudAmountLcy() {
		return fraudAmountLcy;
	}

	public void setFraudAmountLcy(BigDecimal fraudAmountLcy) {
		this.fraudAmountLcy = fraudAmountLcy;
	}

	public BigDecimal getAmountPaidFcy() {
		return amountPaidFcy;
	}

	public void setAmountPaidFcy(BigDecimal amountPaidFcy) {
		this.amountPaidFcy = amountPaidFcy;
	}

	public BigDecimal getAmountPaidLcy() {
		return amountPaidLcy;
	}

	public void setAmountPaidLcy(BigDecimal amountPaidLcy) {
		this.amountPaidLcy = amountPaidLcy;
	}

	public String getAdoptToAvoid() {
		return adoptToAvoid;
	}

	public void setAdoptToAvoid(String adoptToAvoid) {
		this.adoptToAvoid = adoptToAvoid;
	}

}