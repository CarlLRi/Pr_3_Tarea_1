package com.project.demo.logic.entity.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    List<Product> findByNameContainingIgnoreCase(String name);

    Optional<Product> findByName(String name);

    List<Product> findByCategoryId(Long categoryId);

}