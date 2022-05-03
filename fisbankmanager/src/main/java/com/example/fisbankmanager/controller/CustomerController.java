package com.example.fisbankmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fisbankmanager.model.CustomerDetails;
import com.example.fisbankmanager.service.CustomerDetailsService;

@RequestMapping("/customers/v1")
@RestController
public class CustomerController {
	
	@Autowired
	CustomerDetailsService service;
	
	
	@GetMapping("/all")
	public List<CustomerDetails> findAll(){
		return service.getAllCustomers();
	}
	
	@PostMapping("/add")
	public ResponseEntity<CustomerDetails> addCustomer(@RequestBody CustomerDetails customer){
		return new ResponseEntity<CustomerDetails>(service.insertCustomer(customer), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> removeCustomer(@RequestBody CustomerDetails customer){
		return new ResponseEntity<String>(service.deleteCustomer(customer), HttpStatus.OK);
	}
}
