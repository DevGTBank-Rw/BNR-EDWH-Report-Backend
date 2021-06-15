package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbInfrasinfo.class)
public class TbInfrasinfo implements Serializable {
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

	public int getYearMonth() {
		return yearMonth;
	}

	public void setYearMonth(int yearMonth) {
		this.yearMonth = yearMonth;
	}

	public int getProvinceList() {
		return provinceList;
	}

	public void setProvinceList(int provinceList) {
		this.provinceList = provinceList;
	}

	public int getNumOfBranches() {
		return numOfBranches;
	}

	public void setNumOfBranches(int numOfBranches) {
		this.numOfBranches = numOfBranches;
	}

	public int getNumOfSubBranches() {
		return numOfSubBranches;
	}

	public void setNumOfSubBranches(int numOfSubBranches) {
		this.numOfSubBranches = numOfSubBranches;
	}

	public int getNumOfUrbanBranches() {
		return numOfUrbanBranches;
	}

	public void setNumOfUrbanBranches(int numOfUrbanBranches) {
		this.numOfUrbanBranches = numOfUrbanBranches;
	}

	public int getNumOfRuralBranches() {
		return numOfRuralBranches;
	}

	public void setNumOfRuralBranches(int numOfRuralBranches) {
		this.numOfRuralBranches = numOfRuralBranches;
	}

	public int getNumOfCounters() {
		return numOfCounters;
	}

	public void setNumOfCounters(int numOfCounters) {
		this.numOfCounters = numOfCounters;
	}

	public int getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(int numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}

	public int getNumOfClientsAccounts() {
		return numOfClientsAccounts;
	}

	public void setNumOfClientsAccounts(int numOfClientsAccounts) {
		this.numOfClientsAccounts = numOfClientsAccounts;
	}

	public int getNumOfDormantsAccounts() {
		return numOfDormantsAccounts;
	}

	public void setNumOfDormantsAccounts(int numOfDormantsAccounts) {
		this.numOfDormantsAccounts = numOfDormantsAccounts;
	}

	public int getNumOfDepositors() {
		return numOfDepositors;
	}

	public void setNumOfDepositors(int numOfDepositors) {
		this.numOfDepositors = numOfDepositors;
	}

	public int getAmtOfDeposits() {
		return amtOfDeposits;
	}

	public void setAmtOfDeposits(int amtOfDeposits) {
		this.amtOfDeposits = amtOfDeposits;
	}

	public int getNumOfLoans() {
		return numOfLoans;
	}

	public void setNumOfLoans(int numOfLoans) {
		this.numOfLoans = numOfLoans;
	}

	public int getAmtOfLoans() {
		return amtOfLoans;
	}

	public void setAmtOfLoans(int amtOfLoans) {
		this.amtOfLoans = amtOfLoans;
	}

	public int getNumOfBorrowers() {
		return numOfBorrowers;
	}

	public void setNumOfBorrowers(int numOfBorrowers) {
		this.numOfBorrowers = numOfBorrowers;
	}

	public int getNumOfAtm() {
		return numOfAtm;
	}

	public void setNumOfAtm(int numOfAtm) {
		this.numOfAtm = numOfAtm;
	}

	public int getNumOfUrbanAtm() {
		return numOfUrbanAtm;
	}

	public void setNumOfUrbanAtm(int numOfUrbanAtm) {
		this.numOfUrbanAtm = numOfUrbanAtm;
	}

	public int getNumOfRuralAtm() {
		return numOfRuralAtm;
	}

	public void setNumOfRuralAtm(int numOfRuralAtm) {
		this.numOfRuralAtm = numOfRuralAtm;
	}

	public java.sql.Date getFeedDate() {
		return feedDate;
	}

	public void setFeedDate(java.sql.Date feedDate) {
		this.feedDate = feedDate;
	}

	public String getFeedStatus() {
		return feedStatus;
	}

	public void setFeedStatus(String feedStatus) {
		this.feedStatus = feedStatus;
	}

}