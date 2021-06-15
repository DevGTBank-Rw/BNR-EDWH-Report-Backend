package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbAtmuptmth.class)
public class TbAtmuptmth implements Serializable {
	@Id
	private String country;
	private String leBook;
	private int yearMonth;
	private int atmUptimeAverage;
	private int networkTimeAverage;
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
