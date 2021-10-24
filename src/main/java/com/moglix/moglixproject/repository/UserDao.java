package com.moglix.moglixproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moglix.moglixproject.dto.User;
@Repository
public interface UserDao extends JpaRepository<User, Long>{

}
