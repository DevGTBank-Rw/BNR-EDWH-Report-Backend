package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@IdClass(TbShmembers.class)
public class TbShmembers implements Serializable {
	private String country;
	private String leBook;
	private int yearMonth;
	private int shareholderSequence;
	private String shareholderName;
	private String shareholderGender;
	private java.sql.Date dateOfBirth;
	private String placeOfBirth;
	private String nationality;
	private String residence;
	private int idType;
	@Id
	private String idNumber;
	private String phoneNumber;
	private java.sql.Date vettingDate;
	private boolean legalStatus;
	private String majorPromoters_1;
	private String majorPromoters_2;
	private int subscribedShares;
	private int shareValue;
	private int totalShareholdingLcy;
	private int paidUpShares;
	private int percentageOfShare;

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

	public int getShareholderSequence() {
		return shareholderSequence;
	}

	public void setShareholderSequence(int shareholderSequence) {
		this.shareholderSequence = shareholderSequence;
	}

	public String getShareholderName() {
		return shareholderName;
	}

	public void setShareholderName(String shareholderName) {
		this.shareholderName = shareholderName;
	}

	public String getShareholderGender() {
		return shareholderGender;
	}

	public void setShareholderGender(String shareholderGender) {
		this.shareholderGender = shareholderGender;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public java.sql.Date getVettingDate() {
		return vettingDate;
	}

	public void setVettingDate(java.sql.Date vettingDate) {
		this.vettingDate = vettingDate;
	}

	public boolean isLegalStatus() {
		return legalStatus;
	}

	public void setLegalStatus(boolean legalStatus) {
		this.legalStatus = legalStatus;
	}

	public String getMajorPromoters_1() {
		return majorPromoters_1;
	}

	public void setMajorPromoters_1(String majorPromoters_1) {
		this.majorPromoters_1 = majorPromoters_1;
	}

	public String getMajorPromoters_2() {
		return majorPromoters_2;
	}

	public void setMajorPromoters_2(String majorPromoters_2) {
		this.majorPromoters_2 = majorPromoters_2;
	}

	public int getSubscribedShares() {
		return subscribedShares;
	}

	public void setSubscribedShares(int subscribedShares) {
		this.subscribedShares = subscribedShares;
	}

	public int getShareValue() {
		return shareValue;
	}

	public void setShareValue(int shareValue) {
		this.shareValue = shareValue;
	}

	public int getTotalShareholdingLcy() {
		return totalShareholdingLcy;
	}

	public void setTotalShareholdingLcy(int totalShareholdingLcy) {
		this.totalShareholdingLcy = totalShareholdingLcy;
	}

	public int getPaidUpShares() {
		return paidUpShares;
	}

	public void setPaidUpShares(int paidUpShares) {
		this.paidUpShares = paidUpShares;
	}

	public int getPercentageOfShare() {
		return percentageOfShare;
	}

	public void setPercentageOfShare(int percentageOfShare) {
		this.percentageOfShare = percentageOfShare;
	}

}
