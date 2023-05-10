package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//Create Product 
	@Transactional
	public void createProduct(Product product) {
		
		this.hibernateTemplate.save(product);
	}
	
	public List<Product> getProducts(){
		 List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		 return products;
	}
	
	@Transactional
	public void deleteProduct(int pid) {
		Product product= this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(product);
	}
	
	public Product getSingleProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}
	
	
}
