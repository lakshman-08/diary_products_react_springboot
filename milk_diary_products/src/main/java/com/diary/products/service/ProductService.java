package com.diary.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.diary.products.dao.ProductDao;
import com.diary.products.entity.Product;

@Service
public class ProductService {

	private final ProductDao productDao;

	public ProductService(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public List<Product> getAllProducts(){
		return productDao.findAll();
	}
	
	public List<Product> getProductByCategory(Long id){
		return productDao.findByCategoryId(id);
	}
	
	
}
