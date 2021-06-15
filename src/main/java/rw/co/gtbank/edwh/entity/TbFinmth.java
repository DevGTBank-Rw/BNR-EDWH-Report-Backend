package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbFinmth.class)
public class TbFinmth implements Serializable {
	private String country;
	private String leBook;
	private int yearMonth;
	private String customerId;
	@Id
	private String accountNo;
	private String officeAccount;
	private String visionGl;
	private String residentsFlag;
	private String currency;
	private BigDecimal amountFcy;
	private BigDecimal amountLcy;
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

	public String getOfficeAccount() {
		return officeAccount;
	}

	public void setOfficeAccount(String officeAccount) {
		this.officeAccount = officeAccount;
	}

	public String getVisionGl() {
		return visionGl;
	}

	public void setVisionGl(String visionGl) {
		this.visionGl = visionGl;
	}

	public String getResidentsFlag() {
		return residentsFlag;
	}

	public void setResidentsFlag(String residentsFlag) {
		this.residentsFlag = residentsFlag;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getAmountFcy() {
		return amountFcy;
	}

	public void setAmountFcy(BigDecimal amountFcy) {
		this.amountFcy = amountFcy;
	}

	public BigDecimal getAmountLcy() {
		return amountLcy;
	}

	public void setAmountLcy(BigDecimal amountLcy) {
		this.amountLcy = amountLcy;
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