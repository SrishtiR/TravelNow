package com.srishti.service;

import com.srishti.model.User;

public interface UserService {
	public abstract User validateUserCredential(String email,	String password);
	public abstract boolean registerUser(User user);

}