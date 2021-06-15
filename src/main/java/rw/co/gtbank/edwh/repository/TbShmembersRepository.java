package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbShmembers;

@Repository
public interface TbShmembersRepository extends JpaRepository<TbShmembers,String> {
	
	@Modifying
	@Query("delete from TbShmembers b where b.yearMonth=:ids")
	void deleteByDate(int ids);
}
