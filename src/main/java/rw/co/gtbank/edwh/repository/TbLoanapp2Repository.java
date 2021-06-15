package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbLoanapp2;

@Repository
public interface TbLoanapp2Repository extends JpaRepository<TbLoanapp2,String> {
	
	@Modifying
	@Query("delete from TbLoanapp2 b where b.businessDate=:ids")
	void deleteByDate(Date ids);
}
