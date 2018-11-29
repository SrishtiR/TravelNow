package com.travelnow.controller;

public class UserFactory {

	   public User getUser(String userType){
	      if(userType == null){
	         return null;
	      }		
	      if(userType.equals("traveler")){
	         return new Traveler();
	         
	      } else if(userType.equals("admin")){
	         return new Admin();
	         
	      }
	      return null;
	   }
	}
