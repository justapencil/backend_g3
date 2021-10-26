package com.moglix.moglixproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.moglixproject.dto.User;
import com.moglix.moglixproject.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userservice;
	
	 @GetMapping("/index2")
	   public String sayhello()
	   {
		   return "Main heaing";
	   }
	
	@PostMapping("/user/add")
	public User addUser(@RequestBody User user)
	{
		return userservice.addUser(user);
	}
	
	@PostMapping("/admin/user/add")
	public User addadminuser(@RequestBody User user)
	{
	return userservice.addadminuser(user);	
	}
	
	
	@GetMapping("/user/login")
	public User login(@RequestParam("emailid") String emailid,@RequestParam ("userpassword")String userpassword) {
		return this.userservice.login(emailid,userpassword);
		}

}
