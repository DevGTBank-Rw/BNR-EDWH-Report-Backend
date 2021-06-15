package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbGlmaps;

@Repository
public interface TbGlmapsRepository extends JpaRepository<TbGlmaps,String> {
	
	@Modifying
	@Query("delete from TbGlmaps b where b.dateLastModified=:ids")
	void deleteByDate(Date ids);
}
