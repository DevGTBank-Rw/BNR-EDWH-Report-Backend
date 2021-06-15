package rw.co.gtbank.edwh.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import rw.co.gtbank.edwh.entity.TbAccounts;

public interface TbAccountsRepository extends JpaRepository<TbAccounts,String> {
	
	@Modifying
    @Query("delete from TbAccounts b where b.dateLastModified=:ids")
    void deleteByDateModified(Date ids);
}
