package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbFxdemand {

  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  @Id
  private int sequenceNumber;
  private String clientName;
  private String fxClientFlag;
  private String currency;
  private int nop;
  private int amountRequestedLcy;
  private int bankDemandAmountLcy;
  private int amountAcceptedLcy;
  private String reasonForDemand;
  private java.sql.Date timeOfRequested;

}