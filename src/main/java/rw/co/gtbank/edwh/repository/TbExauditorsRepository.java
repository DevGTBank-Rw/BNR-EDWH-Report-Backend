package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbExauditors;

@Repository
public interface TbExauditorsRepository extends JpaRepository<TbExauditors,String> {
	
	@Modifying
	@Query("delete from TbExauditors b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
