package com.product.api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.api.converter.DTOConverter;
import com.product.api.model.Category;
import com.product.api.repository.CategoryRepository;

import dto.CategoryDTO;
import exception.CategoryNotFoundException;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	public List<CategoryDTO> getAll() {
		List<Category> categorys = categoryRepository.findAll();
		return categorys.stream().map(DTOConverter::convert).collect(Collectors.toList());
	}

	public CategoryDTO save(CategoryDTO categoryDTO) {
		Category category = categoryRepository.save(Category.convert(categoryDTO));
		return DTOConverter.convert(category);
	}

	public void delete(Long categoryId) {
		Optional<Category> category = categoryRepository.findById(categoryId);
		if (category.isPresent()) {
			categoryRepository.delete(category.get());
		}else {
			throw new CategoryNotFoundException();
		}
		
	}
}
