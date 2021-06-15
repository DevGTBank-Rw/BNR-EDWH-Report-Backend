package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbFxtxn.class)
public class TbFxtxn implements Serializable {
	@Id
	private String country;
	private String leBook;
	private int yearMonth;
	private String currency;
	private BigDecimal openingBalance;
	private BigDecimal purchaseAmount;
	private BigDecimal otherInflowAmount;
	private BigDecimal salesAmount;
	private BigDecimal otherOutflowAmount;
	private BigDecimal closingBalance;

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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(BigDecimal openingBalance) {
		this.openingBalance = openingBalance;
	}

	public BigDecimal getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(BigDecimal purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public BigDecimal getOtherInflowAmount() {
		return otherInflowAmount;
	}

	public void setOtherInflowAmount(BigDecimal otherInflowAmount) {
		this.otherInflowAmount = otherInflowAmount;
	}

	public BigDecimal getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(BigDecimal salesAmount) {
		this.salesAmount = salesAmount;
	}

	public BigDecimal getOtherOutflowAmount() {
		return otherOutflowAmount;
	}

	public void setOtherOutflowAmount(BigDecimal otherOutflowAmount) {
		this.otherOutflowAmount = otherOutflowAmount;
	}

	public BigDecimal getClosingBalance() {
		return closingBalance;
	}

	public void setClosingBalance(BigDecimal closingBalance) {
		this.closingBalance = closingBalance;
	}

}