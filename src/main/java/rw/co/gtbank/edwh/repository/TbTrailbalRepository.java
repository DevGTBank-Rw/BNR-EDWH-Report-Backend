package rw.co.gtbank.edwh.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.co.gtbank.edwh.entity.TbTrialbal;

@Repository
public interface TbTrailbalRepository extends JpaRepository<TbTrialbal,String> {
}
