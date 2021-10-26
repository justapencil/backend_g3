package com.moglix.moglixproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moglix.moglixproject.dto.Category;
import com.moglix.moglixproject.repository.CategoryDAO;

@Service
public class CategoryServiceIm implements CategoryService {

	@Autowired
	CategoryDAO categoryDao;
	
	@Override
	public List<Category> getCategory() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.save(category);
	}
	

}
