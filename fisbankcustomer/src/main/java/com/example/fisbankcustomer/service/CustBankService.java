package com.example.fisbankcustomer.service;

import java.util.List;

import com.example.fisbankcustomer.model.CustBankDetails;

public interface CustBankService {
	public List<CustBankDetails> getBankDetails();
	public CustBankDetails createNewAccount(CustBankDetails customer);
	public String deleteAccount(CustBankDetails customer);
	public CustBankDetails searchByTransactionId(CustBankDetails customer);

}
