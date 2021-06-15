package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbInfrasinfo;

@Repository
public interface TbInfrasinfoRepository extends JpaRepository<TbInfrasinfo,String> {
	
	@Modifying
	@Query("delete from TbInfrasinfo b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
