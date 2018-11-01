package com.srishti.travelnow;

public class User {
	protected int userId;
	protected String userName;
	protected String email;
	protected String password;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void login(String username, String password) {
		//to do
	}
	public void logout() {
		//to do
	}
	public void register() {
		//to do
	}
	
}
