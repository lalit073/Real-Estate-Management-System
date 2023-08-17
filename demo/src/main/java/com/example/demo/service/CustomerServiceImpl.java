package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Customer;
import com.example.demo.dao.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	CustomerDao customerdao;
	
	@Override
	public List<Customer> getAllDetails()
	{
		List<Customer> plist= customerdao.findAll();
		System.out.println(plist);
		return plist;
	}
}
