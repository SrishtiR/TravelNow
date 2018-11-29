package com.travelnow.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="placeinterest")
public class PlaceInterestModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "placeinterestid")
	private int placeinterestid;

	@NotEmpty
	@Column(name = "personid")
	private String personid;
	
	@NotEmpty
	@Column(name = "place")
	private String place;
	

	public int getPlaceinterestid() {
		return placeinterestid;
	}

	public void setPlaceinterestid(int placeinterestid) {
		this.placeinterestid = placeinterestid;
	}

	public String getPersonid() {
		return personid;
	}

	public void setPersonid(String personid) {
		this.personid = personid;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
}
