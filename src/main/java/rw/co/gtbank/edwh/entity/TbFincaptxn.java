package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbFincaptxn.class)
public class TbFincaptxn implements Serializable {
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	private String customerId;
	@Id
	private String accountNo;
	private String processOuc;
	private String transactionReference;
	private String transactionNarration;
	private String currency;
	private BigDecimal transAmountFcy;
	private BigDecimal transAmountLcy;
	private java.sql.Date feedDate;
	private String feedStatus;

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

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getProcessOuc() {
		return processOuc;
	}

	public void setProcessOuc(String processOuc) {
		this.processOuc = processOuc;
	}

	public String getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	public String getTransactionNarration() {
		return transactionNarration;
	}

	public void setTransactionNarration(String transactionNarration) {
		this.transactionNarration = transactionNarration;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getTransAmountFcy() {
		return transAmountFcy;
	}

	public void setTransAmountFcy(BigDecimal transAmountFcy) {
		this.transAmountFcy = transAmountFcy;
	}

	public BigDecimal getTransAmountLcy() {
		return transAmountLcy;
	}

	public void setTransAmountLcy(BigDecimal transAmountLcy) {
		this.transAmountLcy = transAmountLcy;
	}

	public java.sql.Date getFeedDate() {
		return feedDate;
	}

	public void setFeedDate(java.sql.Date feedDate) {
		this.feedDate = feedDate;
	}

	public String getFeedStatus() {
		return feedStatus;
	}

	public void setFeedStatus(String feedStatus) {
		this.feedStatus = feedStatus;
	}

}