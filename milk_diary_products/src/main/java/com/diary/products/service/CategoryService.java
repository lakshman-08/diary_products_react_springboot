package com.diary.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.diary.products.dao.CategoryDao;
import com.diary.products.entity.Category;

@Service
public class CategoryService {

	private final CategoryDao categoryDao;
	
	public CategoryService(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}


	public List<Category> getAllCategories() {
		
		return categoryDao.findAll();
	}

}
