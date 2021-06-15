package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbAtmuptdly;

import java.util.Date;

@Repository
public interface TbAtmuptdlyRepository extends JpaRepository<TbAtmuptdly,String> {
    @Modifying
    @Query("delete from TbAtmuptdly b where b.businessDate=:ids")
    void deleteByDate(Date ids);
}
