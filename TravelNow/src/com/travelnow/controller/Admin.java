package com.travelnow.controller;
/**
 * 
 * @author srishti
 * class for admin and functionalities
 */
public class Admin extends User{
	private int adminID;

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	
	public void removeTraveler(int travelerID) {
	}
}
