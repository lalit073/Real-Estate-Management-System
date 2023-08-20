package com.pms.RealEstate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pms.RealEstate.model.Property;


@Repository
public interface PropertyDao extends JpaRepository<Property,Integer>
{

	
	@Query(value="select * from property", nativeQuery=true)
	   List<Property> getAllDetails();

	 
}
