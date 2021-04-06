package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbCustomers {

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

}
