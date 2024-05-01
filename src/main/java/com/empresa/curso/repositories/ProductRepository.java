package com.empresa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
