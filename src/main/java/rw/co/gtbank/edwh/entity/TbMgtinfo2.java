package rw.co.gtbank.edwh.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TbMgtinfo2 {

  private String country;
  private String leBook;
  private int yearMonth;
  private int sequenceId;
  private String name;
  @Id
  private String staffId;
  private int mgtMemberType;
  private String executiveFlag;
  private String gender;
  private String nationality;
  private String residence;
  private int idType;
  private String idNumber;
  private java.sql.Date dateOfBirth;
  private int education;
  private String professionalCertificates;
  private String telephone;
  private String emailId;
  private java.sql.Date dateOfAppointment;
  private java.sql.Date dateOfBnrApproval;
  private String boardChairCommittee_01;
  private String boardChairCommittee_02;
  private String boardChairCommittee_03;
  private String boardChairCommittee_04;
  private String board_Committee_01;
  private String board_Committee_02;
  private String board_Committee_03;
  private String board_Committee_04;
  private String board_Committee_05;
  private String board_Committee_06;
  private String board_Committee_07;
  private String board_Committee_08;
  private String managementCommittee_01;
  private String managementCommittee_02;
  private String managementCommittee_03;
  private String managementCommittee_04;
  private String managementCommittee_05;
  private String managementCommittee_06;
  private String managementCommittee_07;
  private String managementCommittee_08;
  private String companyName_01;
  private String companyName_02;
  private String companyName_03;
  private String roleCompany_01;
  private String roleCompany_02;
  private String roleCompany_03;
  private String empLocation_01;
  private String empLocation_02;
  private String empLocation_03;
  private String shareholdingFlag;
  private String shareholdingInfo;

}
