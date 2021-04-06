package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbReadiness;

@Repository
public interface TbReadinessRepository extends JpaRepository<TbReadiness,String> {
}
