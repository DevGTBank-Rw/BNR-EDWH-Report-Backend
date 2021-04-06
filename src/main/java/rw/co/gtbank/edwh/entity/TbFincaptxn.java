package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbFincaptxn {

  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  private String customerId;
  @Id
  private String accountNo;
  private String processOuc;
  private String transactionReference;
  private String transactionNarration;
  private String currency;
  private int transAmountFcy;
  private int transAmountLcy;
  private java.sql.Date feedDate;
  private String feedStatus;

}