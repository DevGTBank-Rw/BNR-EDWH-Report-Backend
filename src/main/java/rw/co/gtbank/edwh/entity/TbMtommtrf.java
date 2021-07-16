package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbMtommtrf.class)
public class TbMtommtrf implements Serializable {
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	private String mtoList;
	private String remittanceType;
	private String sequenceNumber;
	@Id
	private String customerName;
	private int idType;
	private String identificationNumber;
	private String otherPartyName;
	@Column(nullable = true)
	private Integer otherIdType;
	private String otherIdNumber;
	private String residentsFlag;
	private String remittanceCountry;
	private String currency;
	private String transactionPurpose;
	private BigDecimal amountLcy;
	private BigDecimal amountFcy;
	private BigDecimal feesAndCommission;

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

	public String getMtoList() {
		return mtoList;
	}

	public void setMtoList(String mtoList) {
		this.mtoList = mtoList;
	}

	public String getRemittanceType() {
		return remittanceType;
	}

	public void setRemittanceType(String remittanceType) {
		this.remittanceType = remittanceType;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getOtherPartyName() {
		return otherPartyName;
	}

	public void setOtherPartyName(String otherPartyName) {
		this.otherPartyName = otherPartyName;
	}

	public Integer getOtherIdType() {
		return otherIdType;
	}

	public void setOtherIdType(Integer otherIdType) {
		this.otherIdType = otherIdType;
	}

	public String getOtherIdNumber() {
		return otherIdNumber;
	}

	public void setOtherIdNumber(String otherIdNumber) {
		this.otherIdNumber = otherIdNumber;
	}

	public String getResidentsFlag() {
		return residentsFlag;
	}

	public void setResidentsFlag(String residentsFlag) {
		this.residentsFlag = residentsFlag;
	}

	public String getRemittanceCountry() {
		return remittanceCountry;
	}

	public void setRemittanceCountry(String remittanceCountry) {
		this.remittanceCountry = remittanceCountry;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTransactionPurpose() {
		return transactionPurpose;
	}

	public void setTransactionPurpose(String transactionPurpose) {
		this.transactionPurpose = transactionPurpose;
	}

	public BigDecimal getAmountLcy() {
		return amountLcy;
	}

	public void setAmountLcy(BigDecimal amountLcy) {
		this.amountLcy = amountLcy;
	}

	public BigDecimal getAmountFcy() {
		return amountFcy;
	}

	public void setAmountFcy(BigDecimal amountFcy) {
		this.amountFcy = amountFcy;
	}

	public BigDecimal getFeesAndCommission() {
		return feesAndCommission;
	}

	public void setFeesAndCommission(BigDecimal feesAndCommission) {
		this.feesAndCommission = feesAndCommission;
	}

}
