package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TbLoanwrtoff {
  private String country;
  private String leBook;
  private int yearMonth;
  private String accountNo;
  @Id
  private String customerId;
  private int onBalance;
  private String visionGl;
  private java.sql.Date writtenOffDate;
}
