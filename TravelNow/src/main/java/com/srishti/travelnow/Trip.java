package com.srishti.travelnow;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author srishti
 *
 */
public class Trip {
	private int tripNumber;
	private Date startDate;
	private Date endDate;
	private List<String> placesVisited;
	private StartLocation startCity;
	private Destination endCity;
	
	public int getTripNumber() {
		return tripNumber;
	}
	public void setTripNumber(int tripNumber) {
		this.tripNumber = tripNumber;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public List<String> getPlacesVisited() {
		return placesVisited;
	}
	public void setPlacesVisited(List<String> placesVisited) {
		this.placesVisited = placesVisited;
	}
	
	public void cancelTrip() {
		
	}
	public Destination getEndCity() {
		return endCity;
	}
	public void setEndCity(Destination endCity) {
		this.endCity = endCity;
	}
	public StartLocation getStartCity() {
		return startCity;
	}
	public void setStartCity(StartLocation startCity) {
		this.startCity = startCity;
	}
}
