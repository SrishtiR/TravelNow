package com.travelnow.service;

import com.travelnow.model.UserModel;

public interface UserService {
	public abstract UserModel validateUserCredential(String email,String password);
	public abstract boolean registerUser(UserModel user);

}