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

import com.example.fisbankmanager.model.AccountDetails;
import com.example.fisbankmanager.service.AccountDetailsService;

@RequestMapping("/account/v1")
@RestController
public class AccountController {
	@Autowired
	AccountDetailsService service;
	
	
	@GetMapping("/all")
	public List<AccountDetails> findAll(){
		return service.getAllAccounts();
	}
	
	@PostMapping("/add")
	public ResponseEntity<AccountDetails> addAccount(@RequestBody AccountDetails account){
		return new ResponseEntity<AccountDetails>(service.insertAccount(account), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> removeAccount(@RequestBody AccountDetails account){
		return new ResponseEntity<String>(service.deleteAccount(account), HttpStatus.OK);
	}

}
