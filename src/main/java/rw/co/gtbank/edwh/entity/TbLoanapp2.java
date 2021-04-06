package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbLoanapp2 {

  private String country;
  private String leBook;
  private String loanApplicationId;
  private int loanApplicationType;
  private java.sql.Date businessDate;
  @Id
  private String customerId;
  private String customerName;
  private String customerGender;
  private String visionOuc;
  private String loanPurpose;
  private String loanUtilizationLocation;
  private String visionSbu;
  private String economicSectorCode;
  private java.sql.Date applicationDate;
  private String applicationStatus;
  private String currency;
  private int appliedAmountLcy;
  private int appliedAmountFcy;
  private int approvedAmountLcy;
  private int approvedAmountFcy;
  private String rejectionReason;
  private String prevLoanPaid;
  private String loanInOtherInstitutions;

}