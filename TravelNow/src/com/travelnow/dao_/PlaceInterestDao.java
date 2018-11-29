package com.travelnow.dao_;

import com.travelnow.model.PlaceInterestModel;
import com.travelnow.model.UserModel;

public interface PlaceInterestDao {
	public boolean addPlaceInterested(PlaceInterestModel place);
	public PlaceInterestModel getPlaceInterested(int id);
}