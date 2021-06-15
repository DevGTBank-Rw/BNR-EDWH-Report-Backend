package rw.co.gtbank.edwh.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.PrePersist;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@IdClass(TbCont.class)
public class TbCont implements Serializable {
	private String country;
	private String leBook;
	@Id
	private String contractId;
	private String customerId;
	private String visionOuc;
	private String visionSbu;
	private java.sql.Date startDate;
	private java.sql.Date maturityDate;
	private java.sql.Date settlementDate;
	private String dealType;
	private String dealSubType;
	private int interestRateMethod;
	private int interestRateDr;
	private int interestRateCr;
	private int aprRate;
	private int contractApplicationFee;
	private int contractAdministrativeFee;
	private int otherContractCharges;
	private int commissions;
	private String insuredFlag;
	private int contractInsuranceCharges;
	private Date insExpiryDate;
	private String currency;
	private String principalGl;
	private String interestGl;
	private int principalAmountFcy;
	private int principalAmountLcy;
	private int interestAmountFcy;
	private int interestAmountLcy;
	private String loanApplicationId;
	private boolean contractStatus;
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
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	public java.sql.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.sql.Date startDate) {
		this.startDate = startDate;
	}
	public java.sql.Date getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(java.sql.Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	public java.sql.Date getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(java.sql.Date settlementDate) {
		this.settlementDate = settlementDate;
	}
	public String getDealType() {
		return dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}
	public String getDealSubType() {
		return dealSubType;
	}
	public void setDealSubType(String dealSubType) {
		this.dealSubType = dealSubType;
	}
	public int getInterestRateMethod() {
		return interestRateMethod;
	}
	public void setInterestRateMethod(int interestRateMethod) {
		this.interestRateMethod = interestRateMethod;
	}
	public int getInterestRateDr() {
		return interestRateDr;
	}
	public void setInterestRateDr(int interestRateDr) {
		this.interestRateDr = interestRateDr;
	}
	public int getInterestRateCr() {
		return interestRateCr;
	}
	public void setInterestRateCr(int interestRateCr) {
		this.interestRateCr = interestRateCr;
	}
	public int getAprRate() {
		return aprRate;
	}
	public void setAprRate(int aprRate) {
		this.aprRate = aprRate;
	}
	public int getContractApplicationFee() {
		return contractApplicationFee;
	}
	public void setContractApplicationFee(int contractApplicationFee) {
		this.contractApplicationFee = contractApplicationFee;
	}
	public int getContractAdministrativeFee() {
		return contractAdministrativeFee;
	}
	public void setContractAdministrativeFee(int contractAdministrativeFee) {
		this.contractAdministrativeFee = contractAdministrativeFee;
	}
	public int getOtherContractCharges() {
		return otherContractCharges;
	}
	public void setOtherContractCharges(int otherContractCharges) {
		this.otherContractCharges = otherContractCharges;
	}
	public int getCommissions() {
		return commissions;
	}
	public void setCommissions(int commissions) {
		this.commissions = commissions;
	}
	public String getInsuredFlag() {
		return insuredFlag;
	}
	public void setInsuredFlag(String insuredFlag) {
		this.insuredFlag = insuredFlag;
	}
	public int getContractInsuranceCharges() {
		return contractInsuranceCharges;
	}
	public void setContractInsuranceCharges(int contractInsuranceCharges) {
		this.contractInsuranceCharges = contractInsuranceCharges;
	}
	public Date getInsExpiryDate() {
		return insExpiryDate;
	}
	public void setInsExpiryDate(Date insExpiryDate) {
		this.insExpiryDate = insExpiryDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPrincipalGl() {
		return principalGl;
	}
	public void setPrincipalGl(String principalGl) {
		this.principalGl = principalGl;
	}
	public String getInterestGl() {
		return interestGl;
	}
	public void setInterestGl(String interestGl) {
		this.interestGl = interestGl;
	}
	public int getPrincipalAmountFcy() {
		return principalAmountFcy;
	}
	public void setPrincipalAmountFcy(int principalAmountFcy) {
		this.principalAmountFcy = principalAmountFcy;
	}
	public int getPrincipalAmountLcy() {
		return principalAmountLcy;
	}
	public void setPrincipalAmountLcy(int principalAmountLcy) {
		this.principalAmountLcy = principalAmountLcy;
	}
	public int getInterestAmountFcy() {
		return interestAmountFcy;
	}
	public void setInterestAmountFcy(int interestAmountFcy) {
		this.interestAmountFcy = interestAmountFcy;
	}
	public int getInterestAmountLcy() {
		return interestAmountLcy;
	}
	public void setInterestAmountLcy(int interestAmountLcy) {
		this.interestAmountLcy = interestAmountLcy;
	}
	public String getLoanApplicationId() {
		return loanApplicationId;
	}
	public void setLoanApplicationId(String loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}
	public boolean isContractStatus() {
		return contractStatus;
	}
	public void setContractStatus(boolean contractStatus) {
		this.contractStatus = contractStatus;
	}
	public Date getDateLastModified() {
		return dateLastModified;
	}
	public void setDateLastModified(java.sql.Date dateLastModified) {
		this.dateLastModified = dateLastModified;
	}
	@Override
	public String toString() {
		return "TbCont [country=" + country + ", leBook=" + leBook + ", contractId=" + contractId + ", customerId="
				+ customerId + ", visionOuc=" + visionOuc + ", visionSbu=" + visionSbu + ", startDate=" + startDate
				+ ", maturityDate=" + maturityDate + ", settlementDate=" + settlementDate + ", dealType=" + dealType
				+ ", dealSubType=" + dealSubType + ", interestRateMethod=" + interestRateMethod + ", interestRateDr="
				+ interestRateDr + ", interestRateCr=" + interestRateCr + ", aprRate=" + aprRate
				+ ", contractApplicationFee=" + contractApplicationFee + ", contractAdministrativeFee="
				+ contractAdministrativeFee + ", otherContractCharges=" + otherContractCharges + ", commissions="
				+ commissions + ", insuredFlag=" + insuredFlag + ", contractInsuranceCharges="
				+ contractInsuranceCharges + ", insExpiryDate=" + insExpiryDate + ", currency=" + currency
				+ ", principalGl=" + principalGl + ", interestGl=" + interestGl + ", principalAmountFcy="
				+ principalAmountFcy + ", principalAmountLcy=" + principalAmountLcy + ", interestAmountFcy="
				+ interestAmountFcy + ", interestAmountLcy=" + interestAmountLcy + ", loanApplicationId="
				+ loanApplicationId + ", contractStatus=" + contractStatus + ", dateLastModified=" + dateLastModified
				+ "]";
	}


//	@PrePersist
//	public void beforeSave() {
//		
//		dateLastModified = new Date();
//	}



}
