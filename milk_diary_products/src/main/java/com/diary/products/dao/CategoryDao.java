package com.diary.products.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diary.products.entity.Category;

public interface CategoryDao extends JpaRepository<Category,Long>{
	

}
