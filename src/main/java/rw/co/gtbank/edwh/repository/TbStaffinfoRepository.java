package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbStaffinfo;
import rw.co.gtbank.edwh.entity.TbSuspitxn;
@Repository
public interface TbStaffinfoRepository extends JpaRepository<TbStaffinfo,String> {
	
	@Modifying
	@Query("delete from TbStaffinfo b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
