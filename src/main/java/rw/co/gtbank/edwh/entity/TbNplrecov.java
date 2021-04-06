package rw.co.gtbank.edwh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TbNplrecov {
  private String country;
  private String leBook;
  private int yearMonth;
  @Id
  private String accountNo;
  private String customerId;
  private String visionGl;
  private int totalExposPrincipal;
  private int totalExposInterest;
  private int recoveryPrincipalAmount;
  private int recoveryInterestAmount;
  private java.sql.Date dateOfRecovery;
  private String deliquencyReason;
  private int recoveryAction;

}
