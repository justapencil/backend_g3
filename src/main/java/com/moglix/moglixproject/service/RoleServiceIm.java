package com.moglix.moglixproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moglix.moglixproject.dto.Role;
import com.moglix.moglixproject.repository.RoleDAO;
@Service
public class RoleServiceIm implements RoleService {

	@Autowired
	RoleDAO roleDao;
	
	@Override
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		return roleDao.save(role);
	}

	
	public List<Role> listAll() {
		// TODO Auto-generated method stub
		return roleDao.findAll();
	}

}
