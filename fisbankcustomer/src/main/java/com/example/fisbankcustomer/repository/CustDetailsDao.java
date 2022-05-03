package com.example.fisbankcustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.fisbankcustomer.model.CustBankDetails;

@Repository
@Transactional
public interface CustDetailsDao extends JpaRepository<CustBankDetails, Integer>{

}
