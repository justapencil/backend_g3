package com.moglix.moglixproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.moglixproject.dto.Role;
import com.moglix.moglixproject.service.RoleService;

@RestController
@RequestMapping("/api")
public class RoleController {
	
	@Autowired
	RoleService roleservice;
	
	@PostMapping("/role/add")
	public Role addrole(@RequestBody Role role)
	{
			return roleservice.addRole(role);
	}

}
