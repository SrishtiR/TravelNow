package com.srishti.dao;

import com.srishti.model.User;

public interface UserDAO {
	public abstract boolean saveUser(User User);
	public User getUserDetailsByEmailAndPassword(String email,String password);
}

