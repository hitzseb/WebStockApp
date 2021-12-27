package com.hitzseb.StockApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitzseb.StockApp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
