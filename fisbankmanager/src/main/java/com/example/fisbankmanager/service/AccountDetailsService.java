package com.example.fisbankmanager.service;

import java.util.List;

import com.example.fisbankmanager.model.AccountDetails;

public interface AccountDetailsService {
	public List<AccountDetails> getAllAccounts();
	public AccountDetails insertAccount(AccountDetails account);
	public String deleteAccount(AccountDetails account);


}
