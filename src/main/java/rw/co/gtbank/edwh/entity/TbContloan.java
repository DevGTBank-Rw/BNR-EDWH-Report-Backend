package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbContloan {

  private String country;
  private String leBook;
  private int yearMonth;
  @Id
  private String contractId;
  private String performanceClass;
  private int disbursedAmount;
  private int prinOutstandingAmtFcy;
  private int prinOutstandingAmtLcy;
  private int interestDueFcy;
  private int interestDueLcy;
  private int regulatoryProvision;
  private int provisionHeld;
  private java.sql.Date dateOfProvision;
  private int loanIncludInterest;
  private int otherCrPenalties;
  private int otherCharges;
  private int suspenseInterest;
  private String repaymentFrequency;
  private int emiAmount;
  private java.sql.Date datePastDue;
  private int dueAmount;
  private int gracePeriodAccorded;
  private int instalmentsInArrears;
  private int numOfInstalments;
  private int totalInstalmentsPaid;
  private int totalInstalmentsOutstanding;

}
