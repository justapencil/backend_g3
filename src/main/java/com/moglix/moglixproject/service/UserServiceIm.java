package com.moglix.moglixproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moglix.moglixproject.dto.User;
import com.moglix.moglixproject.repository.UserDao;

@Service
public class UserServiceIm implements UserService {
	@Autowired
	UserDao userdao;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userdao.save(user);
	}

}
