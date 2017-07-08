package com.spring.orm.entity.dao;

import com.spring.orm.entity.Product;

public interface ProductDao {
	
	int create(Product product);
	
	void update(Product product);
	void delete(Product product);

}
