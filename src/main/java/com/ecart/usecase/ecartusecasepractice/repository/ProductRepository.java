package com.ecart.usecase.ecartusecasepractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecart.usecase.ecartusecasepractice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
