package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbBouncecheq.class)
public class TbBouncecheq implements Serializable {
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	@Id
	private String accountNo;
	private String chequeNo;
	private java.sql.Date chequeIssuedDate;
	private String currency;
	private int chequeAmountFcy;
	private String bounceChequeReason;
	private String beneficiary;

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

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public java.sql.Date getChequeIssuedDate() {
		return chequeIssuedDate;
	}

	public void setChequeIssuedDate(java.sql.Date chequeIssuedDate) {
		this.chequeIssuedDate = chequeIssuedDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getChequeAmountFcy() {
		return chequeAmountFcy;
	}

	public void setChequeAmountFcy(int chequeAmountFcy) {
		this.chequeAmountFcy = chequeAmountFcy;
	}

	public String getBounceChequeReason() {
		return bounceChequeReason;
	}

	public void setBounceChequeReason(String bounceChequeReason) {
		this.bounceChequeReason = bounceChequeReason;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

}
