package com.travelnow.controller;

import java.util.List;

/**
 * 
 * @author srishti
 *
 */
public class Traveler extends User {
	private int travelerID;
	private boolean availableToGroup;
	private TravelHistory history;
	//private PlaceInterest placeInterested;
	public int getTravelerID() {
		return travelerID;
	}
	public void setTravelerID(int travelerID) {
		this.travelerID = travelerID;
	}
	public boolean isAvailableToGroup() {
		return availableToGroup;
	}
	public void setAvailableToGroup(boolean availableToGroup) {
		this.availableToGroup = availableToGroup;
	}
	public TravelHistory getHistory() {
		return history;
	}
	public void setHistory(TravelHistory history) {
		this.history = history;
	}
//	public PlaceInterest getPlaceInterested() {
//		return placeInterested;
//	}
//	public void setPlaceInterested(PlaceInterest placeInterested) {
//		this.placeInterested = placeInterested;
//	}
	public void updateProfile() {
	}
	public List<String> findPeople(){
		return null;	
	}
	public boolean sendGroupUpRequest() {
		return false;
	}
	public void markAvailable() {
		if(isAvailableToGroup() == false) {
			setAvailableToGroup(true);			
		}
	}
	
}
