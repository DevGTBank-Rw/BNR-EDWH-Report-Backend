package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbAtmposdt {
 @Id
  private String country;
  private String leBook;
  private int yearMonth;
  private int daySession;
  private String downtimeReasonType;
  private int totalValue;
  private java.sql.Date feedDate;
  private String feedStatus;

}
