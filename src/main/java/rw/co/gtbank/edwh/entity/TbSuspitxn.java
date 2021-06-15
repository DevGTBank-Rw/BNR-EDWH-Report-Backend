package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@IdClass(TbSuspitxn.class)
public class TbSuspitxn implements Serializable {
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	private String fraudReportType;
	private int fraudSequence;
	private String visionOuc;
	@Id
	private String accountNo;
	private String surname;
	private String firstName;
	private String middleName;
	private String postalAddress;
	private java.sql.Date dateOfBirth;
	private String passportNumber;
	private int occupation;
	private String identityVerified;
	private String relationshipWithReportentity;
	private String actionTaken;
	private java.sql.Date resignationDate;
	private java.sql.Date transactionDate;
	private String transactionType;
	private String transactionNarration;
	private String currency;
	private BigDecimal fraudAmountFcy;
	private BigDecimal fraudAmountLcy;
	private BigDecimal amountPaidFcy;
	private BigDecimal amountPaidLcy;
	private String sourceOfFund;
	private String destinationFund;
	private String basisOfSuspicion;
	private String materialImpact;
	private String impactDescription;
	private String authority;
	private String howNotified;
	private String otherActionByReportEntity;
	private String reportingOfficerName;
	private String reportingOfficerPosition;

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

	public String getFraudReportType() {
		return fraudReportType;
	}

	public void setFraudReportType(String fraudReportType) {
		this.fraudReportType = fraudReportType;
	}

	public int getFraudSequence() {
		return fraudSequence;
	}

	public void setFraudSequence(int fraudSequence) {
		this.fraudSequence = fraudSequence;
	}

	public String getVisionOuc() {
		return visionOuc;
	}

	public void setVisionOuc(String visionOuc) {
		this.visionOuc = visionOuc;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public java.sql.Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public int getOccupation() {
		return occupation;
	}

	public void setOccupation(int occupation) {
		this.occupation = occupation;
	}

	public String getIdentityVerified() {
		return identityVerified;
	}

	public void setIdentityVerified(String identityVerified) {
		this.identityVerified = identityVerified;
	}

	public String getRelationshipWithReportentity() {
		return relationshipWithReportentity;
	}

	public void setRelationshipWithReportentity(String relationshipWithReportentity) {
		this.relationshipWithReportentity = relationshipWithReportentity;
	}

	public String getActionTaken() {
		return actionTaken;
	}

	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}

	public java.sql.Date getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(java.sql.Date resignationDate) {
		this.resignationDate = resignationDate;
	}

	public java.sql.Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(java.sql.Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionNarration() {
		return transactionNarration;
	}

	public void setTransactionNarration(String transactionNarration) {
		this.transactionNarration = transactionNarration;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getFraudAmountFcy() {
		return fraudAmountFcy;
	}

	public void setFraudAmountFcy(BigDecimal fraudAmountFcy) {
		this.fraudAmountFcy = fraudAmountFcy;
	}

	public BigDecimal getFraudAmountLcy() {
		return fraudAmountLcy;
	}

	public void setFraudAmountLcy(BigDecimal fraudAmountLcy) {
		this.fraudAmountLcy = fraudAmountLcy;
	}

	public BigDecimal getAmountPaidFcy() {
		return amountPaidFcy;
	}

	public void setAmountPaidFcy(BigDecimal amountPaidFcy) {
		this.amountPaidFcy = amountPaidFcy;
	}

	public BigDecimal getAmountPaidLcy() {
		return amountPaidLcy;
	}

	public void setAmountPaidLcy(BigDecimal amountPaidLcy) {
		this.amountPaidLcy = amountPaidLcy;
	}

	public String getSourceOfFund() {
		return sourceOfFund;
	}

	public void setSourceOfFund(String sourceOfFund) {
		this.sourceOfFund = sourceOfFund;
	}

	public String getDestinationFund() {
		return destinationFund;
	}

	public void setDestinationFund(String destinationFund) {
		this.destinationFund = destinationFund;
	}

	public String getBasisOfSuspicion() {
		return basisOfSuspicion;
	}

	public void setBasisOfSuspicion(String basisOfSuspicion) {
		this.basisOfSuspicion = basisOfSuspicion;
	}

	public String getMaterialImpact() {
		return materialImpact;
	}

	public void setMaterialImpact(String materialImpact) {
		this.materialImpact = materialImpact;
	}

	public String getImpactDescription() {
		return impactDescription;
	}

	public void setImpactDescription(String impactDescription) {
		this.impactDescription = impactDescription;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getHowNotified() {
		return howNotified;
	}

	public void setHowNotified(String howNotified) {
		this.howNotified = howNotified;
	}

	public String getOtherActionByReportEntity() {
		return otherActionByReportEntity;
	}

	public void setOtherActionByReportEntity(String otherActionByReportEntity) {
		this.otherActionByReportEntity = otherActionByReportEntity;
	}

	public String getReportingOfficerName() {
		return reportingOfficerName;
	}

	public void setReportingOfficerName(String reportingOfficerName) {
		this.reportingOfficerName = reportingOfficerName;
	}

	public String getReportingOfficerPosition() {
		return reportingOfficerPosition;
	}

	public void setReportingOfficerPosition(String reportingOfficerPosition) {
		this.reportingOfficerPosition = reportingOfficerPosition;
	}

}
