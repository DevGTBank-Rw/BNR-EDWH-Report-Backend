package rw.co.gtbank.edwh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TbLoanapppre {

  private String country;
  private String leBook;
  private java.sql.Date businessDate;
  @Id
  private String loanApplicationId;
  private String prevContractId;
  private String prevContModifReason;


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


  public String getLoanApplicationId() {
    return loanApplicationId;
  }

  public void setLoanApplicationId(String loanApplicationId) {
    this.loanApplicationId = loanApplicationId;
  }


  public String getPrevContractId() {
    return prevContractId;
  }

  public void setPrevContractId(String prevContractId) {
    this.prevContractId = prevContractId;
  }


  public String getPrevContModifReason() {
    return prevContModifReason;
  }

  public void setPrevContModifReason(String prevContModifReason) {
    this.prevContModifReason = prevContModifReason;
  }

}
