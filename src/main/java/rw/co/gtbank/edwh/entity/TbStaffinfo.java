package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@IdClass(TbStaffinfo.class)
public class TbStaffinfo implements Serializable {
	private String country;
	private String leBook;
	private int yearMonth;
	@Id
	private String staffId;
	private String staffName;
	private String visionOuc;
	private String departmentId;
	private String staffGender;
	private String nationality;
	private int idType;
	private String idNumber;
	private java.sql.Date dateOfBirth;
	private String roleCode;
	private String gradeCode;
	private int education;
	private String professionalCertificates;
	private String telephone;
	private String emailId;
	private java.sql.Date dateOfEmployment;
	private boolean staffStatus;
	private java.sql.Date dateOfExit;
	private String reasonForExit;
	private String bnrApprovalReqd;
	private java.sql.Date dateOfBnrApproval;
	private String previousEmployer;

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

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getVisionOuc() {
		return visionOuc;
	}

	public void setVisionOuc(String visionOuc) {
		this.visionOuc = visionOuc;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getStaffGender() {
		return staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public java.sql.Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getGradeCode() {
		return gradeCode;
	}

	public void setGradeCode(String gradeCode) {
		this.gradeCode = gradeCode;
	}

	public int getEducation() {
		return education;
	}

	public void setEducation(int education) {
		this.education = education;
	}

	public String getProfessionalCertificates() {
		return professionalCertificates;
	}

	public void setProfessionalCertificates(String professionalCertificates) {
		this.professionalCertificates = professionalCertificates;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public java.sql.Date getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(java.sql.Date dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

	public boolean isStaffStatus() {
		return staffStatus;
	}

	public void setStaffStatus(boolean staffStatus) {
		this.staffStatus = staffStatus;
	}

	public java.sql.Date getDateOfExit() {
		return dateOfExit;
	}

	public void setDateOfExit(java.sql.Date dateOfExit) {
		this.dateOfExit = dateOfExit;
	}

	public String getReasonForExit() {
		return reasonForExit;
	}

	public void setReasonForExit(String reasonForExit) {
		this.reasonForExit = reasonForExit;
	}

	public String getBnrApprovalReqd() {
		return bnrApprovalReqd;
	}

	public void setBnrApprovalReqd(String bnrApprovalReqd) {
		this.bnrApprovalReqd = bnrApprovalReqd;
	}

	public java.sql.Date getDateOfBnrApproval() {
		return dateOfBnrApproval;
	}

	public void setDateOfBnrApproval(java.sql.Date dateOfBnrApproval) {
		this.dateOfBnrApproval = dateOfBnrApproval;
	}

	public String getPreviousEmployer() {
		return previousEmployer;
	}

	public void setPreviousEmployer(String previousEmployer) {
		this.previousEmployer = previousEmployer;
	}

}
