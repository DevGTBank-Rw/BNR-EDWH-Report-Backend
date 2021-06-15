package rw.co.gtbank.edwh.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TbNplrecov.class)
public class TbNplrecov implements Serializable {
	private String country;
	private String leBook;
	private int yearMonth;
	@Id
	private String accountNo;
	private String customerId;
	private String visionGl;
	private int totalExposPrincipal;
	private int totalExposInterest;
	private int recoveryPrincipalAmount;
	private int recoveryInterestAmount;
	private java.sql.Date dateOfRecovery;
	private String deliquencyReason;
	private int recoveryAction;

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

	public String getVisionGl() {
		return visionGl;
	}

	public void setVisionGl(String visionGl) {
		this.visionGl = visionGl;
	}

	public int getTotalExposPrincipal() {
		return totalExposPrincipal;
	}

	public void setTotalExposPrincipal(int totalExposPrincipal) {
		this.totalExposPrincipal = totalExposPrincipal;
	}

	public int getTotalExposInterest() {
		return totalExposInterest;
	}

	public void setTotalExposInterest(int totalExposInterest) {
		this.totalExposInterest = totalExposInterest;
	}

	public int getRecoveryPrincipalAmount() {
		return recoveryPrincipalAmount;
	}

	public void setRecoveryPrincipalAmount(int recoveryPrincipalAmount) {
		this.recoveryPrincipalAmount = recoveryPrincipalAmount;
	}

	public int getRecoveryInterestAmount() {
		return recoveryInterestAmount;
	}

	public void setRecoveryInterestAmount(int recoveryInterestAmount) {
		this.recoveryInterestAmount = recoveryInterestAmount;
	}

	public java.sql.Date getDateOfRecovery() {
		return dateOfRecovery;
	}

	public void setDateOfRecovery(java.sql.Date dateOfRecovery) {
		this.dateOfRecovery = dateOfRecovery;
	}

	public String getDeliquencyReason() {
		return deliquencyReason;
	}

	public void setDeliquencyReason(String deliquencyReason) {
		this.deliquencyReason = deliquencyReason;
	}

	public int getRecoveryAction() {
		return recoveryAction;
	}

	public void setRecoveryAction(int recoveryAction) {
		this.recoveryAction = recoveryAction;
	}

}
