package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbFintxn.class)
public class TbFintxn implements Serializable {
	private String country;
	private String leBook;
	private int yearMonth;
	@Id
	private String accountNo;
	private String processOuc;
	private String cardNo;
	private String merchantId;
	private String transactionChannel;
	private String transactionCode;
	private String currency;
	private int transCountDr;
	private int transCountCr;
	private BigDecimal transAmountDrFcy;
	private BigDecimal transAmountCrFcy;
	private BigDecimal transAmountDrLcy;
	private BigDecimal transAmountCrLcy;
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

	public int getYearMonth() {
		return yearMonth;
	}

	public void setYearMonth(int yearMonth) {
		this.yearMonth = yearMonth;
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

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getTransactionChannel() {
		return transactionChannel;
	}

	public void setTransactionChannel(String transactionChannel) {
		this.transactionChannel = transactionChannel;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getTransCountDr() {
		return transCountDr;
	}

	public void setTransCountDr(int transCountDr) {
		this.transCountDr = transCountDr;
	}

	public int getTransCountCr() {
		return transCountCr;
	}

	public void setTransCountCr(int transCountCr) {
		this.transCountCr = transCountCr;
	}

	public BigDecimal getTransAmountDrFcy() {
		return transAmountDrFcy;
	}

	public void setTransAmountDrFcy(BigDecimal transAmountDrFcy) {
		this.transAmountDrFcy = transAmountDrFcy;
	}

	public BigDecimal getTransAmountCrFcy() {
		return transAmountCrFcy;
	}

	public void setTransAmountCrFcy(BigDecimal transAmountCrFcy) {
		this.transAmountCrFcy = transAmountCrFcy;
	}

	public BigDecimal getTransAmountDrLcy() {
		return transAmountDrLcy;
	}

	public void setTransAmountDrLcy(BigDecimal transAmountDrLcy) {
		this.transAmountDrLcy = transAmountDrLcy;
	}

	public BigDecimal getTransAmountCrLcy() {
		return transAmountCrLcy;
	}

	public void setTransAmountCrLcy(BigDecimal transAmountCrLcy) {
		this.transAmountCrLcy = transAmountCrLcy;
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