package rw.co.gtbank.edwh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.co.gtbank.edwh.entity.TbAccounts;

public interface TbAccountsRepository extends JpaRepository<TbAccounts,String> {
}
