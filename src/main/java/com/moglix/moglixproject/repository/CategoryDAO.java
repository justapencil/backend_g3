package com.moglix.moglixproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moglix.moglixproject.dto.Category;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Long>{

}
