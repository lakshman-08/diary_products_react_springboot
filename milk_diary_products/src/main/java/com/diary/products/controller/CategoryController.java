package com.diary.products.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diary.products.entity.Category;
import com.diary.products.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {
	
	private final CategoryService categoryService;
	
	
	public CategoryController(CategoryService categoryService) {
		
		this.categoryService = categoryService;
	}


	@GetMapping
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
		
	}

}
