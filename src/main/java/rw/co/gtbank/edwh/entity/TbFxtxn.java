package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbFxtxn {
  @Id
  private String country;
  private String leBook;
  private int yearMonth;
  private String currency;
  private int openingBalance;
  private int purchaseAmount;
  private int otherInflowAmount;
  private int salesAmount;
  private int otherOutflowAmount;
  private int closingBalance;

}