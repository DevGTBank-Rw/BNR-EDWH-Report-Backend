package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import rw.co.gtbank.edwh.entity.TbStaffinfo;
import rw.co.gtbank.edwh.entity.TbStakehold;

public interface TbStakeHoldRepository extends JpaRepository<TbStakehold,String> {

    @Modifying
    @Query("delete from TbStakehold b where b.yearMonth=:ids")
    void deleteByDate(int ids);
}
