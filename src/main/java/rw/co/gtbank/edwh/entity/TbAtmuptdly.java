package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@IdClass(TbAtmuptdly.class)
public class TbAtmuptdly implements Serializable {

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

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getLeBook() {
    return leBook;
  }

  public void setLeBook(String leBook) {
    this.leBook = leBook;
  }

  public Date getBusinessDate() {
    return businessDate;
  }

  public void setBusinessDate(Date businessDate) {
    this.businessDate = businessDate;
  }

  public String getTransactionChannel() {
    return transactionChannel;
  }

  public void setTransactionChannel(String transactionChannel) {
    this.transactionChannel = transactionChannel;
  }

  public String getAtmId() {
    return atmId;
  }

  public void setAtmId(String atmId) {
    this.atmId = atmId;
  }

  public int getAtmUptimeAverage() {
    return atmUptimeAverage;
  }

  public void setAtmUptimeAverage(int atmUptimeAverage) {
    this.atmUptimeAverage = atmUptimeAverage;
  }

  public int getNetworkTimeAverage() {
    return networkTimeAverage;
  }

  public void setNetworkTimeAverage(int networkTimeAverage) {
    this.networkTimeAverage = networkTimeAverage;
  }

  public int getRedundantLink() {
    return redundantLink;
  }

  public void setRedundantLink(int redundantLink) {
    this.redundantLink = redundantLink;
  }

  public int getHardwareNetworkIncidents() {
    return hardwareNetworkIncidents;
  }

  public void setHardwareNetworkIncidents(int hardwareNetworkIncidents) {
    this.hardwareNetworkIncidents = hardwareNetworkIncidents;
  }

  public int getSoftwareNetworkIncidents() {
    return softwareNetworkIncidents;
  }

  public void setSoftwareNetworkIncidents(int softwareNetworkIncidents) {
    this.softwareNetworkIncidents = softwareNetworkIncidents;
  }

  public String getPreventiveMaintenance() {
    return preventiveMaintenance;
  }

  public void setPreventiveMaintenance(String preventiveMaintenance) {
    this.preventiveMaintenance = preventiveMaintenance;
  }

  public int getTransactionSuccessfulPcnt() {
    return transactionSuccessfulPcnt;
  }

  public void setTransactionSuccessfulPcnt(int transactionSuccessfulPcnt) {
    this.transactionSuccessfulPcnt = transactionSuccessfulPcnt;
  }

  public int getTransactionFailedPcnt() {
    return transactionFailedPcnt;
  }

  public void setTransactionFailedPcnt(int transactionFailedPcnt) {
    this.transactionFailedPcnt = transactionFailedPcnt;
  }

  public boolean isTerminalStatus() {
    return terminalStatus;
  }

  public void setTerminalStatus(boolean terminalStatus) {
    this.terminalStatus = terminalStatus;
  }

  public Date getFeedDate() {
    return feedDate;
  }

  public void setFeedDate(Date feedDate) {
    this.feedDate = feedDate;
  }

  public String getFeedStatus() {
    return feedStatus;
  }

  public void setFeedStatus(String feedStatus) {
    this.feedStatus = feedStatus;
  }

}
