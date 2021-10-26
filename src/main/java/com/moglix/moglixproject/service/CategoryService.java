package com.moglix.moglixproject.service;

import java.util.List;

import com.moglix.moglixproject.dto.Category;

public interface CategoryService {
	
	public List<Category> getCategory();
	public Category addCategory(Category category);

}
