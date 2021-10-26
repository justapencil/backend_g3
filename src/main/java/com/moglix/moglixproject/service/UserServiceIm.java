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

	@Override
	public User findUser() {
		// TODO Auto-generated method stub
		return userdao.findByEmailAddress();
	}
	

	@Override
	public User searchUser(User user) {
		// TODO Auto-generated method stub
		return userdao.searchUser(user.emailId,user.password1);
	}

	@Override
	public User login(String emailid, String userpassword) {
		// TODO Auto-generated method stub
		return userdao.findByEmailIdAndPassword1(emailid, userpassword);
	}

	@Override
	public User addadminuser(User user) {
		// TODO Auto-generated method stub
		return userdao.save(user);
	}

}
