package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbContsche.class)
public class TbContsche implements Serializable {

	private String country;
	private String leBook;
	private int yearMonth;
	@Id
	private String contractId;
	private java.sql.Date scheduleDate;
	private java.sql.Date paymentDate;
	private BigDecimal principalAmountDueLcy;
	private BigDecimal principalAmountDueFcy;
	private BigDecimal intAmountDueLcy;
	private BigDecimal intAmountDueFcy;
	private BigDecimal principalAmountPaidLcy;
	private BigDecimal principalAmountPaidFcy;
	private BigDecimal intAmountPaidLcy;
	private BigDecimal intAmountPaidFcy;
	private BigDecimal outstandingAmountLcy;
	private BigDecimal outstandingAmountFcy;

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

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public java.sql.Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(java.sql.Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public java.sql.Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(java.sql.Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getPrincipalAmountDueLcy() {
		return principalAmountDueLcy;
	}

	public void setPrincipalAmountDueLcy(BigDecimal principalAmountDueLcy) {
		this.principalAmountDueLcy = principalAmountDueLcy;
	}

	public BigDecimal getPrincipalAmountDueFcy() {
		return principalAmountDueFcy;
	}

	public void setPrincipalAmountDueFcy(BigDecimal principalAmountDueFcy) {
		this.principalAmountDueFcy = principalAmountDueFcy;
	}

	public BigDecimal getIntAmountDueLcy() {
		return intAmountDueLcy;
	}

	public void setIntAmountDueLcy(BigDecimal intAmountDueLcy) {
		this.intAmountDueLcy = intAmountDueLcy;
	}

	public BigDecimal getIntAmountDueFcy() {
		return intAmountDueFcy;
	}

	public void setIntAmountDueFcy(BigDecimal intAmountDueFcy) {
		this.intAmountDueFcy = intAmountDueFcy;
	}

	public BigDecimal getPrincipalAmountPaidLcy() {
		return principalAmountPaidLcy;
	}

	public void setPrincipalAmountPaidLcy(BigDecimal principalAmountPaidLcy) {
		this.principalAmountPaidLcy = principalAmountPaidLcy;
	}

	public BigDecimal getPrincipalAmountPaidFcy() {
		return principalAmountPaidFcy;
	}

	public void setPrincipalAmountPaidFcy(BigDecimal principalAmountPaidFcy) {
		this.principalAmountPaidFcy = principalAmountPaidFcy;
	}

	public BigDecimal getIntAmountPaidLcy() {
		return intAmountPaidLcy;
	}

	public void setIntAmountPaidLcy(BigDecimal intAmountPaidLcy) {
		this.intAmountPaidLcy = intAmountPaidLcy;
	}

	public BigDecimal getIntAmountPaidFcy() {
		return intAmountPaidFcy;
	}

	public void setIntAmountPaidFcy(BigDecimal intAmountPaidFcy) {
		this.intAmountPaidFcy = intAmountPaidFcy;
	}

	public BigDecimal getOutstandingAmountLcy() {
		return outstandingAmountLcy;
	}

	public void setOutstandingAmountLcy(BigDecimal outstandingAmountLcy) {
		this.outstandingAmountLcy = outstandingAmountLcy;
	}

	public BigDecimal getOutstandingAmountFcy() {
		return outstandingAmountFcy;
	}

	public void setOutstandingAmountFcy(BigDecimal outstandingAmountFcy) {
		this.outstandingAmountFcy = outstandingAmountFcy;
	}

}
