package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbFxtxn;

@Repository
public interface TbFxtxnFXRepository extends JpaRepository<TbFxtxn,String> {
}
