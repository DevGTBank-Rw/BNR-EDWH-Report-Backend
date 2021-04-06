package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbFinmth {

  private String country;
  private String leBook;
  private int yearMonth;
  private String customerId;
  @Id
  private String accountNo;
  private String officeAccount;
  private String visionGl;
  private String residentsFlag;
  private String currency;
  private int amountFcy;
  private int amountLcy;
  private java.sql.Date feedDate;
  private String feedStatus;

}