package com.product.api.dto;

import com.product.api.model.Category;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CategoryDTO {

	@NotNull
	private Long id;
	private String nome;

	// gets e sets
	public static CategoryDTO convert(Category category) {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(category.getId());
		categoryDTO.setNome(category.getNome());
		return categoryDTO;
	}

}
