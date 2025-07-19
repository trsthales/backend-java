package com.product.api.converter;

import com.product.api.model.Category;
import com.product.api.model.Product;

import dto.CategoryDTO;
import dto.ProductDTO;

public class DTOConverter {
	public static CategoryDTO convert(Category category) {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(category.getId());
		categoryDTO.setNome(category.getNome());
		return categoryDTO;
	}	
		
	public static ProductDTO convert(Product product) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setNome(product.getNome());
		productDTO.setPreco(product.getPreco());
		productDTO.setProductIdentifier(product.getProductIdentifier());
		if (product.getCategory() != null) {
			productDTO.setCategoryDTO(DTOConverter.convert(product.getCategory()));
		}
		return productDTO;
	}
}
