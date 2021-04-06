package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbFintxn {

  private String country;
  private String leBook;
  private int yearMonth;
  @Id
  private String accountNo;
  private String processOuc;
  private String cardNo;
  private String merchantId;
  private String transactionChannel;
  private String transactionCode;
  private String currency;
  private int transCountDr;
  private int transCountCr;
  private int transAmountDrFcy;
  private int transAmountCrFcy;
  private int transAmountDrLcy;
  private int transAmountCrLcy;
  private java.sql.Date feedDate;
  private String feedStatus;

}