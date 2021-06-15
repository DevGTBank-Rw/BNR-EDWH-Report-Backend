package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbMgtinfo2;

@Repository
public interface TbMgtinfo2Repository extends JpaRepository<TbMgtinfo2,String> {
	
	@Modifying
	@Query("delete from TbMgtinfo2 b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
