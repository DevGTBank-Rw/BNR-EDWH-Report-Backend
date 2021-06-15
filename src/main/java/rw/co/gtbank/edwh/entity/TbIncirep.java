package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbIncirep.class)
public class TbIncirep implements Serializable {
	private String country;
	private String leBook;
	@Id
	private String incidentId;
	private java.sql.Date dateOfOccurrence;
	private java.sql.Date dateOfAccounting;
	private java.sql.Date dateOfDetection;
	private java.sql.Date estimatedCompletionDate;
	private String businessLevel;
	private String internalBusinessLine;
	private String eventLevel;
	private BigDecimal netLossLcy;
	private String insuranceClaim;
	private BigDecimal insClaimAmt;
	private BigDecimal insClaimRec;
	private BigDecimal otherRecoveries;
	private BigDecimal totalRecoveries;
	private String causeSummary;
	private String actionPlanSummary;
	private java.sql.Date dateLastModified;

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

	public String getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(String incidentId) {
		this.incidentId = incidentId;
	}

	public java.sql.Date getDateOfOccurrence() {
		return dateOfOccurrence;
	}

	public void setDateOfOccurrence(java.sql.Date dateOfOccurrence) {
		this.dateOfOccurrence = dateOfOccurrence;
	}

	public java.sql.Date getDateOfAccounting() {
		return dateOfAccounting;
	}

	public void setDateOfAccounting(java.sql.Date dateOfAccounting) {
		this.dateOfAccounting = dateOfAccounting;
	}

	public java.sql.Date getDateOfDetection() {
		return dateOfDetection;
	}

	public void setDateOfDetection(java.sql.Date dateOfDetection) {
		this.dateOfDetection = dateOfDetection;
	}

	public java.sql.Date getEstimatedCompletionDate() {
		return estimatedCompletionDate;
	}

	public void setEstimatedCompletionDate(java.sql.Date estimatedCompletionDate) {
		this.estimatedCompletionDate = estimatedCompletionDate;
	}

	public String getBusinessLevel() {
		return businessLevel;
	}

	public void setBusinessLevel(String businessLevel) {
		this.businessLevel = businessLevel;
	}

	public String getInternalBusinessLine() {
		return internalBusinessLine;
	}

	public void setInternalBusinessLine(String internalBusinessLine) {
		this.internalBusinessLine = internalBusinessLine;
	}

	public String getEventLevel() {
		return eventLevel;
	}

	public void setEventLevel(String eventLevel) {
		this.eventLevel = eventLevel;
	}

	
	public BigDecimal getNetLossLcy() {
		return netLossLcy;
	}

	public void setNetLossLcy(BigDecimal netLossLcy) {
		this.netLossLcy = netLossLcy;
	}

	public String getInsuranceClaim() {
		return insuranceClaim;
	}

	public void setInsuranceClaim(String insuranceClaim) {
		this.insuranceClaim = insuranceClaim;
	}

	public BigDecimal getInsClaimAmt() {
		return insClaimAmt;
	}

	public void setInsClaimAmt(BigDecimal insClaimAmt) {
		this.insClaimAmt = insClaimAmt;
	}

	public BigDecimal getInsClaimRec() {
		return insClaimRec;
	}

	public void setInsClaimRec(BigDecimal insClaimRec) {
		this.insClaimRec = insClaimRec;
	}

	public BigDecimal getOtherRecoveries() {
		return otherRecoveries;
	}

	public void setOtherRecoveries(BigDecimal otherRecoveries) {
		this.otherRecoveries = otherRecoveries;
	}

	public BigDecimal getTotalRecoveries() {
		return totalRecoveries;
	}

	public void setTotalRecoveries(BigDecimal totalRecoveries) {
		this.totalRecoveries = totalRecoveries;
	}

	public String getCauseSummary() {
		return causeSummary;
	}

	public void setCauseSummary(String causeSummary) {
		this.causeSummary = causeSummary;
	}

	public String getActionPlanSummary() {
		return actionPlanSummary;
	}

	public void setActionPlanSummary(String actionPlanSummary) {
		this.actionPlanSummary = actionPlanSummary;
	}

	public java.sql.Date getDateLastModified() {
		return dateLastModified;
	}

	public void setDateLastModified(java.sql.Date dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

}