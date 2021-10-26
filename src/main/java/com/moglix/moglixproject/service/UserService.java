package com.moglix.moglixproject.service;

import com.moglix.moglixproject.dto.User;

public interface UserService {
	
	public User addUser(User user);
	public User findUser();
	public User searchUser(User user);
	public User login(String emailid, String userpassword);
	public User addadminuser(User user);
}
