package com.moglix.moglixproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moglix.moglixproject.dto.Cart;
@Repository
public interface CartDAO extends JpaRepository<Cart, Long> {

}
