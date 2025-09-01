package com.diary.products.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.diary.products.dao.CategoryDao;
import com.diary.products.dao.ProductDao;
import com.diary.products.entity.Category;
import com.diary.products.entity.Product;

@Component
public class DataSeeder implements CommandLineRunner{
	
	private final ProductDao productDao;
	private final CategoryDao categoryDao;
	
	
	public DataSeeder(ProductDao productDao, CategoryDao categoryDao) {
		this.productDao = productDao;
		this.categoryDao = categoryDao;
	}



	@Override
	public void run(String... args) throws Exception {
		
		//Clear all existing data
		productDao.deleteAll();
		categoryDao.deleteAll();
		
		//Create Categories
		Category milk=new Category();
		milk.setName("Milk");
		
		Category yogurt=new Category();
		yogurt.setName("yogurt");
		
		Category cheese=new Category();
		cheese.setName("cheese");
		
		Category lactoseFreeMilk=new Category();
		lactoseFreeMilk.setName("lactose-free milk");
		
		
		categoryDao.saveAll(Arrays.asList(milk,cheese,lactoseFreeMilk,yogurt));
		
		
		
		
		//Create Products
		Product amul=new Product();
		amul.setName("Amul");
		amul.setDescription(" One of India's largest and most recognized dairy brands, Amul offers a wide range of products, including");
		amul.setImageUrl("https://placehold.co/600x400");
		amul.setPrice(30.5);
		amul.setCategory(milk);
		
		
		Product chobani=new Product();
		chobani.setName("chobani");
		chobani.setDescription("Chobani is an American food company known for its high-protein, thick Greek-style yogurt");
		chobani.setImageUrl("https://placehold.co/600x400");
		chobani.setPrice(40.5);
		chobani.setCategory(yogurt);
		
		
		Product motherDairy=new Product();
		motherDairy.setName("Mother Dairy ");
		motherDairy.setDescription("Mother Dairy produces a range of cheeses made from fresh cow's milk");
		motherDairy.setImageUrl("https://placehold.co/600x400");
		motherDairy.setPrice(50.5);
		motherDairy.setCategory(cheese);
		
		
		Product nestle=new Product();
		nestle.setName("Nestle");
		nestle.setDescription("Nestlé Nan Lo-Lac Baby Milk Powder Bag-In-Box Pack For Nutritional Management Of Diarrhea");
		nestle.setImageUrl("https://placehold.co/600x400");
		nestle.setPrice(40.5);
		nestle.setCategory(lactoseFreeMilk);
		
	     productDao.saveAll(Arrays.asList(amul,chobani,motherDairy,nestle));
		
	}

}
