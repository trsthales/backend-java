package com.product.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.services.CategoryService;

import dto.CategoryDTO;
import jakarta.validation.Valid;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/category")
	public List<CategoryDTO> getCategories() {
		List<CategoryDTO> categories = categoryService.getAll();
		return categories;
	}
	
	@PostMapping("/category")
	CategoryDTO newCategory(@Valid @RequestBody CategoryDTO categoryDTO) {
		return categoryService.save(categoryDTO);
	}
	
	@DeleteMapping("/category/{id}")
	void delete(@PathVariable Long id) {
		categoryService.delete(id);
	}
	
}
