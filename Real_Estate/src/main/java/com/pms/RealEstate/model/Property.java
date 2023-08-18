package com.pms.RealEstate.model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long property_id;

    @Column(length = 200)
    private String property_name;

    @Column(length = 20)
    private String property_type;

    @Column(length = 20)
    private String bhk_type;

    @Column(precision = 10, scale = 2)
    private Double buildup_area;

    private Integer property_age;

    private String furnishing_type;

    private Integer floor;

    private String facing;

    private String parking;

    private String listing_date;

    @Column(length  = 500)
    private String description;

    @OneToOne
    @JoinColumn(name ="locality_id")
    private Locality locality;


	public Property() {
		super();
	}

	public Property(Long property_id, String property_name, String property_type, String bhk_type, Double buildup_area,
			Integer property_age, String furnishing_type, Integer floor, String facing, String parking,
			String listing_date, String description) {
		super();
		this.property_id = property_id;
		this.property_name = property_name;
		this.property_type = property_type;
		this.bhk_type = bhk_type;
		this.buildup_area = buildup_area;
		this.property_age = property_age;
		this.furnishing_type = furnishing_type;
		this.floor = floor;
		this.facing = facing;
		this.parking = parking;
		this.listing_date = listing_date;
		this.description = description;
		this.locality = locality;
	}

	public Long getProperty_id() {
		return property_id;
	}

	public void setProperty_id(Long property_id) {
		this.property_id = property_id;
	}

	public String getProperty_name() {
		return property_name;
	}

	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}

	public String getProperty_type() {
		return property_type;
	}

	public void setProperty_type(String property_type) {
		this.property_type = property_type;
	}

	public String getBhk_type() {
		return bhk_type;
	}

	public void setBhk_type(String bhk_type) {
		this.bhk_type = bhk_type;
	}

	public Double getBuildup_area() {
		return buildup_area;
	}

	public void setBuildup_area(Double buildup_area) {
		this.buildup_area = buildup_area;
	}

	public Integer getProperty_age() {
		return property_age;
	}

	public void setProperty_age(Integer property_age) {
		this.property_age = property_age;
	}

	public String getFurnishing_type() {
		return furnishing_type;
	}

	public void setFurnishing_type(String furnishing_type) {
		this.furnishing_type = furnishing_type;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public String getFacing() {
		return facing;
	}

	public void setFacing(String facing) {
		this.facing = facing;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getListing_date() {
		return listing_date;
	}

	public void setListing_date(String listing_date) {
		this.listing_date = listing_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Locality getLocality() {
		return locality;
	}

	public void setLocality(Locality locality) {
		this.locality = locality;
	}



	@Override
	public String toString() {
		return "Property [property_id=" + property_id + ", property_name=" + property_name + ", property_type="
				+ property_type + ", bhk_type=" + bhk_type + ", buildup_area=" + buildup_area + ", property_age="
				+ property_age + ", furnishing_type=" + furnishing_type + ", floor=" + floor + ", facing=" + facing
				+ ", parking=" + parking + ", listing_date=" + listing_date + ", description=" + description
				+ ", locality=" + locality +"]";
	}
   
}
