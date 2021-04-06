package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbAnitcimat {
  @Id
  private String country;
  private String leBook;
  private int yearMonth;
  private String visionGl;
  private String anticipatedMatTenorCode;
  private int anticipatedMatAmountLcy;
  private java.sql.Date feedDate;
  private String feedStatus;


}
