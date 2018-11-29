package com.travelnow.service;

import com.travelnow.model.PlaceInterestModel;

public interface PlaceInterestService {
	public abstract boolean markPlaceInterested(PlaceInterestModel placeModel);
	public abstract PlaceInterestModel getPlaceInterested(int personid);

}
