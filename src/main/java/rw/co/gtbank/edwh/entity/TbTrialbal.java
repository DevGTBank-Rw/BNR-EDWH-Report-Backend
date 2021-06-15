package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@IdClass(TbTrialbal.class)
public class TbTrialbal implements Serializable {
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	@Id
	private String officeAccount;
	private String visionGl;
	private String visionOuc;
	private String currency;
	private BigDecimal tranCcyDr;
	private BigDecimal tranCcyCr;
	private BigDecimal lcyCcyDr;
	private BigDecimal lcyCcyCr;
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

	public String getVisionOuc() {
		return visionOuc;
	}

	public void setVisionOuc(String visionOuc) {
		this.visionOuc = visionOuc;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getTranCcyDr() {
		return tranCcyDr;
	}

	public void setTranCcyDr(BigDecimal tranCcyDr) {
		this.tranCcyDr = tranCcyDr;
	}

	public BigDecimal getTranCcyCr() {
		return tranCcyCr;
	}

	public void setTranCcyCr(BigDecimal tranCcyCr) {
		this.tranCcyCr = tranCcyCr;
	}

	public BigDecimal getLcyCcyDr() {
		return lcyCcyDr;
	}

	public void setLcyCcyDr(BigDecimal lcyCcyDr) {
		this.lcyCcyDr = lcyCcyDr;
	}

	public BigDecimal getLcyCcyCr() {
		return lcyCcyCr;
	}

	public void setLcyCcyCr(BigDecimal lcyCcyCr) {
		this.lcyCcyCr = lcyCcyCr;
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
