package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbFxcaps.class)
public class TbFxcaps implements Serializable {
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	private int fxTransactionType;
	private String payslipNumber;
	@Id
	private String customerId;
	private String customerName;
	private String nationality;
	private String residence;
	private String fxCustomerType;
	private String countryOfOrigin;
	private String destinationCountry;
	private String phoneNumber;
	private int idType;
	private String idDetail;
	private String currency;
	private int exchangeRate;
	private BigDecimal amountFcy;
	private BigDecimal amountLcy;
	private String transactionPurpose;

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

	public java.sql.Date getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(java.sql.Date businessDate) {
		this.businessDate = businessDate;
	}

	public int getFxTransactionType() {
		return fxTransactionType;
	}

	public void setFxTransactionType(int fxTransactionType) {
		this.fxTransactionType = fxTransactionType;
	}

	public String getPayslipNumber() {
		return payslipNumber;
	}

	public void setPayslipNumber(String payslipNumber) {
		this.payslipNumber = payslipNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public String getFxCustomerType() {
		return fxCustomerType;
	}

	public void setFxCustomerType(String fxCustomerType) {
		this.fxCustomerType = fxCustomerType;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getDestinationCountry() {
		return destinationCountry;
	}

	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getIdDetail() {
		return idDetail;
	}

	public void setIdDetail(String idDetail) {
		this.idDetail = idDetail;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(int exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public BigDecimal getAmountFcy() {
		return amountFcy;
	}

	public void setAmountFcy(BigDecimal amountFcy) {
		this.amountFcy = amountFcy;
	}

	public BigDecimal getAmountLcy() {
		return amountLcy;
	}

	public void setAmountLcy(BigDecimal amountLcy) {
		this.amountLcy = amountLcy;
	}

	public String getTransactionPurpose() {
		return transactionPurpose;
	}

	public void setTransactionPurpose(String transactionPurpose) {
		this.transactionPurpose = transactionPurpose;
	}

}