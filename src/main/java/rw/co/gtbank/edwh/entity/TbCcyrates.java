package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbCcyrates.class)
public class TbCcyrates implements Serializable {
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	@Id
	private String currency;
	private int midRate;
	private int buyRate;
	private int sellRate;
	private int transferMidRate;
	private int transferBuyRate;
	private int transferSellRate;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getMidRate() {
		return midRate;
	}

	public void setMidRate(int midRate) {
		this.midRate = midRate;
	}

	public int getBuyRate() {
		return buyRate;
	}

	public void setBuyRate(int buyRate) {
		this.buyRate = buyRate;
	}

	public int getSellRate() {
		return sellRate;
	}

	public void setSellRate(int sellRate) {
		this.sellRate = sellRate;
	}

	public int getTransferMidRate() {
		return transferMidRate;
	}

	public void setTransferMidRate(int transferMidRate) {
		this.transferMidRate = transferMidRate;
	}

	public int getTransferBuyRate() {
		return transferBuyRate;
	}

	public void setTransferBuyRate(int transferBuyRate) {
		this.transferBuyRate = transferBuyRate;
	}

	public int getTransferSellRate() {
		return transferSellRate;
	}

	public void setTransferSellRate(int transferSellRate) {
		this.transferSellRate = transferSellRate;
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
