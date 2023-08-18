package com.pms.RealEstate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.RealEstate.dao.PropertyDao;
import com.pms.RealEstate.model.Locality;
import com.pms.RealEstate.model.Property;


@Service
public class PropertyServiceImpl implements PropertyService
{

	
	@Autowired
	PropertyDao propertydao;
	
	
	@Override
	public List<Property> getProperty() {
		List<Property> plist= propertydao.findAll();
		return plist;
	}

	@Override
	public void addProperty(Property a) {
		propertydao.save(a);
		
	}



}
