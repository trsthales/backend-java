package com.shopping.api.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import dto.ProductDTO;
import exception.ProductNotFoundException;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	private String productApiURL = "http://localhost:8081";

	public ProductDTO getProductByIdentifier(String productIdentifier) {
		try {
			WebClient webClient = WebClient.builder().baseUrl(productApiURL).build();
			Mono<ProductDTO> product = webClient.get().uri("/product/" + productIdentifier).retrieve().bodyToMono(ProductDTO.class);
			return product.block();
		} catch (Exception e) {
			throw new ProductNotFoundException();
		}
	}
	
}
