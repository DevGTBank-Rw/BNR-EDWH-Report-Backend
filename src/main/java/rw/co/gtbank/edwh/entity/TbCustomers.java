package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbCustomers.class)
public class TbCustomers implements Serializable {
	private String country;
	private String leBook;
	@Id
	private String customerId;
	private String salutation;
	private String customerName;
	private String surname;
	private String forename_1;
	private String forename_2;
	private String customerAcronym;
	private String visionOuc;
	private String visionSbu;
	private String accountOfficer;
	private java.sql.Date customerOpenDate;
	private String customerGender;
	private java.sql.Date dateOfBirth;
	private String placeOfBirth;
	private String maritalStatus;
	private String spouseName;
	private int socialEconomicClass;
	private String nextOfKinName;
	private int nextOfKinIdType;
	private String nextOfKinIdNumber;
	private String nextOfKinTelephone;
	private String nextOfKinEmailId;
	private String numberOfDependants;
	private String accountMandateName;
	private int accountMandateIdType;
	private String accountMandateIdNumber;
	private String nationality;
	private String residence;
	@Column(name = "comm_address_1")
	private String commAddress1;
	@Column(name = "comm_address_2")
	private String commAddress2;
	private String commVillage;
	private String commCountry;
	private String commResidenceType;
	private String permAddress_1;
	private String permAddress_2;
	private String permVillage;
	private String permCountry;
	private String emailId;
	private String workTelephone;
	private String homeTelephone;
	@Column(name = "fax_number_1")
	private String faxNumber1;
	@Column(name = "fax_number_2")
	private String faxNumber2;
	private int education;
	private String customerTin;
	private int naicsCode;
	private String economicSubSectorCodeIsic;
	private String relatedParty;
	private int relationshipType;
	private String relatedPartyName;
	private String localGovtMember;
	private String internetBankingSubscription;
	private String mobileBankingSubscription;
	private String ssnNumber;
	private int nationalIdType;
	private String nationalIdNumber;
	private String healthInsuranceNumber;
	private int occupation;
	private String employerName;
	private String employeeId;
	private String empAddress_1;
	private String empAddress_2;
	private String empVillage;
	private String empCountry;
	private int income;
	private String incomeFrequency;
	private String groupName;
	private String groupNumber;
	private int legalStatus;
	private boolean customerStatus;
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

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getForename_1() {
		return forename_1;
	}

	public void setForename_1(String forename_1) {
		this.forename_1 = forename_1;
	}

	public String getForename_2() {
		return forename_2;
	}

	public void setForename_2(String forename_2) {
		this.forename_2 = forename_2;
	}

	public String getCustomerAcronym() {
		return customerAcronym;
	}

	public void setCustomerAcronym(String customerAcronym) {
		this.customerAcronym = customerAcronym;
	}

	public String getVisionOuc() {
		return visionOuc;
	}

	public void setVisionOuc(String visionOuc) {
		this.visionOuc = visionOuc;
	}

	public String getVisionSbu() {
		return visionSbu;
	}

	public void setVisionSbu(String visionSbu) {
		this.visionSbu = visionSbu;
	}

	public String getAccountOfficer() {
		return accountOfficer;
	}

	public void setAccountOfficer(String accountOfficer) {
		this.accountOfficer = accountOfficer;
	}

	public java.sql.Date getCustomerOpenDate() {
		return customerOpenDate;
	}

	public void setCustomerOpenDate(java.sql.Date customerOpenDate) {
		this.customerOpenDate = customerOpenDate;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public java.sql.Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public int getSocialEconomicClass() {
		return socialEconomicClass;
	}

	public void setSocialEconomicClass(int socialEconomicClass) {
		this.socialEconomicClass = socialEconomicClass;
	}

	public String getNextOfKinName() {
		return nextOfKinName;
	}

	public void setNextOfKinName(String nextOfKinName) {
		this.nextOfKinName = nextOfKinName;
	}

	public int getNextOfKinIdType() {
		return nextOfKinIdType;
	}

	public void setNextOfKinIdType(int nextOfKinIdType) {
		this.nextOfKinIdType = nextOfKinIdType;
	}

	public String getNextOfKinIdNumber() {
		return nextOfKinIdNumber;
	}

	public void setNextOfKinIdNumber(String nextOfKinIdNumber) {
		this.nextOfKinIdNumber = nextOfKinIdNumber;
	}

	public String getNextOfKinTelephone() {
		return nextOfKinTelephone;
	}

	public void setNextOfKinTelephone(String nextOfKinTelephone) {
		this.nextOfKinTelephone = nextOfKinTelephone;
	}

	public String getNextOfKinEmailId() {
		return nextOfKinEmailId;
	}

	public void setNextOfKinEmailId(String nextOfKinEmailId) {
		this.nextOfKinEmailId = nextOfKinEmailId;
	}

	public String getNumberOfDependants() {
		return numberOfDependants;
	}

	public void setNumberOfDependants(String numberOfDependants) {
		this.numberOfDependants = numberOfDependants;
	}

	public String getAccountMandateName() {
		return accountMandateName;
	}

	public void setAccountMandateName(String accountMandateName) {
		this.accountMandateName = accountMandateName;
	}

	public int getAccountMandateIdType() {
		return accountMandateIdType;
	}

	public void setAccountMandateIdType(int accountMandateIdType) {
		this.accountMandateIdType = accountMandateIdType;
	}

	public String getAccountMandateIdNumber() {
		return accountMandateIdNumber;
	}

	public void setAccountMandateIdNumber(String accountMandateIdNumber) {
		this.accountMandateIdNumber = accountMandateIdNumber;
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

	public String getCommAddress1() {
		return commAddress1;
	}

	public void setCommAddress1(String commAddress1) {
		this.commAddress1 = commAddress1;
	}

	public String getCommAddress2() {
		return commAddress2;
	}

	public void setCommAddress2(String commAddress2) {
		this.commAddress2 = commAddress2;
	}

	public String getCommVillage() {
		return commVillage;
	}

	public void setCommVillage(String commVillage) {
		this.commVillage = commVillage;
	}

	public String getCommCountry() {
		return commCountry;
	}

	public void setCommCountry(String commCountry) {
		this.commCountry = commCountry;
	}

	public String getCommResidenceType() {
		return commResidenceType;
	}

	public void setCommResidenceType(String commResidenceType) {
		this.commResidenceType = commResidenceType;
	}

	public String getPermAddress_1() {
		return permAddress_1;
	}

	public void setPermAddress_1(String permAddress_1) {
		this.permAddress_1 = permAddress_1;
	}

	public String getPermAddress_2() {
		return permAddress_2;
	}

	public void setPermAddress_2(String permAddress_2) {
		this.permAddress_2 = permAddress_2;
	}

	public String getPermVillage() {
		return permVillage;
	}

	public void setPermVillage(String permVillage) {
		this.permVillage = permVillage;
	}

	public String getPermCountry() {
		return permCountry;
	}

	public void setPermCountry(String permCountry) {
		this.permCountry = permCountry;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getWorkTelephone() {
		return workTelephone;
	}

	public void setWorkTelephone(String workTelephone) {
		this.workTelephone = workTelephone;
	}

	public String getHomeTelephone() {
		return homeTelephone;
	}

	public void setHomeTelephone(String homeTelephone) {
		this.homeTelephone = homeTelephone;
	}

	public String getFaxNumber1() {
		return faxNumber1;
	}

	public void setFaxNumber1(String faxNumber1) {
		this.faxNumber1 = faxNumber1;
	}

	public String getFaxNumber2() {
		return faxNumber2;
	}

	public void setFaxNumber2(String faxNumber2) {
		this.faxNumber2 = faxNumber2;
	}

	public int getEducation() {
		return education;
	}

	public void setEducation(int education) {
		this.education = education;
	}

	public String getCustomerTin() {
		return customerTin;
	}

	public void setCustomerTin(String customerTin) {
		this.customerTin = customerTin;
	}

	public int getNaicsCode() {
		return naicsCode;
	}

	public void setNaicsCode(int naicsCode) {
		this.naicsCode = naicsCode;
	}

	public String getEconomicSubSectorCodeIsic() {
		return economicSubSectorCodeIsic;
	}

	public void setEconomicSubSectorCodeIsic(String economicSubSectorCodeIsic) {
		this.economicSubSectorCodeIsic = economicSubSectorCodeIsic;
	}

	public String getRelatedParty() {
		return relatedParty;
	}

	public void setRelatedParty(String relatedParty) {
		this.relatedParty = relatedParty;
	}

	public int getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(int relationshipType) {
		this.relationshipType = relationshipType;
	}

	public String getRelatedPartyName() {
		return relatedPartyName;
	}

	public void setRelatedPartyName(String relatedPartyName) {
		this.relatedPartyName = relatedPartyName;
	}

	public String getLocalGovtMember() {
		return localGovtMember;
	}

	public void setLocalGovtMember(String localGovtMember) {
		this.localGovtMember = localGovtMember;
	}

	public String getInternetBankingSubscription() {
		return internetBankingSubscription;
	}

	public void setInternetBankingSubscription(String internetBankingSubscription) {
		this.internetBankingSubscription = internetBankingSubscription;
	}

	public String getMobileBankingSubscription() {
		return mobileBankingSubscription;
	}

	public void setMobileBankingSubscription(String mobileBankingSubscription) {
		this.mobileBankingSubscription = mobileBankingSubscription;
	}

	public String getSsnNumber() {
		return ssnNumber;
	}

	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	public int getNationalIdType() {
		return nationalIdType;
	}

	public void setNationalIdType(int nationalIdType) {
		this.nationalIdType = nationalIdType;
	}

	public String getNationalIdNumber() {
		return nationalIdNumber;
	}

	public void setNationalIdNumber(String nationalIdNumber) {
		this.nationalIdNumber = nationalIdNumber;
	}

	public String getHealthInsuranceNumber() {
		return healthInsuranceNumber;
	}

	public void setHealthInsuranceNumber(String healthInsuranceNumber) {
		this.healthInsuranceNumber = healthInsuranceNumber;
	}

	public int getOccupation() {
		return occupation;
	}

	public void setOccupation(int occupation) {
		this.occupation = occupation;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpAddress_1() {
		return empAddress_1;
	}

	public void setEmpAddress_1(String empAddress_1) {
		this.empAddress_1 = empAddress_1;
	}

	public String getEmpAddress_2() {
		return empAddress_2;
	}

	public void setEmpAddress_2(String empAddress_2) {
		this.empAddress_2 = empAddress_2;
	}

	public String getEmpVillage() {
		return empVillage;
	}

	public void setEmpVillage(String empVillage) {
		this.empVillage = empVillage;
	}

	public String getEmpCountry() {
		return empCountry;
	}

	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getIncomeFrequency() {
		return incomeFrequency;
	}

	public void setIncomeFrequency(String incomeFrequency) {
		this.incomeFrequency = incomeFrequency;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int getLegalStatus() {
		return legalStatus;
	}

	public void setLegalStatus(int legalStatus) {
		this.legalStatus = legalStatus;
	}

	public boolean isCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(boolean customerStatus) {
		this.customerStatus = customerStatus;
	}

	public java.sql.Date getDateLastModified() {
		return dateLastModified;
	}

	public void setDateLastModified(java.sql.Date dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

}
