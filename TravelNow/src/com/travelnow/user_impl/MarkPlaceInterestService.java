package com.travelnow.user_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelnow.dao_.PlaceInterestDao;
import com.travelnow.model.PlaceInterestModel;
import com.travelnow.service.PlaceInterestService;

@Service("PlaceInterestService")
public abstract class MarkPlaceInterestService implements PlaceInterestService {
	@Autowired
	private PlaceInterestDao placeInterestDao;

	public PlaceInterestDao getPlaceInterestDao() {
		return placeInterestDao;
	}

	public void setPlaceInterestDao(PlaceInterestDao placeInterestDao) {
		this.placeInterestDao = placeInterestDao;
	}

	@Override
	public boolean markPlaceInterested(PlaceInterestModel placeModel) {
		// TODO Auto-generated method stub
		boolean isAdded=false;
		boolean savePlace = getPlaceInterestDao().addPlaceInterested(placeModel);
		if(savePlace)
			isAdded=true;
		return isAdded;
	}

}
