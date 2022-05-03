package com.example.fisbankcustomer.controller;

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

import com.example.fisbankcustomer.model.CustBankDetails;
import com.example.fisbankcustomer.service.CustBankService;

@RestController
@RequestMapping("/bankaccount")
public class CustDetailsController {
	@Autowired
	CustBankService service;
	
	
	@GetMapping("/all")
	public List<CustBankDetails> findAll(){
		return service.getBankDetails();
	}
	
	@PostMapping("/add")
	public ResponseEntity<CustBankDetails> addAccount(@RequestBody CustBankDetails customer){
		return new ResponseEntity<CustBankDetails>(service.createNewAccount(customer), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> removeAccount(@RequestBody CustBankDetails customer){
		return new ResponseEntity<String>(service.deleteAccount(customer), HttpStatus.OK);
	}

}
