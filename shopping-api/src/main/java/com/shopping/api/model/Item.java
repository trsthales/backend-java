package com.shopping.api.model;

import dto.ItemDTO;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Item {

	private String productIdentifier;
	private Float price;

	public static Item convert(ItemDTO itemDTO) {
		Item item = new Item();
		item.setProductIdentifier(itemDTO.getProductIdentifier());
		item.setPrice(itemDTO.getPrice());
		return item;
	}

}
