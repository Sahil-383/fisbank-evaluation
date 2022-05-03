package com.example.fisbankcustomer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fisbankcustomer.model.CustBankDetails;
import com.example.fisbankcustomer.repository.CustDetailsDao;

@Service
public class CustBankServiceImpl implements CustBankService{

	@Autowired
	CustDetailsDao dao;
	
	@Override
	public List<CustBankDetails> getBankDetails() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public CustBankDetails createNewAccount(CustBankDetails customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}

	@Override
	public String deleteAccount(CustBankDetails customer) {
		// TODO Auto-generated method stub
		dao.delete(customer);
		return "Account deleted. Good luck in other bank! *cough Idiot";
	}

	@Override
	public CustBankDetails searchByTransactionId(CustBankDetails customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
