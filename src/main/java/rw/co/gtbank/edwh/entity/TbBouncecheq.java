package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbBouncecheq {

  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  @Id
  private String accountNo;
  private String chequeNo;
  private java.sql.Date chequeIssuedDate;
  private String currency;
  private int chequeAmountFcy;
  private String bounceChequeReason;
  private String beneficiary;


}
