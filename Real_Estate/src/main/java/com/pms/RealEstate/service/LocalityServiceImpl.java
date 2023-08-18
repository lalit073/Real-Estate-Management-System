package com.pms.RealEstate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pms.RealEstate.dao.LocalityDao;
import com.pms.RealEstate.model.Locality;

@Service
public class LocalityServiceImpl implements LocalityService 
{
	
	@Autowired
	LocalityDao localitydao;
	
	
	@Override
	public List<Locality> getlocality() {
		List<Locality> plist= localitydao.findAll();
		return plist;
	}

	@Override
	public void addlocality(Locality a) {
		localitydao.save(a);
		
	}


	

	
}
