package rw.co.gtbank.edwh.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class TbAccounts {

  private String country;
  private String leBook;
  @Id
  private String accountNo;
  private String accountName;
  private String visionOuc;
  private String visionSbu;
  private Boolean accountStatus;
  private java.sql.Date accountStatusDate;
  private String customerId;
  private String accountOfficer;
  private String currency;
  private String visionGl;
  private String accountType;
  private java.sql.Date accountOpenDate;
  private java.sql.Date accountClosingDate;
  private String freezeStatus;
  private int intRateDr;
  private int intRateCr;
  private String economicSubSectorCode;
  private String economicSubSectorCodeIsic;
  private String publicSectorCode;
  private String institutionalSectorCode;
  private java.sql.Date lastTransactionDate;
  private String accountOwnership;
  private int jointParticipantCount;
  private String cardSubscription;
  private String performanceClass;
  private int creditCategory;
  private String merchantId;
  private java.sql.Date dateLastModified;

}
