package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbCcyrates {

  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  @Id
  private String currency;
  private int midRate;
  private int buyRate;
  private int sellRate;
  private int transferMidRate;
  private int transferBuyRate;
  private int transferSellRate;
  private java.sql.Date feedDate;
  private String feedStatus;


}
