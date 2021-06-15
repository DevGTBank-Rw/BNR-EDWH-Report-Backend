package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbContloan.class)
public class TbContloan implements Serializable {
	private String country;
	private String leBook;
	private int yearMonth;
	@Id
	private String contractId;
	private String performanceClass;
	private BigDecimal disbursedAmount;
	private BigDecimal prinOutstandingAmtFcy;
	private BigDecimal prinOutstandingAmtLcy;
	private BigDecimal interestDueFcy;
	private BigDecimal interestDueLcy;
	private BigDecimal regulatoryProvision;
	private BigDecimal provisionHeld;
	private java.sql.Date dateOfProvision;
	private BigDecimal loanIncludInterest;
	private BigDecimal otherCrPenalties;
	private BigDecimal otherCharges;
	private BigDecimal suspenseInterest;
	private String repaymentFrequency;
	private BigDecimal emiAmount;
	private java.sql.Date datePastDue;
	private BigDecimal dueAmount;
	private int gracePeriodAccorded;
	private int instalmentsInArrears;
	private int numOfInstalments;
	private BigDecimal totalInstalmentsPaid;
	private BigDecimal totalInstalmentsOutstanding;

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

	public String getPerformanceClass() {
		return performanceClass;
	}

	public void setPerformanceClass(String performanceClass) {
		this.performanceClass = performanceClass;
	}

	public BigDecimal getDisbursedAmount() {
		return disbursedAmount;
	}

	public void setDisbursedAmount(BigDecimal disbursedAmount) {
		this.disbursedAmount = disbursedAmount;
	}

	public BigDecimal getPrinOutstandingAmtFcy() {
		return prinOutstandingAmtFcy;
	}

	public void setPrinOutstandingAmtFcy(BigDecimal prinOutstandingAmtFcy) {
		this.prinOutstandingAmtFcy = prinOutstandingAmtFcy;
	}

	public BigDecimal getPrinOutstandingAmtLcy() {
		return prinOutstandingAmtLcy;
	}

	public void setPrinOutstandingAmtLcy(BigDecimal prinOutstandingAmtLcy) {
		this.prinOutstandingAmtLcy = prinOutstandingAmtLcy;
	}

	public BigDecimal getInterestDueFcy() {
		return interestDueFcy;
	}

	public void setInterestDueFcy(BigDecimal interestDueFcy) {
		this.interestDueFcy = interestDueFcy;
	}

	public BigDecimal getInterestDueLcy() {
		return interestDueLcy;
	}

	public void setInterestDueLcy(BigDecimal interestDueLcy) {
		this.interestDueLcy = interestDueLcy;
	}

	public BigDecimal getRegulatoryProvision() {
		return regulatoryProvision;
	}

	public void setRegulatoryProvision(BigDecimal regulatoryProvision) {
		this.regulatoryProvision = regulatoryProvision;
	}

	public BigDecimal getProvisionHeld() {
		return provisionHeld;
	}

	public void setProvisionHeld(BigDecimal provisionHeld) {
		this.provisionHeld = provisionHeld;
	}

	public java.sql.Date getDateOfProvision() {
		return dateOfProvision;
	}

	public void setDateOfProvision(java.sql.Date dateOfProvision) {
		this.dateOfProvision = dateOfProvision;
	}

	public BigDecimal getLoanIncludInterest() {
		return loanIncludInterest;
	}

	public void setLoanIncludInterest(BigDecimal loanIncludInterest) {
		this.loanIncludInterest = loanIncludInterest;
	}

	public BigDecimal getOtherCrPenalties() {
		return otherCrPenalties;
	}

	public void setOtherCrPenalties(BigDecimal otherCrPenalties) {
		this.otherCrPenalties = otherCrPenalties;
	}

	public BigDecimal getOtherCharges() {
		return otherCharges;
	}

	public void setOtherCharges(BigDecimal otherCharges) {
		this.otherCharges = otherCharges;
	}

	public BigDecimal getSuspenseInterest() {
		return suspenseInterest;
	}

	public void setSuspenseInterest(BigDecimal suspenseInterest) {
		this.suspenseInterest = suspenseInterest;
	}

	public String getRepaymentFrequency() {
		return repaymentFrequency;
	}

	public void setRepaymentFrequency(String repaymentFrequency) {
		this.repaymentFrequency = repaymentFrequency;
	}

	public BigDecimal getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(BigDecimal emiAmount) {
		this.emiAmount = emiAmount;
	}

	public java.sql.Date getDatePastDue() {
		return datePastDue;
	}

	public void setDatePastDue(java.sql.Date datePastDue) {
		this.datePastDue = datePastDue;
	}

	public BigDecimal getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(BigDecimal dueAmount) {
		this.dueAmount = dueAmount;
	}

	public int getGracePeriodAccorded() {
		return gracePeriodAccorded;
	}

	public void setGracePeriodAccorded(int gracePeriodAccorded) {
		this.gracePeriodAccorded = gracePeriodAccorded;
	}

	public int getInstalmentsInArrears() {
		return instalmentsInArrears;
	}

	public void setInstalmentsInArrears(int instalmentsInArrears) {
		this.instalmentsInArrears = instalmentsInArrears;
	}

	public int getNumOfInstalments() {
		return numOfInstalments;
	}

	public void setNumOfInstalments(int numOfInstalments) {
		this.numOfInstalments = numOfInstalments;
	}

	public BigDecimal getTotalInstalmentsPaid() {
		return totalInstalmentsPaid;
	}

	public void setTotalInstalmentsPaid(BigDecimal totalInstalmentsPaid) {
		this.totalInstalmentsPaid = totalInstalmentsPaid;
	}

	public BigDecimal getTotalInstalmentsOutstanding() {
		return totalInstalmentsOutstanding;
	}

	public void setTotalInstalmentsOutstanding(BigDecimal totalInstalmentsOutstanding) {
		this.totalInstalmentsOutstanding = totalInstalmentsOutstanding;
	}

}
