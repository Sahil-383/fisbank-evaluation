package com.example.fisbankmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fisbankmanager.model.CustomerDetails;
import com.example.fisbankmanager.repository.CustomersDao;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService{
	
	
	@Autowired
	CustomersDao dao;
	
	@Override
	public List<CustomerDetails> getAllCustomers() {
		return dao.findAll();
	}

	@Override
	public CustomerDetails insertCustomer(CustomerDetails customer) {
		return dao.save(customer);
	}

	@Override
	public String deleteCustomer(CustomerDetails customer) {
		// TODO Auto-generated method stub
		dao.delete(customer);
		return "Deleted...";
	}

}
