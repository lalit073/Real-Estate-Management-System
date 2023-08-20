package com.pms.RealEstate.model;

import javax.persistence.*;

@Entity
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int image_id;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

    private String image_1;
    private String image_2;
    private String image_3;
    private String image_4;
    private String image_5;
    
    
	public Images() {
		super();
	}


	public Images(int image_id, Property property, String image_1, String image_2, String image_3, String image_4,
			String image_5) {
		super();
		this.image_id = image_id;
		this.property = property;
		this.image_1 = image_1;
		this.image_2 = image_2;
		this.image_3 = image_3;
		this.image_4 = image_4;
		this.image_5 = image_5;
	}


	@Override
	public String toString() {
		return "Images [image_id=" + image_id + ", property=" + property + ", image_1=" + image_1 + ", image_2="
				+ image_2 + ", image_3=" + image_3 + ", image_4=" + image_4 + ", image_5=" + image_5 + "]";
	}
	
		
}
