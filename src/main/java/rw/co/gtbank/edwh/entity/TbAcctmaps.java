package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbAcctmaps.class)
public class TbAcctmaps implements Serializable  {
	private String country;
	private String leBook;
	@Id
	private String accountNo;
	private String productDr;
	private String productCr;
	private String frlLineBsDr;
	private String frlLineBsCr;
	private String frlLinePlDr;
	private String frlLinePlCr;
	private boolean accountsMappingStatus;
	private java.sql.Date dateLastModified;
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

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getProductDr() {
		return productDr;
	}

	public void setProductDr(String productDr) {
		this.productDr = productDr;
	}

	public String getProductCr() {
		return productCr;
	}

	public void setProductCr(String productCr) {
		this.productCr = productCr;
	}

	public String getFrlLineBsDr() {
		return frlLineBsDr;
	}

	public void setFrlLineBsDr(String frlLineBsDr) {
		this.frlLineBsDr = frlLineBsDr;
	}

	public String getFrlLineBsCr() {
		return frlLineBsCr;
	}

	public void setFrlLineBsCr(String frlLineBsCr) {
		this.frlLineBsCr = frlLineBsCr;
	}

	public String getFrlLinePlDr() {
		return frlLinePlDr;
	}

	public void setFrlLinePlDr(String frlLinePlDr) {
		this.frlLinePlDr = frlLinePlDr;
	}

	public String getFrlLinePlCr() {
		return frlLinePlCr;
	}

	public void setFrlLinePlCr(String frlLinePlCr) {
		this.frlLinePlCr = frlLinePlCr;
	}

	public boolean isAccountsMappingStatus() {
		return accountsMappingStatus;
	}

	public void setAccountsMappingStatus(boolean accountsMappingStatus) {
		this.accountsMappingStatus = accountsMappingStatus;
	}

	public java.sql.Date getDateLastModified() {
		return dateLastModified;
	}

	public void setDateLastModified(java.sql.Date dateLastModified) {
		this.dateLastModified = dateLastModified;
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

	@Override
	public String toString() {
		return "TbAcctmaps [country=" + country + ", leBook=" + leBook + ", accountNo=" + accountNo + ", productDr="
				+ productDr + ", productCr=" + productCr + ", frlLineBsDr=" + frlLineBsDr + ", frlLineBsCr="
				+ frlLineBsCr + ", frlLinePlDr=" + frlLinePlDr + ", frlLinePlCr=" + frlLinePlCr
				+ ", accountsMappingStatus=" + accountsMappingStatus + ", dateLastModified=" + dateLastModified
				+ ", feedDate=" + feedDate + ", feedStatus=" + feedStatus + "]";
	}

}
