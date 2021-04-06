package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbContsche {

  private String country;
  private String leBook;
  private int yearMonth;
  @Id
  private String contractId;
  private java.sql.Date scheduleDate;
  private java.sql.Date paymentDate;
  private int principalAmountDueLcy;
  private int principalAmountDueFcy;
  private int intAmountDueLcy;
  private int intAmountDueFcy;
  private int principalAmountPaidLcy;
  private int principalAmountPaidFcy;
  private int intAmountPaidLcy;
  private int intAmountPaidFcy;
  private int outstandingAmountLcy;
  private int outstandingAmountFcy;
}
