package com.spring.orm.entity.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entity.Product;
import com.spring.orm.entity.dao.ProductDao;


@Component("productDao")
public class ProductDaoImpl implements ProductDao{
   @Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		// TODO Auto-generated method stub
		Integer result = (Integer) hibernateTemplate.save(product);
		
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		// TODO Auto-generated method stub
		 hibernateTemplate.update(product);
		System.out.println("updated successfully");
	}

	@Override
	@Transactional
	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
		System.out.println("deleted successfully");
	}

}
