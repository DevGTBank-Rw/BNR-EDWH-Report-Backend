package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TbStakehold {
  private String country;
  private String leBook;
  private int yearMonth;
  private String stakeholderCategory;
  private String postalAddress;
  private String physicalAddress;
  private String website;
  @Id
  private int telephone;
  private String email;
  private String fax;
  private String stakeholderName;
  private String registrationNumber;
  private java.sql.Date registrationDate;
  private java.sql.Date commencementDate;
  @Column(name = "DATE_OF_1ST_LICENSE")
  private java.sql.Date dateOf1stLicense;
  private java.sql.Date lastLicenseRenewal;
  private String licenseNumber;
  private String incorporationType;
  private String externalLawyers_01;
  private String externalLawyers_02;
  private String externalLawyers_03;
  private String externalLawyers_04;

}
