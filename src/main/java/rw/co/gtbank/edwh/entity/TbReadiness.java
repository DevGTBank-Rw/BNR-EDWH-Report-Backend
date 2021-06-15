package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@IdClass(TbReadiness.class)
public class TbReadiness implements Serializable {
	@Id
	private String country;
	private String leBook;
	private java.sql.Date businessDate;
	private String readinessFrequency;
	private String readinessFlag;

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

	public java.sql.Date getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(java.sql.Date businessDate) {
		this.businessDate = businessDate;
	}

	public String getReadinessFrequency() {
		return readinessFrequency;
	}

	public void setReadinessFrequency(String readinessFrequency) {
		this.readinessFrequency = readinessFrequency;
	}

	public String getReadinessFlag() {
		return readinessFlag;
	}

	public void setReadinessFlag(String readinessFlag) {
		this.readinessFlag = readinessFlag;
	}

}
