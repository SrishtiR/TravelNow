package com.srishti.service_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srishti.dao.UserDAO;
import com.srishti.model.User;
import com.srishti.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO UserDAO;
	
	public void setUserDAO(UserDAO UserDAO) {
		this.UserDAO = UserDAO;
	}
	
	public UserDAO getUserDAO() {
		return UserDAO;
	}
	
	@Override
	public boolean registerUser(User User) {
		boolean isRegister=false;
		boolean saveUser = getUserDAO().saveUser(User);
		if(saveUser)
			isRegister=true;
		return isRegister;
	}

	@Override
	public User validateUserCredential(String email, String password) {
		User User = getUserDAO().getUserDetailsByEmailAndPassword(email, password);
		return User;
	}
}
