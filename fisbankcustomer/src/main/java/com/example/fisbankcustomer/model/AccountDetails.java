package com.example.fisbankcustomer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class AccountDetails {

	@Id
	int account_no;
	int customer_no;
	int branch_id;
	int opening_balance;
	String account_type;
	String account_status;
	
	public AccountDetails() {
		
	}
	public AccountDetails(int account_no, int customer_no, int branch_id, int opening_balance, String account_type,
			String account_status) {
		super();
		this.account_no = account_no;
		this.customer_no = customer_no;
		this.branch_id = branch_id;
		this.opening_balance = opening_balance;
		this.account_type = account_type;
		this.account_status = account_status;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public int getOpening_balance() {
		return opening_balance;
	}
	public void setOpening_balance(int opening_balance) {
		this.opening_balance = opening_balance;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getAccount_status() {
		return account_status;
	}
	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	
	

}
