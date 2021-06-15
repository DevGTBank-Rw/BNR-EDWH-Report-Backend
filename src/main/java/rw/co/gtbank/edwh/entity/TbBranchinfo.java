package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbBranchinfo.class)
public class TbBranchinfo implements Serializable {
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
	private String branchStatus;
	private java.sql.Date branchOpenDate;
	private java.sql.Date branchCloseDate;
	private java.sql.Date dateLastModified;

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

	public String getVisionOuc() {
		return visionOuc;
	}

	public void setVisionOuc(String visionOuc) {
		this.visionOuc = visionOuc;
	}

	public String getOucDescription() {
		return oucDescription;
	}

	public void setOucDescription(String oucDescription) {
		this.oucDescription = oucDescription;
	}

	public String getVillageList() {
		return villageList;
	}

	public void setVillageList(String villageList) {
		this.villageList = villageList;
	}

	public int getBranchCategory() {
		return branchCategory;
	}

	public void setBranchCategory(int branchCategory) {
		this.branchCategory = branchCategory;
	}

	public int getBranchCategory_2() {
		return branchCategory_2;
	}

	public void setBranchCategory_2(int branchCategory_2) {
		this.branchCategory_2 = branchCategory_2;
	}

	public int getSubBranchFlag() {
		return subBranchFlag;
	}

	public void setSubBranchFlag(int subBranchFlag) {
		this.subBranchFlag = subBranchFlag;
	}

	public java.sql.Date getBranchLicenseDate() {
		return branchLicenseDate;
	}

	public void setBranchLicenseDate(java.sql.Date branchLicenseDate) {
		this.branchLicenseDate = branchLicenseDate;
	}

	public String getBranchStatus() {
		return branchStatus;
	}

	public void setBranchStatus(String branchStatus) {
		this.branchStatus = branchStatus;
	}

	public java.sql.Date getBranchOpenDate() {
		return branchOpenDate;
	}

	public void setBranchOpenDate(java.sql.Date branchOpenDate) {
		this.branchOpenDate = branchOpenDate;
	}

	public java.sql.Date getBranchCloseDate() {
		return branchCloseDate;
	}

	public void setBranchCloseDate(java.sql.Date branchCloseDate) {
		this.branchCloseDate = branchCloseDate;
	}

	public java.sql.Date getDateLastModified() {
		return dateLastModified;
	}

	public void setDateLastModified(java.sql.Date dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

}
