package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbFinpubsec {

  private String country;
  private String leBook;
  private int yearMonth;
  @Id
  private String accountNo;
  private String publicSectorCode;
  private String corporateName;
  private int sequenceNumber;
  private int openBalanceLcy;
  private int depositLcy;
  private int withdrawalLcy;
  private int closingBalanceLcy;
  private String ag;
  private String chap;
  private String fCurr;
  private java.sql.Date feedDate;
  private String feedStatus;

}