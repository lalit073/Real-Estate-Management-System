package com.pms.RealEstate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.pms.RealEstate.model.Accounts;

@Repository
public interface AccountDao extends JpaRepository<Accounts,String> {

	
	@Query(value="select * from accounts", nativeQuery=true)
	   List<Accounts> getAllDetails();
}
