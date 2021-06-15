package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbMtommtrf;

@Repository
public interface TbMtommtrfRepository extends JpaRepository<TbMtommtrf,String> {
	
	@Modifying
	@Query("delete from TbMtommtrf b where b.businessDate=:ids")
	void deleteByDate(Date ids);
}
