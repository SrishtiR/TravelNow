package com.travelnow.dao_;

import com.travelnow.model.UserModel;

public interface UserDao {
	public abstract boolean saveUser(UserModel User);
	public UserModel getUserDetailsByEmailAndPassword(String email,String password);
}
