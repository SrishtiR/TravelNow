package com.travelnow.user_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelnow.dao_.UserDao;
import com.travelnow.model.UserModel;
import com.travelnow.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao UserDAO;
	
	public void setUserDAO(UserDao UserDAO) {
		this.UserDAO = UserDAO;
	}
	
	public UserDao getUserDAO() {
		return UserDAO;
	}
	
	@Override
	public boolean registerUser(UserModel User) {
		boolean isRegister=false;
		boolean saveUser = getUserDAO().saveUser(User);
		if(saveUser)
			isRegister=true;
		return isRegister;
	}

	@Override
	public UserModel validateUserCredential(String email, String password) {
		UserModel User = getUserDAO().getUserDetailsByEmailAndPassword(email, password);
		return User;
	}
}
