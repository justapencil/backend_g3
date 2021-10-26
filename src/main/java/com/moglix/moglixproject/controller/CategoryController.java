package com.moglix.moglixproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.moglixproject.dto.Category;
import com.moglix.moglixproject.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("category/get")
	public List<Category> getcategory()
	{
		return  categoryService.getCategory();
	}
	@PostMapping("category/add")
	public Category addCategory(Category category)
	{
		return categoryService.addCategory(category);
	}
}
