package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbCardsys2;

@Repository
public interface TbCardsys2Repository extends JpaRepository<TbCardsys2,String> {
}
