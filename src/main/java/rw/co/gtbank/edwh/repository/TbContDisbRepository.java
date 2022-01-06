package rw.co.gtbank.edwh.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import rw.co.gtbank.edwh.entity.TbContDisb;

public interface TbContDisbRepository extends JpaRepository<TbContDisb,String>  {

    @Modifying
	@Query("delete from TbContDisb b where b.businessDate=:ids")
	void deleteByDate(Date date);
    
}
