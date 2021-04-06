package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbMtommtrf {

  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  private String mtoList;
  private String remittanceType;
  private String sequenceNumber;
  @Id
  private String customerName;
  private int idType;
  private String identificationNumber;
  private String otherPartyName;
  private int otherIdType;
  private String otherIdNumber;
  private String residentsFlag;
  private String remittanceCountry;
  private String currency;
  private String transactionPurpose;
  private int amountLcy;
  private int amountFcy;
  private int feesAndCommission;
}
