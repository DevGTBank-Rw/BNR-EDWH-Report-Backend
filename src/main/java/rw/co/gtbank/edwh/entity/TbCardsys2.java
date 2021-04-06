package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbCardsys2 {

  private String country;
  private String leBook;
  @Id
  private String cardNo;
  private String accountNo;
  private String cardType;
  private String cardProduct;
  private java.sql.Date cardIssueDate;
  private java.sql.Date cardCancelDate;
  private boolean cardStatus;
  private java.sql.Date dateLastModified;


}
