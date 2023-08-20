package com.pms.RealEstate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.RealEstate.dao.AccountDao;
import com.pms.RealEstate.dao.LoginDao;
import com.pms.RealEstate.model.Accounts;
import com.pms.RealEstate.model.Login;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDao accountdao;
	
	@Autowired
	LoginDao logindao;
	
	@Override
	public List<Accounts> getAllDetails()
	{
		List<Accounts> plist= accountdao.findAll();
		System.out.println(plist);
		return plist;
	}

	@Override
	public void addCustomer(Accounts c) {
		  accountdao.save(c);
		  Login l = new Login(c.getEmail_id(),c.getPassword());
		  logindao.save(l);		
	}  
}
