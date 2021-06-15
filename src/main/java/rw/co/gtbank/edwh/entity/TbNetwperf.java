package rw.co.gtbank.edwh.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TbNetwperf.class)
public class TbNetwperf implements Serializable {
	@Id
	private String country;
	private String leBook;
	private int yearMonth;
	private int switchSessionCategory;
	private int networkBreakdownHours;
	private int commBreakdownHours;
	private int totalHours;
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

	public int getSwitchSessionCategory() {
		return switchSessionCategory;
	}

	public void setSwitchSessionCategory(int switchSessionCategory) {
		this.switchSessionCategory = switchSessionCategory;
	}

	public int getNetworkBreakdownHours() {
		return networkBreakdownHours;
	}

	public void setNetworkBreakdownHours(int networkBreakdownHours) {
		this.networkBreakdownHours = networkBreakdownHours;
	}

	public int getCommBreakdownHours() {
		return commBreakdownHours;
	}

	public void setCommBreakdownHours(int commBreakdownHours) {
		this.commBreakdownHours = commBreakdownHours;
	}

	public int getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
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
