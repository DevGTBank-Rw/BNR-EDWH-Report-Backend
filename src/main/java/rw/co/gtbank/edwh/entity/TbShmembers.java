package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TbShmembers {

  private String country;
  private String leBook;
  private int yearMonth;
  private int shareholderSequence;
  private String shareholderName;
  private String shareholderGender;
  private java.sql.Date dateOfBirth;
  private String placeOfBirth;
  private String nationality;
  private String residence;
  private int idType;
  @Id
  private String idNumber;
  private String phoneNumber;
  private java.sql.Date vettingDate;
  private boolean legalStatus;
  private String majorPromoters_1;
  private String majorPromoters_2;
  private int subscribedShares;
  private int shareValue;
  private int totalShareholdingLcy;
  private int paidUpShares;
  private int percentageOfShare;

}
