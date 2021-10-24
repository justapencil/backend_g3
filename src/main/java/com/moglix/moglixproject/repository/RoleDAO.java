package com.moglix.moglixproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moglix.moglixproject.dto.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {
	

}
