package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbAtmuptdly {

  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  private String transactionChannel;
  @Id
  private String atmId;
  private int atmUptimeAverage;
  private int networkTimeAverage;
  private int redundantLink;
  private int hardwareNetworkIncidents;
  private int softwareNetworkIncidents;
  private String preventiveMaintenance;
  private int transactionSuccessfulPcnt;
  private int transactionFailedPcnt;
  private boolean terminalStatus;
  private java.sql.Date feedDate;
  private String feedStatus;


}
