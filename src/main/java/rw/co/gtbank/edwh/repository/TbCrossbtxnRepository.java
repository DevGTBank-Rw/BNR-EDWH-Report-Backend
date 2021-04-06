package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbCrossbtxn;

@Repository
public interface TbCrossbtxnRepository extends JpaRepository<TbCrossbtxn,String> {
}
