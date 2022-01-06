package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbAnitcimat.class)
public class TbContDisb implements Serializable {
	@Id
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	private String contractId;
	private String currency;
	private int currentDisbursedAmount;
	private int previousDisbursedAmount;
	private java.sql.Date firstPaymentDate;

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

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getCurrentDisbursedAmount() {
		return currentDisbursedAmount;
	}

	public void setCurrentDisbursedAmount(int currentDisbursedAmount) {
		this.currentDisbursedAmount = currentDisbursedAmount;
	}

	public java.sql.Date getFeedDate() {
		return firstPaymentDate;
	}

	public void setFeedDate(java.sql.Date firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
	}

	public int getFeedStatus() {
		return previousDisbursedAmount;
	}

	public void setFeedStatus(int previousDisbursedAmount) {
		this.previousDisbursedAmount = previousDisbursedAmount;
	}

}
