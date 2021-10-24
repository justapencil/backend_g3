package com.moglix.moglixproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moglix.moglixproject.dto.Order;
@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {

}
