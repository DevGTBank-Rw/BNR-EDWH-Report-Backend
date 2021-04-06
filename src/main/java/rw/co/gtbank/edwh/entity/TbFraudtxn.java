package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbFraudtxn {

  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  @Id
  private int fraudSequence;
  private String visionOuc;
  private String nameFraudster;
  private String fraudBy;
  private String fraudType;
  private int fraudScheme;
  private String descriptionOfFraud;
  private boolean fraudTxnStatus;
  private String currency;
  private int fraudAmountFcy;
  private int fraudAmountLcy;
  private int amountPaidFcy;
  private int amountPaidLcy;
  private String adoptToAvoid;

}