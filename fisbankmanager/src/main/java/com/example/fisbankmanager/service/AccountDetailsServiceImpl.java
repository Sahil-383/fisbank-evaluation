package com.example.fisbankmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fisbankmanager.model.AccountDetails;
import com.example.fisbankmanager.repository.AccountDao;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService{
	@Autowired
	AccountDao dao;

	@Override
	public List<AccountDetails> getAllAccounts() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public AccountDetails insertAccount(AccountDetails account) {
		// TODO Auto-generated method stub
		return dao.save(account);
	}

	@Override
	public String deleteAccount(AccountDetails account) {
		// TODO Auto-generated method stub
		dao.delete(account);
		return "This Account is deleted... STEAL THE MONEY! QUICK!";
	}

}
