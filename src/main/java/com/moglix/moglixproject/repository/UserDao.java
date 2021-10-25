package com.moglix.moglixproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.moglix.moglixproject.dto.User;
@Repository
public interface UserDao extends JpaRepository<User, Long>{

	 @Query(value = "SELECT * FROM usertbl where user_name = 'Piyush' and pass ='123'", nativeQuery = true)
	  User findByEmailAddress();
	 
	 
	 @Query(value = "Select FROM usertbl where email_id = :email and pass = :pass", nativeQuery = true)
	  User searchUser(@Param("email") String emailid,@Param("pass") String pass);

	 public User findByEmailIdAndPassword1(String emailid,String password);
}
