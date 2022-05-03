package com.example.fisbankmanager.service;

import java.util.List;

import com.example.fisbankmanager.model.BranchDetails;

public interface BranchDetailsService {
	public List<BranchDetails> getAllBranches();
	public BranchDetails insertBranch(BranchDetails branch);
	public String deleteBranch(BranchDetails branch);


}
