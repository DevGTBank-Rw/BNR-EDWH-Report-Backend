package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbLoanwrtoff;

@Repository
public interface TbLoanwrtoffRepository extends JpaRepository<TbLoanwrtoff,String> {
	
	@Modifying
	@Query("delete from TbLoanwrtoff b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
