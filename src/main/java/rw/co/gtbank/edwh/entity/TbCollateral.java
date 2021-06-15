package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbCollateral.class)
public class TbCollateral implements Serializable {
	private String country;
	private String leBook;
	@Id
	private String contractId;
	private String collateralId;
	private String customerId;
	private String collateralType;
	private String collateralOwnership;
	private int collateralAmountLcy;
	private java.sql.Date collateralLastValuationDate;
	private java.sql.Date collateralExpiryDate;
	private int collateralDiscountAmtLcy;
	private int collateralDiscountRate;
	private int collateralMarketValue;
	private String upiNumber;
	private String namePropertyValuer;
	private String regNumberValuer;
	private String rdbRegNumber;
	private int ltvRatio;
	private String insured;
	private java.sql.Date insuranceExpiryDate;
	private String gauranteeIssuer;
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

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getCollateralId() {
		return collateralId;
	}

	public void setCollateralId(String collateralId) {
		this.collateralId = collateralId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCollateralType() {
		return collateralType;
	}

	public void setCollateralType(String collateralType) {
		this.collateralType = collateralType;
	}

	public String getCollateralOwnership() {
		return collateralOwnership;
	}

	public void setCollateralOwnership(String collateralOwnership) {
		this.collateralOwnership = collateralOwnership;
	}

	public int getCollateralAmountLcy() {
		return collateralAmountLcy;
	}

	public void setCollateralAmountLcy(int collateralAmountLcy) {
		this.collateralAmountLcy = collateralAmountLcy;
	}

	public java.sql.Date getCollateralLastValuationDate() {
		return collateralLastValuationDate;
	}

	public void setCollateralLastValuationDate(java.sql.Date collateralLastValuationDate) {
		this.collateralLastValuationDate = collateralLastValuationDate;
	}

	public java.sql.Date getCollateralExpiryDate() {
		return collateralExpiryDate;
	}

	public void setCollateralExpiryDate(java.sql.Date collateralExpiryDate) {
		this.collateralExpiryDate = collateralExpiryDate;
	}

	public int getCollateralDiscountAmtLcy() {
		return collateralDiscountAmtLcy;
	}

	public void setCollateralDiscountAmtLcy(int collateralDiscountAmtLcy) {
		this.collateralDiscountAmtLcy = collateralDiscountAmtLcy;
	}

	public int getCollateralDiscountRate() {
		return collateralDiscountRate;
	}

	public void setCollateralDiscountRate(int collateralDiscountRate) {
		this.collateralDiscountRate = collateralDiscountRate;
	}

	public int getCollateralMarketValue() {
		return collateralMarketValue;
	}

	public void setCollateralMarketValue(int collateralMarketValue) {
		this.collateralMarketValue = collateralMarketValue;
	}

	public String getUpiNumber() {
		return upiNumber;
	}

	public void setUpiNumber(String upiNumber) {
		this.upiNumber = upiNumber;
	}

	public String getNamePropertyValuer() {
		return namePropertyValuer;
	}

	public void setNamePropertyValuer(String namePropertyValuer) {
		this.namePropertyValuer = namePropertyValuer;
	}

	public String getRegNumberValuer() {
		return regNumberValuer;
	}

	public void setRegNumberValuer(String regNumberValuer) {
		this.regNumberValuer = regNumberValuer;
	}

	public String getRdbRegNumber() {
		return rdbRegNumber;
	}

	public void setRdbRegNumber(String rdbRegNumber) {
		this.rdbRegNumber = rdbRegNumber;
	}

	public int getLtvRatio() {
		return ltvRatio;
	}

	public void setLtvRatio(int ltvRatio) {
		this.ltvRatio = ltvRatio;
	}

	public String getInsured() {
		return insured;
	}

	public void setInsured(String insured) {
		this.insured = insured;
	}

	public java.sql.Date getInsuranceExpiryDate() {
		return insuranceExpiryDate;
	}

	public void setInsuranceExpiryDate(java.sql.Date insuranceExpiryDate) {
		this.insuranceExpiryDate = insuranceExpiryDate;
	}

	public String getGauranteeIssuer() {
		return gauranteeIssuer;
	}

	public void setGauranteeIssuer(String gauranteeIssuer) {
		this.gauranteeIssuer = gauranteeIssuer;
	}

	public java.sql.Date getDateLastModified() {
		return dateLastModified;
	}

	public void setDateLastModified(java.sql.Date dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

}
