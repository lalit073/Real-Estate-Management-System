package com.pms.RealEstate.model;

import javax.persistence.*;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rental_id;

    @OneToOne
    @JoinColumn(name = "property_id")
    private Property property;

    private Double expected_rent;

    private Double expected_deposit;

    private String preferred_tenants;


	public Rental() {
		super();
	}



	public Rental(Long rental_id, Property property, Double expected_rent, Double expected_deposit,
			String preferred_tenants) {
		super();
		this.rental_id = rental_id;
		this.property = property;
		this.expected_rent = expected_rent;
		this.expected_deposit = expected_deposit;
		this.preferred_tenants = preferred_tenants;
	}



	public Long getRental_id() {
		return rental_id;
	}



	public void setRental_id(Long rental_id) {
		this.rental_id = rental_id;
	}



	public Property getProperty() {
		return property;
	}



	public void setProperty(Property property) {
		this.property = property;
	}



	public Double getExpected_rent() {
		return expected_rent;
	}



	public void setExpected_rent(Double expected_rent) {
		this.expected_rent = expected_rent;
	}



	public Double getExpected_deposit() {
		return expected_deposit;
	}



	public void setExpected_deposit(Double expected_deposit) {
		this.expected_deposit = expected_deposit;
	}



	public String getPreferred_tenants() {
		return preferred_tenants;
	}



	public void setPreferred_tenants(String preferred_tenants) {
		this.preferred_tenants = preferred_tenants;
	}



	@Override
	public String toString() {
		return "Rental [rental_id=" + rental_id + ", property=" + property + ", expected_rent=" + expected_rent
				+ ", expected_deposit=" + expected_deposit + ", preferred_tenants=" + preferred_tenants + "]";
	}

   
}
