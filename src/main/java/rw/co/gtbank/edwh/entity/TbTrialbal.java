package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TbTrialbal {
  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  @Id
  private String officeAccount;
  private String visionGl;
  private String visionOuc;
  private String currency;
  private int tranCcyDr;
  private int tranCcyCr;
  private int lcyCcyDr;
  private int lcyCcyCr;
  private java.sql.Date feedDate;
  private String feedStatus;

}
