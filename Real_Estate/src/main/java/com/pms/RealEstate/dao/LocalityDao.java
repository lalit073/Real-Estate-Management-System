package com.pms.RealEstate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pms.RealEstate.model.Locality;
import com.pms.RealEstate.model.Property;

@Repository
public interface LocalityDao extends JpaRepository<Locality,Integer>
{

	
	@Query(value="select * from locality", nativeQuery=true)
	   List<Property> getlocality();
}

