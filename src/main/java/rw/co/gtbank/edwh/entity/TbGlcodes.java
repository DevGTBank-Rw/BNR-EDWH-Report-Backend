package rw.co.gtbank.edwh.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(TbGlcodes.class)
public class TbGlcodes implements Serializable {
	private String country;
	private String leBook;
	private String visionGl;
	private String glDescription;
	@Id
	private int glType;
	private boolean glStatus;
	private java.sql.Date glStatusDate;
	private java.sql.Date dateLastModified;
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

	public String getVisionGl() {
		return visionGl;
	}

	public void setVisionGl(String visionGl) {
		this.visionGl = visionGl;
	}

	public String getGlDescription() {
		return glDescription;
	}

	public void setGlDescription(String glDescription) {
		this.glDescription = glDescription;
	}

	public int getGlType() {
		return glType;
	}

	public void setGlType(int glType) {
		this.glType = glType;
	}

	public boolean isGlStatus() {
		return glStatus;
	}

	public void setGlStatus(boolean glStatus) {
		this.glStatus = glStatus;
	}

	public java.sql.Date getGlStatusDate() {
		return glStatusDate;
	}

	public void setGlStatusDate(java.sql.Date glStatusDate) {
		this.glStatusDate = glStatusDate;
	}

	public java.sql.Date getDateLastModified() {
		return dateLastModified;
	}

	public void setDateLastModified(java.sql.Date dateLastModified) {
		this.dateLastModified = dateLastModified;
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