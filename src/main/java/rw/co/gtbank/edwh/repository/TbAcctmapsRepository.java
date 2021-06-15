package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import rw.co.gtbank.edwh.entity.TbAcctmaps;

public interface TbAcctmapsRepository extends JpaRepository<TbAcctmaps, String> {

	@Modifying
	@Query("delete from TbAcctmaps b where b.dateLastModified=:ids")
	void deleteByDateModified(Date ids);
}
