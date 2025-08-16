package com.product.api.model;

import dto.CategoryDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "category")
@Data
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	public static Category convert(CategoryDTO categoryDTO) {
		Category category = new Category();
		if(categoryDTO.getId()!=null) {
			category.setId(categoryDTO.getId());
		}
		category.setNome(categoryDTO.getNome());
		return category;
	}

}
