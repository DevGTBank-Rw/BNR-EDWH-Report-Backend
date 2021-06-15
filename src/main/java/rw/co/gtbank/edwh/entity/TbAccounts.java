package rw.co.gtbank.edwh.entity;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@Entity
public class TbAccounts {
	@NotNull(message = "country must no be null")
	@Size(max = 2, min = 2, message = "country must have 2 characters")
	private String country;
	@NotNull(message = "leBook must no be null")
	@Size(max = 2, message = "leBook must be less or equal to 2 characters")
	private String leBook;
	@Id
	@NotBlank(message = "accountNo must no be null")
//	@Size(max = 20, message = "accountNo must be less or equal to 20 characters")
	private String accountNo;
	@NotBlank(message = "accountName must no be null")
//	@Size(max = 80, message = "accountName must be less or equal to 80 characters")
	private String accountName;
	@NotBlank(message = "visionOuc must no be null")
	@Size(max = 10, message = "visionOuc must be less or equal to 10 characters")
	private String visionOuc;
	@NotBlank(message = "visionOuc must no be null")
	@Size(max = 10, message = "visionOuc must be less or equal to 10 characters")
	private String visionSbu;
	@NotBlank(message = "accountStatus must no be null")
//	@Size(max = 4, message = "accountStatus must be less or equal to 4 characters")
	private int accountStatus;
	@NotBlank(message = "accountStatusDate must no be null")
	private java.sql.Date accountStatusDate;
	@Size(max = 14, message = "customerId must be less or equal to 14 characters")
	private String customerId;
	@Size(max = 14, message = "accountOfficer must be less or equal to 14 characters")
	private String accountOfficer;
	@NotBlank(message = "currency must no be null")
	@Size(max = 3, message = "currency must be less or equal to 3 characters")
	private String currency;
	@NotBlank(message = "currency must no be blank")
	@Size(max = 12, message = "currency must be less or equal to 12 characters")
	private String visionGl;
	@NotBlank(message = "accountType must no be blank")
	@Size(max = 10, message = "accountType must be less or equal to 10 characters")
	private String accountType;
	@NotBlank(message = "accountOpenDate must no be blank")
	private java.sql.Date accountOpenDate;
	private java.sql.Date accountClosingDate;
	@NotBlank(message = "freezeStatus must no be blank")
	@Size(max = 10, message = "freezeStatus must be less or equal to 10 characters")
	private String freezeStatus;
	@NotBlank(message = "intRateDr must no be blank")
//	@Size(max = 10, message = "intRateDr must be less or equal to 10 characters")
	private BigDecimal intRateDr;
	@NotBlank(message = "intRateCr must no be blank")
//	@Size(max = 10, message = "intRateCr must be less or equal to 10 characters")
	private BigDecimal intRateCr;
	@NotBlank(message = "economicSubSectorCode must no be blank")
	@Size(max = 10, message = "economicSubSectorCode must be less or equal to 10 characters")
	private String economicSubSectorCode;
	@NotBlank(message = "economicSubSectorCodeIsic must no be blank")
	@Size(max = 10, message = "economicSubSectorCodeIsic must be less or equal to 10 characters")
	private String economicSubSectorCodeIsic;
	@NotBlank(message = "publicSectorCode must no be blank")
	@Size(max = 10, message = "publicSectorCode must be less or equal to 10 characters")
	private String publicSectorCode;
	@NotBlank(message = "institutionalSectorCode must no be blank")
	@Size(max = 10, message = "institutionalSectorCode must be less or equal to 10 characters")
	private String institutionalSectorCode;
	private java.sql.Date lastTransactionDate;
	@NotBlank(message = "economicSubSectorCode must no be blank")
	@Size(max = 10, message = "economicSubSectorCode must be less or equal to 10 characters")
	private String accountOwnership;
	@NotBlank(message = "jointParticipantCount must no be blank")
	@Size(max = 2, message = "jointParticipantCount must be less or equal to 2 characters")
	private int jointParticipantCount;
	@NotBlank(message = "cardSubscription must no be blank")
	@Size(max = 1, message = "cardSubscription must be equal to 1 characters")
	private String cardSubscription;
	@NotBlank(message = "performanceClass must no be blank")
	@Size(max = 10, message = "performanceClass must be less or equal to 10 characters")
	private String performanceClass;
	@NotBlank(message = "creditCategory must no be blank")
//	@Size(max = 4, message = "creditCategory must be less or equal to 4 characters")
	private int creditCategory;
//	@Size(max = 20, message = "merchantId must be less or equal to 20 characters")
	private String merchantId;
	@NotBlank(message = "dateLastModified must no be blank")
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
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
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
	public int getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}
	public java.sql.Date getAccountStatusDate() {
		return accountStatusDate;
	}
	public void setAccountStatusDate(java.sql.Date accountStatusDate) {
		this.accountStatusDate = accountStatusDate;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountOfficer() {
		return accountOfficer;
	}
	public void setAccountOfficer(String accountOfficer) {
		this.accountOfficer = accountOfficer;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getVisionGl() {
		return visionGl;
	}
	public void setVisionGl(String visionGl) {
		this.visionGl = visionGl;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public java.sql.Date getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(java.sql.Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public java.sql.Date getAccountClosingDate() {
		return accountClosingDate;
	}
	public void setAccountClosingDate(java.sql.Date accountClosingDate) {
		this.accountClosingDate = accountClosingDate;
	}
	public String getFreezeStatus() {
		return freezeStatus;
	}
	public void setFreezeStatus(String freezeStatus) {
		this.freezeStatus = freezeStatus;
	}
	public BigDecimal getIntRateDr() {
		return intRateDr;
	}
	public void setIntRateDr(BigDecimal intRateDr) {
		this.intRateDr = intRateDr;
	}
	public BigDecimal getIntRateCr() {
		return intRateCr;
	}
	public void setIntRateCr(BigDecimal intRateCr) {
		this.intRateCr = intRateCr;
	}
	public String getEconomicSubSectorCode() {
		return economicSubSectorCode;
	}
	public void setEconomicSubSectorCode(String economicSubSectorCode) {
		this.economicSubSectorCode = economicSubSectorCode;
	}
	public String getEconomicSubSectorCodeIsic() {
		return economicSubSectorCodeIsic;
	}
	public void setEconomicSubSectorCodeIsic(String economicSubSectorCodeIsic) {
		this.economicSubSectorCodeIsic = economicSubSectorCodeIsic;
	}
	public String getPublicSectorCode() {
		return publicSectorCode;
	}
	public void setPublicSectorCode(String publicSectorCode) {
		this.publicSectorCode = publicSectorCode;
	}
	public String getInstitutionalSectorCode() {
		return institutionalSectorCode;
	}
	public void setInstitutionalSectorCode(String institutionalSectorCode) {
		this.institutionalSectorCode = institutionalSectorCode;
	}
	public java.sql.Date getLastTransactionDate() {
		return lastTransactionDate;
	}
	public void setLastTransactionDate(java.sql.Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}
	public String getAccountOwnership() {
		return accountOwnership;
	}
	public void setAccountOwnership(String accountOwnership) {
		this.accountOwnership = accountOwnership;
	}
	public int getJointParticipantCount() {
		return jointParticipantCount;
	}
	public void setJointParticipantCount(int jointParticipantCount) {
		this.jointParticipantCount = jointParticipantCount;
	}
	public String getCardSubscription() {
		return cardSubscription;
	}
	public void setCardSubscription(String cardSubscription) {
		this.cardSubscription = cardSubscription;
	}
	public String getPerformanceClass() {
		return performanceClass;
	}
	public void setPerformanceClass(String performanceClass) {
		this.performanceClass = performanceClass;
	}
	public Integer getCreditCategory() {
		return creditCategory;
	}
	public void setCreditCategory(Integer creditCategory) {
		this.creditCategory = creditCategory;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public java.sql.Date getDateLastModified() {
		return dateLastModified;
	}
	public void setDateLastModified(java.sql.Date dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

}
