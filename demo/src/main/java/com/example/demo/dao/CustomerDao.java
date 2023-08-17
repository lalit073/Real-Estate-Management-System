package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Customer;




@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {

	
	@Query(value="select* from customer", nativeQuery=true)
	   List<Customer> getAllDetails();
}
