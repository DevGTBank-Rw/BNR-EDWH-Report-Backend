package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@IdClass(TbStakehold.class)
public class TbStakehold implements Serializable {
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

  public String getStakeholderCategory() {
    return stakeholderCategory;
  }

  public void setStakeholderCategory(String stakeholderCategory) {
    this.stakeholderCategory = stakeholderCategory;
  }

  public String getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(String postalAddress) {
    this.postalAddress = postalAddress;
  }

  public String getPhysicalAddress() {
    return physicalAddress;
  }

  public void setPhysicalAddress(String physicalAddress) {
    this.physicalAddress = physicalAddress;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public int getTelephone() {
    return telephone;
  }

  public void setTelephone(int telephone) {
    this.telephone = telephone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getStakeholderName() {
    return stakeholderName;
  }

  public void setStakeholderName(String stakeholderName) {
    this.stakeholderName = stakeholderName;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public Date getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(Date registrationDate) {
    this.registrationDate = registrationDate;
  }

  public Date getCommencementDate() {
    return commencementDate;
  }

  public void setCommencementDate(Date commencementDate) {
    this.commencementDate = commencementDate;
  }

  public Date getDateOf1stLicense() {
    return dateOf1stLicense;
  }

  public void setDateOf1stLicense(Date dateOf1stLicense) {
    this.dateOf1stLicense = dateOf1stLicense;
  }

  public Date getLastLicenseRenewal() {
    return lastLicenseRenewal;
  }

  public void setLastLicenseRenewal(Date lastLicenseRenewal) {
    this.lastLicenseRenewal = lastLicenseRenewal;
  }

  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public String getIncorporationType() {
    return incorporationType;
  }

  public void setIncorporationType(String incorporationType) {
    this.incorporationType = incorporationType;
  }

  public String getExternalLawyers_01() {
    return externalLawyers_01;
  }

  public void setExternalLawyers_01(String externalLawyers_01) {
    this.externalLawyers_01 = externalLawyers_01;
  }

  public String getExternalLawyers_02() {
    return externalLawyers_02;
  }

  public void setExternalLawyers_02(String externalLawyers_02) {
    this.externalLawyers_02 = externalLawyers_02;
  }

  public String getExternalLawyers_03() {
    return externalLawyers_03;
  }

  public void setExternalLawyers_03(String externalLawyers_03) {
    this.externalLawyers_03 = externalLawyers_03;
  }

  public String getExternalLawyers_04() {
    return externalLawyers_04;
  }

  public void setExternalLawyers_04(String externalLawyers_04) {
    this.externalLawyers_04 = externalLawyers_04;
  }
}
