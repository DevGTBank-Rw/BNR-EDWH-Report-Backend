package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TbReadiness {
  @Id
  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  private String readinessFrequency;
  private String readinessFlag;


}
