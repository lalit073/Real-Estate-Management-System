package com.pms.RealEstate.model;

import javax.persistence.*;

@Entity
public class Buying {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long buying_id;

    @OneToOne
    @JoinColumn(name = "property_id")
    private Property property;

    private Double expected_rate;

	public Buying() {
		super();
	}

	public Buying(Long buying_id, Property property, Double expected_rate) {
		super();
		this.buying_id = buying_id;
		this.property = property;
		this.expected_rate = expected_rate;
	}

	public Long getBuying_id() {
		return buying_id;
	}

	public void setBuying_id(Long buying_id) {
		this.buying_id = buying_id;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Double getExpected_rate() {
		return expected_rate;
	}

	public void setExpected_rate(Double expected_rate) {
		this.expected_rate = expected_rate;
	}

	@Override
	public String toString() {
		return "Buying [buying_id=" + buying_id + ", property=" + property + ", expected_rate=" + expected_rate + "]";
	}

     
}
