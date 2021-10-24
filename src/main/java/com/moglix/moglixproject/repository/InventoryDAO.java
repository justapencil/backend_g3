package com.moglix.moglixproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moglix.moglixproject.dto.Inventory;

@Repository
public interface InventoryDAO extends JpaRepository<Inventory, Long>{

}
