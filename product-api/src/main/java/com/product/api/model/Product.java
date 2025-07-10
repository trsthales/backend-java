package com.product.api.model;

import com.product.api.dto.ProductDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity(name = "product")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private Float preco;
	private String descricao;
	private String productIdentifier;
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	public static Product convert(ProductDTO productDTO) {
		Product product = new Product();
		product.setNome(productDTO.getNome());
		product.setPreco(productDTO.getPreco());
		product.setDescricao(productDTO.getDescricao());
		product.setProductIdentifier(productDTO.getProductIdentifier());
		if (productDTO.getCategoryDTO() != null) {
			product.setCategory(Category.convert(productDTO.getCategoryDTO()));
		}
		return product;
	}
}
