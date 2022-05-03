package com.example.fisbankmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fisbankmanager.model.BranchDetails;
import com.example.fisbankmanager.repository.BranchDao;

@Service
public class BranchDetailsServiceImpl implements BranchDetailsService{

	
	@Autowired
	BranchDao dao;
	
	
	@Override
	public List<BranchDetails> getAllBranches() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public BranchDetails insertBranch(BranchDetails branch) {
		// TODO Auto-generated method stub
		return dao.save(branch);
	}

	@Override
	public String deleteBranch(BranchDetails branch) {
		// TODO Auto-generated method stub
		dao.delete(branch);
		return "Branch has been Deleted,  Customers are sad!";
	}

}
