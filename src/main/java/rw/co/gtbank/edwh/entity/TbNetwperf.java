package rw.co.gtbank.edwh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TbNetwperf {
  @Id
  private String country;
  private String leBook;
  private int yearMonth;
  private int switchSessionCategory;
  private int networkBreakdownHours;
  private int commBreakdownHours;
  private int totalHours;
  private java.sql.Date feedDate;
  private String feedStatus;


}
