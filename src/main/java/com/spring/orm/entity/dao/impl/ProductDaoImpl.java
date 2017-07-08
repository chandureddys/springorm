package com.spring.orm.entity.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Product;
import com.spring.orm.entity.dao.ProductDao;

public class ProductDaoImpl implements ProductDao{

	HibernateTemplate hibernateTemplate= new HibernateTemplate();
	
	@Override
	public int create(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

}
