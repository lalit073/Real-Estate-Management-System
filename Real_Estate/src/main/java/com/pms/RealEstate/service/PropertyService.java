package com.pms.RealEstate.service;

import java.util.List;

import com.pms.RealEstate.model.Locality;
import com.pms.RealEstate.model.Property;

public interface PropertyService {

	List<Property> getProperty();

	void addProperty(Property a);
	
}
