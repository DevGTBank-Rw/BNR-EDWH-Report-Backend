package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TbGlmaps {

  private String country;
  private String leBook;
  private String visionGl;
  @Id
  private String glEnrichId;
  private String productDr;
  private String productCr;
  private String frlLineBsDr;
  private String frlLineBsCr;
  private String frlLinePlDr;
  private String frlLinePlCr;
  private boolean glMapStatus;
  private java.sql.Date dateLastModified;
  private java.sql.Date feedDate;
  private String feedStatus;

}