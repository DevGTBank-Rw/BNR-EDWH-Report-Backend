package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbExauditors.class)
public class TbExauditors implements Serializable {
	private String country;
	private String leBook;
	private int yearMonth;
	private int externalAuditSequence;
	private String externalAuditName;
	private String externalAuditorType;
	private String managingPartner;
	private String address;
	@Id
	private String emailAddress;
	private String phoneNumber;
	private java.sql.Date appointmentDate;
	private java.sql.Date accreditationDate;
	private java.sql.Date termStartDate;
	private java.sql.Date termEndDate;
	private java.sql.Date icparCertiIssueDate;
	private String icparRegNumber;
	private String otherAssignment;
	private java.sql.Date otherAssignStartDate;
	private java.sql.Date otherAssignEndDate;

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

	public int getExternalAuditSequence() {
		return externalAuditSequence;
	}

	public void setExternalAuditSequence(int externalAuditSequence) {
		this.externalAuditSequence = externalAuditSequence;
	}

	public String getExternalAuditName() {
		return externalAuditName;
	}

	public void setExternalAuditName(String externalAuditName) {
		this.externalAuditName = externalAuditName;
	}

	public String getExternalAuditorType() {
		return externalAuditorType;
	}

	public void setExternalAuditorType(String externalAuditorType) {
		this.externalAuditorType = externalAuditorType;
	}

	public String getManagingPartner() {
		return managingPartner;
	}

	public void setManagingPartner(String managingPartner) {
		this.managingPartner = managingPartner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public java.sql.Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(java.sql.Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public java.sql.Date getAccreditationDate() {
		return accreditationDate;
	}

	public void setAccreditationDate(java.sql.Date accreditationDate) {
		this.accreditationDate = accreditationDate;
	}

	public java.sql.Date getTermStartDate() {
		return termStartDate;
	}

	public void setTermStartDate(java.sql.Date termStartDate) {
		this.termStartDate = termStartDate;
	}

	public java.sql.Date getTermEndDate() {
		return termEndDate;
	}

	public void setTermEndDate(java.sql.Date termEndDate) {
		this.termEndDate = termEndDate;
	}

	public java.sql.Date getIcparCertiIssueDate() {
		return icparCertiIssueDate;
	}

	public void setIcparCertiIssueDate(java.sql.Date icparCertiIssueDate) {
		this.icparCertiIssueDate = icparCertiIssueDate;
	}

	public String getIcparRegNumber() {
		return icparRegNumber;
	}

	public void setIcparRegNumber(String icparRegNumber) {
		this.icparRegNumber = icparRegNumber;
	}

	public String getOtherAssignment() {
		return otherAssignment;
	}

	public void setOtherAssignment(String otherAssignment) {
		this.otherAssignment = otherAssignment;
	}

	public java.sql.Date getOtherAssignStartDate() {
		return otherAssignStartDate;
	}

	public void setOtherAssignStartDate(java.sql.Date otherAssignStartDate) {
		this.otherAssignStartDate = otherAssignStartDate;
	}

	public java.sql.Date getOtherAssignEndDate() {
		return otherAssignEndDate;
	}

	public void setOtherAssignEndDate(java.sql.Date otherAssignEndDate) {
		this.otherAssignEndDate = otherAssignEndDate;
	}

}