package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbFinmth;

@Repository
public interface TbFinmthRepository extends JpaRepository<TbFinmth,String> {
	
	@Modifying
	@Query("delete from TbFinmth b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
