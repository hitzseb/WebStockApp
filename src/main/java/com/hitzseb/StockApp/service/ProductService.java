package com.hitzseb.StockApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hitzseb.StockApp.model.Product;
import com.hitzseb.StockApp.repo.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> listAll() {
		return productRepo.findAll();
	}
	
	public void save(Product product) {
		productRepo.save(product);
	}
	
	public Product get(long id) {
		return productRepo.findById(id).get();
	}
	
	public void delete(long id) {
		productRepo.deleteById(id);
	}

}