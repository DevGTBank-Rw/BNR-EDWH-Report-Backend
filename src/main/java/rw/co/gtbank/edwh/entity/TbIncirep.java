package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbIncirep {

  private String country;
  private String leBook;
  @Id
  private String incidentId;
  private java.sql.Date dateOfOccurrence;
  private java.sql.Date dateOfAccounting;
  private java.sql.Date dateOfDetection;
  private java.sql.Date estimatedCompletionDate;
  private String businessLevel;
  private String internalBusinessLine;
  private String eventLevel;
  private int netLossLcy;
  private String insuranceClaim;
  private int insClaimAmt;
  private int insClaimRec;
  private int otherRecoveries;
  private int totalRecoveries;
  private String causeSummary;
  private String actionPlanSummary;
  private java.sql.Date dateLastModified;
}