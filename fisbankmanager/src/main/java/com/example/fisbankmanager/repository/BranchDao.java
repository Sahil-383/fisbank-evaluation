package com.example.fisbankmanager.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fisbankmanager.model.BranchDetails;

@Repository
@Transactional
public interface BranchDao extends JpaRepository<BranchDetails, Integer>{

}
