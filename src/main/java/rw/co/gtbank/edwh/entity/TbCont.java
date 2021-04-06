package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbCont {

  private String country;
  private String leBook;
  @Id
  private String contractId;
  private String customerId;
  private String visionOuc;
  private String visionSbu;
  private java.sql.Date startDate;
  private java.sql.Date maturityDate;
  private java.sql.Date settlementDate;
  private String dealType;
  private String dealSubType;
  private int interestRateMethod;
  private int interestRateDr;
  private int interestRateCr;
  private int aprRate;
  private int contractApplicationFee;
  private int contractAdministrativeFee;
  private int otherContractCharges;
  private int commissions;
  private String insuredFlag;
  private int contractInsuranceCharges;
  private java.sql.Date insExpiryDate;
  private String currency;
  private String principalGl;
  private String interestGl;
  private int principalAmountFcy;
  private int principalAmountLcy;
  private int interestAmountFcy;
  private int interestAmountLcy;
  private String loanApplicationId;
  private boolean contractStatus;
  private java.sql.Date dateLastModified;

}
