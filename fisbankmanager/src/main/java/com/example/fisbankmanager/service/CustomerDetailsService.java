package com.example.fisbankmanager.service;

import java.util.List;

import com.example.fisbankmanager.model.CustomerDetails;

public interface CustomerDetailsService {
	public List<CustomerDetails> getAllCustomers();
	public CustomerDetails insertCustomer(CustomerDetails customer);
	public String deleteCustomer(CustomerDetails customer);

}
