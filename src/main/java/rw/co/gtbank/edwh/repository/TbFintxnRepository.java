package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbFintxn;

@Repository
public interface TbFintxnRepository extends JpaRepository<TbFintxn,String> {
	
	@Modifying
	@Query("delete from TbFintxn b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
