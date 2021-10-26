package com.moglix.moglixproject.service;

import java.util.List;

import com.moglix.moglixproject.dto.Role;

public interface RoleService {
	
	public Role addRole(Role role);
	public List<Role> listAll();

}
