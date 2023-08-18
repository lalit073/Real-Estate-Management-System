package com.pms.RealEstate.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.RealEstate.dao.AccountDao;
import com.pms.RealEstate.model.Accounts;

@Service
public class AccountServiceImpl implements AccountService {

	
	@Autowired
	AccountDao accountdao;
	
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
	}
}
