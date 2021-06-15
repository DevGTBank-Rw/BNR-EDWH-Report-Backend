package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbLoanapp2.class)
public class TbLoanapp2 implements Serializable {
	private String country;
	private String leBook;
	private String loanApplicationId;
	private int loanApplicationType;
	private java.sql.Date businessDate;
	@Id
	private String customerId;
	private String customerName;
	private String customerGender;
	private String visionOuc;
	private String loanPurpose;
	private String loanUtilizationLocation;
	private String visionSbu;
	private String economicSectorCode;
	private java.sql.Date applicationDate;
	private String applicationStatus;
	private String currency;
	private BigDecimal appliedAmountLcy;
	private BigDecimal appliedAmountFcy;
	private BigDecimal approvedAmountLcy;
	private BigDecimal approvedAmountFcy;
	private String rejectionReason;
	private String prevLoanPaid;
	private String loanInOtherInstitutions;

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

	public String getLoanApplicationId() {
		return loanApplicationId;
	}

	public void setLoanApplicationId(String loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	public int getLoanApplicationType() {
		return loanApplicationType;
	}

	public void setLoanApplicationType(int loanApplicationType) {
		this.loanApplicationType = loanApplicationType;
	}

	public java.sql.Date getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(java.sql.Date businessDate) {
		this.businessDate = businessDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getVisionOuc() {
		return visionOuc;
	}

	public void setVisionOuc(String visionOuc) {
		this.visionOuc = visionOuc;
	}

	public String getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public String getLoanUtilizationLocation() {
		return loanUtilizationLocation;
	}

	public void setLoanUtilizationLocation(String loanUtilizationLocation) {
		this.loanUtilizationLocation = loanUtilizationLocation;
	}

	public String getVisionSbu() {
		return visionSbu;
	}

	public void setVisionSbu(String visionSbu) {
		this.visionSbu = visionSbu;
	}

	public String getEconomicSectorCode() {
		return economicSectorCode;
	}

	public void setEconomicSectorCode(String economicSectorCode) {
		this.economicSectorCode = economicSectorCode;
	}

	public java.sql.Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(java.sql.Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	
	public BigDecimal getAppliedAmountLcy() {
		return appliedAmountLcy;
	}

	public void setAppliedAmountLcy(BigDecimal appliedAmountLcy) {
		this.appliedAmountLcy = appliedAmountLcy;
	}

	public BigDecimal getAppliedAmountFcy() {
		return appliedAmountFcy;
	}

	public void setAppliedAmountFcy(BigDecimal appliedAmountFcy) {
		this.appliedAmountFcy = appliedAmountFcy;
	}

	public BigDecimal getApprovedAmountLcy() {
		return approvedAmountLcy;
	}

	public void setApprovedAmountLcy(BigDecimal approvedAmountLcy) {
		this.approvedAmountLcy = approvedAmountLcy;
	}

	public BigDecimal getApprovedAmountFcy() {
		return approvedAmountFcy;
	}

	public void setApprovedAmountFcy(BigDecimal approvedAmountFcy) {
		this.approvedAmountFcy = approvedAmountFcy;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public String getPrevLoanPaid() {
		return prevLoanPaid;
	}

	public void setPrevLoanPaid(String prevLoanPaid) {
		this.prevLoanPaid = prevLoanPaid;
	}

	public String getLoanInOtherInstitutions() {
		return loanInOtherInstitutions;
	}

	public void setLoanInOtherInstitutions(String loanInOtherInstitutions) {
		this.loanInOtherInstitutions = loanInOtherInstitutions;
	}

}