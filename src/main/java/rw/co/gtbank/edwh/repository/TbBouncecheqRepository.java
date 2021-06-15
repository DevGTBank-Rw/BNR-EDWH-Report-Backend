package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbBouncecheq;

@Repository
public interface TbBouncecheqRepository extends JpaRepository<TbBouncecheq,String> {
	
	@Modifying
	@Query("delete from TbBouncecheq b where b.businessDate=:ids")
	void deleteByDate(Date ids);
}
