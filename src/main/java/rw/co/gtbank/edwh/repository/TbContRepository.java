package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbCont;

import java.util.Date;
import java.util.List;

@Repository
public interface TbContRepository extends JpaRepository<TbCont,java.sql.Date> {

    @Modifying
    @Query("delete from TbCont b where b.dateLastModified=:ids")
    void deleteByDateModified(Date ids);
}
