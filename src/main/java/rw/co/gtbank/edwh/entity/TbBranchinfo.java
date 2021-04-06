package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbBranchinfo {
  @Id
  private String country;
  private String leBook;
  private String visionOuc;
  private String oucDescription;
  private String villageList;
  private int branchCategory;
  private int branchCategory_2;
  private int subBranchFlag;
  private java.sql.Date branchLicenseDate;
  private boolean branchStatus;
  private java.sql.Date branchOpenDate;
  private java.sql.Date branchCloseDate;
  private java.sql.Date dateLastModified;


}
