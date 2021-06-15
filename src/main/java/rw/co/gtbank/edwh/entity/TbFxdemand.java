package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbFxdemand.class)
public class TbFxdemand implements Serializable {
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	@Id
	private int sequenceNumber;
	private String clientName;
	private String fxClientFlag;
	private String currency;
	private int nop;
	private BigDecimal amountRequestedLcy;
	private BigDecimal bankDemandAmountLcy;
	private BigDecimal amountAcceptedLcy;
	private String reasonForDemand;
	private java.sql.Date timeOfRequested;

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

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getFxClientFlag() {
		return fxClientFlag;
	}

	public void setFxClientFlag(String fxClientFlag) {
		this.fxClientFlag = fxClientFlag;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getNop() {
		return nop;
	}

	public void setNop(int nop) {
		this.nop = nop;
	}

	public BigDecimal getAmountRequestedLcy() {
		return amountRequestedLcy;
	}

	public void setAmountRequestedLcy(BigDecimal amountRequestedLcy) {
		this.amountRequestedLcy = amountRequestedLcy;
	}

	public BigDecimal getBankDemandAmountLcy() {
		return bankDemandAmountLcy;
	}

	public void setBankDemandAmountLcy(BigDecimal bankDemandAmountLcy) {
		this.bankDemandAmountLcy = bankDemandAmountLcy;
	}

	public BigDecimal getAmountAcceptedLcy() {
		return amountAcceptedLcy;
	}

	public void setAmountAcceptedLcy(BigDecimal amountAcceptedLcy) {
		this.amountAcceptedLcy = amountAcceptedLcy;
	}

	public String getReasonForDemand() {
		return reasonForDemand;
	}

	public void setReasonForDemand(String reasonForDemand) {
		this.reasonForDemand = reasonForDemand;
	}

	public java.sql.Date getTimeOfRequested() {
		return timeOfRequested;
	}

	public void setTimeOfRequested(java.sql.Date timeOfRequested) {
		this.timeOfRequested = timeOfRequested;
	}

}