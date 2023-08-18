package com.pms.RealEstate.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pms.RealEstate.model.Locality;
import com.pms.RealEstate.model.Property;
import com.pms.RealEstate.service.LocalityService;
import com.pms.RealEstate.service.PropertyService;

@RestController
public class PropertyController {
	
	@Autowired
	PropertyService propertyservice;
	
	@Autowired
	LocalityService localityservice;
	
	
	@GetMapping("/propertydetails")
	public List<Property> displayAllPropertydetails() {
		List<Property> list=propertyservice.getProperty();
		System.out.println(list);
		return list;
		
	}
	
	@PostMapping("/addproperty/{pid}")
	public ResponseEntity<String> insertPropertyDetails(@RequestBody Property a) {
		  propertyservice.addProperty(a);
		  return ResponseEntity.ok("added successfully");
	
	}
		  
    @GetMapping("/localitydetails")
			public List<Locality> displaylocality() {
				List<Locality> local=localityservice.getlocality();
				System.out.println(local);
				return local;
				
			}
			
	@PostMapping("/addlocality/{pid}")
			public ResponseEntity<String> insertLocalityDetails(@RequestBody Locality l) {
				  localityservice.addlocality(l);
				  return ResponseEntity.ok("added successfully");
    }
}
