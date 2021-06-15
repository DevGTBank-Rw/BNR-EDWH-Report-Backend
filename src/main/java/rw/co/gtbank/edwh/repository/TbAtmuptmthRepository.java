package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbAtmuptmth;

@Repository
public interface TbAtmuptmthRepository extends JpaRepository<TbAtmuptmth,String> {
	@Modifying
	@Query("delete from TbAtmuptmth b where b.yearMonth=:ids")
	void deleteByDateModified(int ids);
}
