package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbAtmposdt.class)
public class TbAtmposdt implements Serializable {
	@Id
	private String country;
	private String leBook;
	private int yearMonth;
	private int daySession;
	private String downtimeReasonType;
	private int totalValue;
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

	public int getDaySession() {
		return daySession;
	}

	public void setDaySession(int daySession) {
		this.daySession = daySession;
	}

	public String getDowntimeReasonType() {
		return downtimeReasonType;
	}

	public void setDowntimeReasonType(String downtimeReasonType) {
		this.downtimeReasonType = downtimeReasonType;
	}

	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
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
