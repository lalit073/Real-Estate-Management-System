package com.pms.RealEstate.service;

import java.util.List;


import com.pms.RealEstate.model.Accounts;

public interface AccountService {

	List<Accounts> getAllDetails();
	void addCustomer(Accounts c);

}
