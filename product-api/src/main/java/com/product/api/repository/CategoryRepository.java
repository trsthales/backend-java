package com.product.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.api.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
