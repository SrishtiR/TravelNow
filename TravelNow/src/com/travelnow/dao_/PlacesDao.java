package com.travelnow.dao_;

import com.travelnow.model.PlaceModel;

public interface PlacesDao {
	public PlaceModel getPlaceByText(String text);
}
