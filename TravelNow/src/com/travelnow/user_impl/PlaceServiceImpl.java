package com.travelnow.user_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.travelnow.model.PlaceModel;
import com.travelnow.service.PlaceService;
import com.travelnow.dao_.PlacesDao;

@Service("PlaceService")
public class PlaceServiceImpl implements PlaceService{
	@Autowired
	private PlacesDao PlaceDAO;

	public PlacesDao getPlaceDAO() {
		return PlaceDAO;
	}

	public void setPlaceDAO(PlacesDao placeDAO) {
		this.PlaceDAO = placeDAO;
	}
	
	@Override
	public PlaceModel displayPlace(String Place) {
		PlaceModel output = getPlaceDAO().getPlaceByText(Place);
		
		return output;
	}
	
}
