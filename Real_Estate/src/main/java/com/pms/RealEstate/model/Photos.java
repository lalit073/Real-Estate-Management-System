package com.pms.RealEstate.model;

import javax.persistence.*;

@Entity
public class Photos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long photo_id;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

    private String add_photos;

    
    
	public Photos() {
		super();
	}
	
	public Photos(Long photo_id, Property property, String add_photos) {
		super();
		this.photo_id = photo_id;
		this.property = property;
		this.add_photos = add_photos;
	}
	
	

	public Long getPhoto_id() {
		return photo_id;
	}

	public void setPhoto_id(Long photo_id) {
		this.photo_id = photo_id;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public String getAdd_photos() {
		return add_photos;
	}

	public void setAdd_photos(String add_photos) {
		this.add_photos = add_photos;
	}

	@Override
	public String toString() {
		return "Photos [photo_id=" + photo_id + ", property=" + property + ", add_photos=" + add_photos + "]";
	}

    
    
}
