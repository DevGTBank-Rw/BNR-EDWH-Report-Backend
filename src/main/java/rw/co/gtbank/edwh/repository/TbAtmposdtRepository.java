package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import rw.co.gtbank.edwh.entity.TbAtmposdt;

public interface TbAtmposdtRepository extends JpaRepository<TbAtmposdt,String> {
	
	@Modifying
	@Query("delete from TbAtmposdt b where b.yearMonth=:ids")
	void deleteByDateModified(int ids);
}
