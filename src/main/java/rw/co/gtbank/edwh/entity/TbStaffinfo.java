package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TbStaffinfo {

  private String country;
  private String leBook;
  private int yearMonth;
  @Id
  private String staffId;
  private String staffName;
  private String visionOuc;
  private String departmentId;
  private String staffGender;
  private String nationality;
  private int idType;
  private String idNumber;
  private java.sql.Date dateOfBirth;
  private String roleCode;
  private String gradeCode;
  private int education;
  private String professionalCertificates;
  private String telephone;
  private String emailId;
  private java.sql.Date dateOfEmployment;
  private boolean staffStatus;
  private java.sql.Date dateOfExit;
  private String reasonForExit;
  private String bnrApprovalReqd;
  private java.sql.Date dateOfBnrApproval;
  private String previousEmployer;


}
