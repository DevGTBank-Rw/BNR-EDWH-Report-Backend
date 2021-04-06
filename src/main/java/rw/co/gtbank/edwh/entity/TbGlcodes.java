package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbGlcodes {

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

}