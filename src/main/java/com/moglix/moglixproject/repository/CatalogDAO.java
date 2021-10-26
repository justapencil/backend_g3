package com.moglix.moglixproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moglix.moglixproject.dto.Catalog;
@Repository
public interface CatalogDAO extends JpaRepository<Catalog, Long>{

	
}
