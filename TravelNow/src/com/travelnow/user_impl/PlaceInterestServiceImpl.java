//package com.travelnow.user_impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.travelnow.dao_.PlaceInterestDao;
//import com.travelnow.model.PlaceInterestModel;
//import com.travelnow.model.UserModel;
//import com.travelnow.service.PlaceInterestService;
//
//@Service("PlaceInterestService")
//public abstract class PlaceInterestServiceImpl implements PlaceInterestService{
//	@Autowired
//	private PlaceInterestDao placeInterestDao;
//
//	public PlaceInterestDao getPlaceInterestDao() {
//		return placeInterestDao;
//	}
//
//	public void setPlaceInterestDao(PlaceInterestDao placeInterestDao) {
//		this.placeInterestDao = placeInterestDao;
//	}
//	
//	
//	@Override
//	public PlaceInterestModel getPlaceInterested(int personid) {
//		PlaceInterestModel placeIM = getPlaceInterestDao().getPlaceInterested(personid);
//		return placeIM;
//	}
//
//}
