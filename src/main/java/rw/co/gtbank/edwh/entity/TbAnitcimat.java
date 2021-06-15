package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbAnitcimat.class)
public class TbAnitcimat implements Serializable {
	@Id
	private String country;
	private String leBook;
	private int yearMonth;
	private String visionGl;
	private String anticipatedMatTenorCode;
	private BigDecimal anticipatedMatAmountLcy;
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

	public String getVisionGl() {
		return visionGl;
	}

	public void setVisionGl(String visionGl) {
		this.visionGl = visionGl;
	}

	public String getAnticipatedMatTenorCode() {
		return anticipatedMatTenorCode;
	}

	public void setAnticipatedMatTenorCode(String anticipatedMatTenorCode) {
		this.anticipatedMatTenorCode = anticipatedMatTenorCode;
	}

	public BigDecimal getAnticipatedMatAmountLcy() {
		return anticipatedMatAmountLcy;
	}

	public void setAnticipatedMatAmountLcy(BigDecimal anticipatedMatAmountLcy) {
		this.anticipatedMatAmountLcy = anticipatedMatAmountLcy;
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
