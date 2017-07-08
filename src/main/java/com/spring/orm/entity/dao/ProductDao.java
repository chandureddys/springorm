package com.spring.orm.entity.dao;

import java.util.List;

import com.spring.orm.entity.Product;

public interface ProductDao {
	
	int create(Product product);
	
	void update(Product product);
	void delete(Product product);
	List<Product> find();

}
