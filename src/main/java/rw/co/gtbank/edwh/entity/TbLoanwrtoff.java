package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@IdClass(TbLoanwrtoff.class)
public class TbLoanwrtoff implements Serializable {
	private String country;
	private String leBook;
	private int yearMonth;
	private String accountNo;
	@Id
	private String customerId;
	private BigDecimal onBalance;
	private String visionGl;
	private java.sql.Date writtenOffDate;

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

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public BigDecimal getOnBalance() {
		return onBalance;
	}

	public void setOnBalance(BigDecimal onBalance) {
		this.onBalance = onBalance;
	}

	public String getVisionGl() {
		return visionGl;
	}

	public void setVisionGl(String visionGl) {
		this.visionGl = visionGl;
	}

	public java.sql.Date getWrittenOffDate() {
		return writtenOffDate;
	}

	public void setWrittenOffDate(java.sql.Date writtenOffDate) {
		this.writtenOffDate = writtenOffDate;
	}

}
