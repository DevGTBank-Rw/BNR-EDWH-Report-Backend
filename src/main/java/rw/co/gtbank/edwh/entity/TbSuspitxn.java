package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TbSuspitxn {
  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  private String fraudReportType;
  private int fraudSequence;
  private String visionOuc;
  @Id
  private String accountNo;
  private String surname;
  private String firstName;
  private String middleName;
  private String postalAddress;
  private java.sql.Date dateOfBirth;
  private String passportNumber;
  private int occupation;
  private String identityVerified;
  private String relationshipWithReportentity;
  private String actionTaken;
  private java.sql.Date resignationDate;
  private java.sql.Date transactionDate;
  private String transactionType;
  private String transactionNarration;
  private String currency;
  private int fraudAmountFcy;
  private int fraudAmountLcy;
  private int amountPaidFcy;
  private int amountPaidLcy;
  private String sourceOfFund;
  private String destinationFund;
  private String basisOfSuspicion;
  private String materialImpact;
  private String impactDescription;
  private String authority;
  private String howNotified;
  private String otherActionByReportEntity;
  private String reportingOfficerName;
  private String reportingOfficerPosition;
}
