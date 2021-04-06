package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbExauditors {

  private String country;
  private String leBook;
  private int yearMonth;
  private int externalAuditSequence;
  private String externalAuditName;
  private String externalAuditorType;
  private String managingPartner;
  private String address;
  @Id
  private String emailAddress;
  private String phoneNumber;
  private java.sql.Date appointmentDate;
  private java.sql.Date accreditationDate;
  private java.sql.Date termStartDate;
  private java.sql.Date termEndDate;
  private java.sql.Date icparCertiIssueDate;
  private String icparRegNumber;
  private String otherAssignment;
  private java.sql.Date otherAssignStartDate;
  private java.sql.Date otherAssignEndDate;

}