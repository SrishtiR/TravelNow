package com.srishti.travelnow;

import java.util.List;

public class PlaceInterest {
	private List<String> placeOfInterest;

	public List<String> getPlaceOfInterest() {
		return placeOfInterest;
	}

	public void setPlaceOfInterest(List<String> placeOfInterest) {
		this.placeOfInterest = placeOfInterest;
		//to do 
	}
	
	public void addPlace(String place) {
		placeOfInterest.add(place);
	}
}
