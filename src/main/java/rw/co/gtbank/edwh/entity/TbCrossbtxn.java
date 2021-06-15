package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbCrossbtxn.class)
public class TbCrossbtxn implements Serializable {
	@Id
	private String country;
	private String leBook;
	private int yearMonth;
	private int crossBorderClearanceType;
	private String transactionChannel;
	private String cardProduct;
	private int transCount;
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

	public int getYearMonth() {
		return yearMonth;
	}

	public void setYearMonth(int yearMonth) {
		this.yearMonth = yearMonth;
	}

	public int getCrossBorderClearanceType() {
		return crossBorderClearanceType;
	}

	public void setCrossBorderClearanceType(int crossBorderClearanceType) {
		this.crossBorderClearanceType = crossBorderClearanceType;
	}

	public String getTransactionChannel() {
		return transactionChannel;
	}

	public void setTransactionChannel(String transactionChannel) {
		this.transactionChannel = transactionChannel;
	}

	public String getCardProduct() {
		return cardProduct;
	}

	public void setCardProduct(String cardProduct) {
		this.cardProduct = cardProduct;
	}

	public int getTransCount() {
		return transCount;
	}

	public void setTransCount(int transCount) {
		this.transCount = transCount;
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
