package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbAtmofustxn {
  @Id
  private String country;
  private String leBook;
  private int yearMonth;
  private int transCount;
  private int transAmountLcy;
  private java.sql.Date feedDate;
  private String feedStatus;

}
