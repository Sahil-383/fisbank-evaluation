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

import com.example.fisbankmanager.model.BranchDetails;
import com.example.fisbankmanager.service.BranchDetailsService;

@RequestMapping("/branch/v1")
@RestController
public class BranchController {
	@Autowired
	BranchDetailsService service;
	
	
	@GetMapping("/all")
	public List<BranchDetails> findAll(){
		return service.getAllBranches();
	}
	
	@PostMapping("/add")
	public ResponseEntity<BranchDetails> addBranch(@RequestBody BranchDetails branch){
		return new ResponseEntity<BranchDetails>(service.insertBranch(branch), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> removeBranch(@RequestBody BranchDetails branch){
		return new ResponseEntity<String>(service.deleteBranch(branch), HttpStatus.OK);
	}

}
