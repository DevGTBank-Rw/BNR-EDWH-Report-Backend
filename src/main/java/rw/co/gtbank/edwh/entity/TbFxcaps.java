package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbFxcaps {

  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  private int fxTransactionType;
  private String payslipNumber;
  @Id
  private String customerId;
  private String customerName;
  private String nationality;
  private String residence;
  private String fxCustomerType;
  private String countryOfOrigin;
  private String destinationCountry;
  private String phoneNumber;
  private int idType;
  private String idDetail;
  private String currency;
  private int exchangeRate;
  private int amountFcy;
  private int amountLcy;
  private String transactionPurpose;
}