package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbCollateral {

  private String country;
  private String leBook;
  @Id
  private String contractId;
  private String collateralId;
  private String customerId;
  private String collateralType;
  private String collateralOwnership;
  private int collateralAmountLcy;
  private java.sql.Date collateralLastValuationDate;
  private java.sql.Date collateralExpiryDate;
  private int collateralDiscountAmtLcy;
  private int collateralDiscountRate;
  private int collateralMarketValue;
  private String upiNumber;
  private String namePropertyValuer;
  private String regNumberValuer;
  private String rdbRegNumber;
  private int ltvRatio;
  private String insured;
  private java.sql.Date insuranceExpiryDate;
  private String gauranteeIssuer;
  private java.sql.Date dateLastModified;


}
