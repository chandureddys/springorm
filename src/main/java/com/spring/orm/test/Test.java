package com.spring.orm.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.orm.entity.Product;
import com.spring.orm.entity.dao.ProductDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/orm/test/config.xml");
		
		ProductDao productDao =(ProductDao) context.getBean("productDao");
		
//		Product product = new Product();
//		
//		product.setId(5);
//		product.setName("dove");
//		product.setDescription("soap");
//		product.setPrice(123.40);
//		
//		productDao.create(product);
		//productDao.update(product);
		
		//productDao.delete(product);
	List<Product> product=	productDao.find();
	
	for(Product p:product){
		System.out.println(p);
	}
}  
		
	}


