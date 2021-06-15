package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import rw.co.gtbank.edwh.entity.TbAnitcimat;

public interface TbAnitcimatRepository extends JpaRepository<TbAnitcimat,String> {
	
	@Modifying
	@Query("delete from TbAnitcimat b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
