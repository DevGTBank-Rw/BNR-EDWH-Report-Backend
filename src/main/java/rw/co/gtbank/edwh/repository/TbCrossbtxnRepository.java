package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbCrossbtxn;

@Repository
public interface TbCrossbtxnRepository extends JpaRepository<TbCrossbtxn,String> {
	
	@Modifying
	@Query("delete from TbCrossbtxn b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
