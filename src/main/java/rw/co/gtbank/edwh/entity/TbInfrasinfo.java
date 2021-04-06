package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbInfrasinfo {
 @Id
  private String country;
  private String leBook;
  private int yearMonth;
  private int provinceList;
  private int numOfBranches;
  private int numOfSubBranches;
  private int numOfUrbanBranches;
  private int numOfRuralBranches;
  private int numOfCounters;
  private int numOfEmployees;
  private int numOfClientsAccounts;
  private int numOfDormantsAccounts;
  private int numOfDepositors;
  private int amtOfDeposits;
  private int numOfLoans;
  private int amtOfLoans;
  private int numOfBorrowers;
  private int numOfAtm;
  private int numOfUrbanAtm;
  private int numOfRuralAtm;
  private java.sql.Date feedDate;
  private String feedStatus;
}