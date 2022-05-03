package com.example.fisbankmanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branch_details")
public class BranchDetails {

	@Id
	int branch_id;
	String branch_name;
	String branch_city;
	
	public BranchDetails() {
		
	}
	public BranchDetails(int branch_id, String branch_name, String branch_city) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_city = branch_city;
	}
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_city() {
		return branch_city;
	}
	public void setBranch_city(String branch_city) {
		this.branch_city = branch_city;
	}
	
	
	
}
