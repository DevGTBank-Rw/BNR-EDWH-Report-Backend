package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbAcctmaps {
  private String country;
  private String leBook;
  @Id
  private String accountNo;
  private String productDr;
  private String productCr;
  private String frlLineBsDr;
  private String frlLineBsCr;
  private String frlLinePlDr;
  private String frlLinePlCr;
  private boolean accountsMappingStatus;
  private java.sql.Date dateLastModified;
  private java.sql.Date feedDate;
  private String feedStatus;

}
