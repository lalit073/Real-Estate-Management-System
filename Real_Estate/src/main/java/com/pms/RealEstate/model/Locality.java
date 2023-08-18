package com.pms.RealEstate.model;
import javax.persistence.*;

@Entity
public class Locality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locality_id;

    private String locality;

    private String landmark_street;

    private String city;

    private String state;

    private String pincode;
    
	public Locality() {
		super();
	}

	public Locality(Long locality_id, String locality, String landmark_street, String city,
			String state, String pincode) {
		super();
		this.locality_id = locality_id;
		this.locality = locality;
		this.landmark_street = landmark_street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Long getLocality_id() {
		return locality_id;
	}

	public void setLocality_id(Long locality_id) {
		this.locality_id = locality_id;
	}
	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getLandmark_street() {
		return landmark_street;
	}

	public void setLandmark_street(String landmark_street) {
		this.landmark_street = landmark_street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Locality [locality_id=" + locality_id + ", locality=" + locality
				+ ", landmark_street=" + landmark_street + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}

    
}
