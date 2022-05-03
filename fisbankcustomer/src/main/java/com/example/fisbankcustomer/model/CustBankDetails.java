package com.example.fisbankcustomer.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_bank_details")
public class CustBankDetails {
	
	@Id
	int transaction_no;
	
	int account_no;
	String date_of_transaction;
	String mode_of_transaction;
	String transaction_type;
	float transaction_amount;
	
	
	public CustBankDetails() {
		
	}
	public CustBankDetails(int transaction_no, int account_no, String date_of_transaction, String mode_of_transaction,
			String transaction_type, float transaction_amount) {
		super();
		this.transaction_no = transaction_no;
		this.account_no = account_no;
		this.date_of_transaction = date_of_transaction;
		this.mode_of_transaction = mode_of_transaction;
		this.transaction_type = transaction_type;
		this.transaction_amount = transaction_amount;
	}
	public int getTransaction_no() {
		return transaction_no;
	}
	public void setTransaction_no(int transaction_no) {
		this.transaction_no = transaction_no;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getDate_of_transaction() {
		return date_of_transaction;
	}
	public void setDate_of_transaction(String date_of_transaction) {
		this.date_of_transaction = date_of_transaction;
	}
	public String getMode_of_transaction() {
		return mode_of_transaction;
	}
	public void setMode_of_transaction(String mode_of_transaction) {
		this.mode_of_transaction = mode_of_transaction;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public float getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(float transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
}
