package com.pms.RealEstate.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pms.RealEstate.model.Accounts;
import com.pms.RealEstate.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountservice;
	
	@GetMapping("/Accountsdetails")
	public List<Accounts> displayAllCustomerdetails() {
		List<Accounts> plist=accountservice.getAllDetails();
		return plist;
	}
	
	@PostMapping("/CustomerRegistration/{pid}")
	public ResponseEntity<String> insertCustomerDetails( @RequestBody Accounts a) {
		  accountservice.addCustomer(a);
		  return ResponseEntity.ok("added successfully");
	}
	
}
