package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@IdClass(TbMgtinfo2.class)
public class TbMgtinfo2 implements Serializable {
	private String country;
	private String leBook;
	private int yearMonth;
	private int sequenceId;
	private String name;
	@Id
	private String staffId;
	private int mgtMemberType;
	private String executiveFlag;
	private String gender;
	private String nationality;
	private String residence;
	private int idType;
	private String idNumber;
	private java.sql.Date dateOfBirth;
	private int education;
	private String professionalCertificates;
	private String telephone;
	private String emailId;
	private java.sql.Date dateOfAppointment;
	private java.sql.Date dateOfBnrApproval;
	private String boardChairCommittee_01;
	private String boardChairCommittee_02;
	private String boardChairCommittee_03;
	private String boardChairCommittee_04;
	private String board_Committee_01;
	private String board_Committee_02;
	private String board_Committee_03;
	private String board_Committee_04;
	private String board_Committee_05;
	private String board_Committee_06;
	private String board_Committee_07;
	private String board_Committee_08;
	private String managementCommittee_01;
	private String managementCommittee_02;
	private String managementCommittee_03;
	private String managementCommittee_04;
	private String managementCommittee_05;
	private String managementCommittee_06;
	private String managementCommittee_07;
	private String managementCommittee_08;
	private String companyName_01;
	private String companyName_02;
	private String companyName_03;
	private String roleCompany_01;
	private String roleCompany_02;
	private String roleCompany_03;
	private String empLocation_01;
	private String empLocation_02;
	private String empLocation_03;
	private String shareholdingFlag;
	private String shareholdingInfo;

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

	public int getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public int getMgtMemberType() {
		return mgtMemberType;
	}

	public void setMgtMemberType(int mgtMemberType) {
		this.mgtMemberType = mgtMemberType;
	}

	public String getExecutiveFlag() {
		return executiveFlag;
	}

	public void setExecutiveFlag(String executiveFlag) {
		this.executiveFlag = executiveFlag;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
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

	public java.sql.Date getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(java.sql.Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public java.sql.Date getDateOfBnrApproval() {
		return dateOfBnrApproval;
	}

	public void setDateOfBnrApproval(java.sql.Date dateOfBnrApproval) {
		this.dateOfBnrApproval = dateOfBnrApproval;
	}

	public String getBoardChairCommittee_01() {
		return boardChairCommittee_01;
	}

	public void setBoardChairCommittee_01(String boardChairCommittee_01) {
		this.boardChairCommittee_01 = boardChairCommittee_01;
	}

	public String getBoardChairCommittee_02() {
		return boardChairCommittee_02;
	}

	public void setBoardChairCommittee_02(String boardChairCommittee_02) {
		this.boardChairCommittee_02 = boardChairCommittee_02;
	}

	public String getBoardChairCommittee_03() {
		return boardChairCommittee_03;
	}

	public void setBoardChairCommittee_03(String boardChairCommittee_03) {
		this.boardChairCommittee_03 = boardChairCommittee_03;
	}

	public String getBoardChairCommittee_04() {
		return boardChairCommittee_04;
	}

	public void setBoardChairCommittee_04(String boardChairCommittee_04) {
		this.boardChairCommittee_04 = boardChairCommittee_04;
	}

	public String getBoard_Committee_01() {
		return board_Committee_01;
	}

	public void setBoard_Committee_01(String board_Committee_01) {
		this.board_Committee_01 = board_Committee_01;
	}

	public String getBoard_Committee_02() {
		return board_Committee_02;
	}

	public void setBoard_Committee_02(String board_Committee_02) {
		this.board_Committee_02 = board_Committee_02;
	}

	public String getBoard_Committee_03() {
		return board_Committee_03;
	}

	public void setBoard_Committee_03(String board_Committee_03) {
		this.board_Committee_03 = board_Committee_03;
	}

	public String getBoard_Committee_04() {
		return board_Committee_04;
	}

	public void setBoard_Committee_04(String board_Committee_04) {
		this.board_Committee_04 = board_Committee_04;
	}

	public String getBoard_Committee_05() {
		return board_Committee_05;
	}

	public void setBoard_Committee_05(String board_Committee_05) {
		this.board_Committee_05 = board_Committee_05;
	}

	public String getBoard_Committee_06() {
		return board_Committee_06;
	}

	public void setBoard_Committee_06(String board_Committee_06) {
		this.board_Committee_06 = board_Committee_06;
	}

	public String getBoard_Committee_07() {
		return board_Committee_07;
	}

	public void setBoard_Committee_07(String board_Committee_07) {
		this.board_Committee_07 = board_Committee_07;
	}

	public String getBoard_Committee_08() {
		return board_Committee_08;
	}

	public void setBoard_Committee_08(String board_Committee_08) {
		this.board_Committee_08 = board_Committee_08;
	}

	public String getManagementCommittee_01() {
		return managementCommittee_01;
	}

	public void setManagementCommittee_01(String managementCommittee_01) {
		this.managementCommittee_01 = managementCommittee_01;
	}

	public String getManagementCommittee_02() {
		return managementCommittee_02;
	}

	public void setManagementCommittee_02(String managementCommittee_02) {
		this.managementCommittee_02 = managementCommittee_02;
	}

	public String getManagementCommittee_03() {
		return managementCommittee_03;
	}

	public void setManagementCommittee_03(String managementCommittee_03) {
		this.managementCommittee_03 = managementCommittee_03;
	}

	public String getManagementCommittee_04() {
		return managementCommittee_04;
	}

	public void setManagementCommittee_04(String managementCommittee_04) {
		this.managementCommittee_04 = managementCommittee_04;
	}

	public String getManagementCommittee_05() {
		return managementCommittee_05;
	}

	public void setManagementCommittee_05(String managementCommittee_05) {
		this.managementCommittee_05 = managementCommittee_05;
	}

	public String getManagementCommittee_06() {
		return managementCommittee_06;
	}

	public void setManagementCommittee_06(String managementCommittee_06) {
		this.managementCommittee_06 = managementCommittee_06;
	}

	public String getManagementCommittee_07() {
		return managementCommittee_07;
	}

	public void setManagementCommittee_07(String managementCommittee_07) {
		this.managementCommittee_07 = managementCommittee_07;
	}

	public String getManagementCommittee_08() {
		return managementCommittee_08;
	}

	public void setManagementCommittee_08(String managementCommittee_08) {
		this.managementCommittee_08 = managementCommittee_08;
	}

	public String getCompanyName_01() {
		return companyName_01;
	}

	public void setCompanyName_01(String companyName_01) {
		this.companyName_01 = companyName_01;
	}

	public String getCompanyName_02() {
		return companyName_02;
	}

	public void setCompanyName_02(String companyName_02) {
		this.companyName_02 = companyName_02;
	}

	public String getCompanyName_03() {
		return companyName_03;
	}

	public void setCompanyName_03(String companyName_03) {
		this.companyName_03 = companyName_03;
	}

	public String getRoleCompany_01() {
		return roleCompany_01;
	}

	public void setRoleCompany_01(String roleCompany_01) {
		this.roleCompany_01 = roleCompany_01;
	}

	public String getRoleCompany_02() {
		return roleCompany_02;
	}

	public void setRoleCompany_02(String roleCompany_02) {
		this.roleCompany_02 = roleCompany_02;
	}

	public String getRoleCompany_03() {
		return roleCompany_03;
	}

	public void setRoleCompany_03(String roleCompany_03) {
		this.roleCompany_03 = roleCompany_03;
	}

	public String getEmpLocation_01() {
		return empLocation_01;
	}

	public void setEmpLocation_01(String empLocation_01) {
		this.empLocation_01 = empLocation_01;
	}

	public String getEmpLocation_02() {
		return empLocation_02;
	}

	public void setEmpLocation_02(String empLocation_02) {
		this.empLocation_02 = empLocation_02;
	}

	public String getEmpLocation_03() {
		return empLocation_03;
	}

	public void setEmpLocation_03(String empLocation_03) {
		this.empLocation_03 = empLocation_03;
	}

	public String getShareholdingFlag() {
		return shareholdingFlag;
	}

	public void setShareholdingFlag(String shareholdingFlag) {
		this.shareholdingFlag = shareholdingFlag;
	}

	public String getShareholdingInfo() {
		return shareholdingInfo;
	}

	public void setShareholdingInfo(String shareholdingInfo) {
		this.shareholdingInfo = shareholdingInfo;
	}

}
