package com.diary.products.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diary.products.entity.Product;

public interface ProductDao extends JpaRepository<Product,Long>{
	
	public List<Product> findByCategoryId(Long categoryId);

}
