package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbReadiness;

@Repository
public interface TbReadinessRepository extends JpaRepository<TbReadiness,String> {
	
	@Modifying
	@Query("delete from TbReadiness b where b.businessDate=:ids")
	void deleteByDate(Date ids);
}
