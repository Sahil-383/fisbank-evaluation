package com.example.fisbankmanager.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fisbankmanager.model.AccountDetails;

@Repository
@Transactional
public interface AccountDao extends JpaRepository<AccountDetails, Integer>{

}
