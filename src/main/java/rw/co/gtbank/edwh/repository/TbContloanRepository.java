package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbContloan;

@Repository
public interface TbContloanRepository extends JpaRepository<TbContloan,String> {
	
	@Modifying
	@Query("delete from TbContloan b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
