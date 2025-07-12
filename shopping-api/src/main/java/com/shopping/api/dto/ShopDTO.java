package com.shopping.api.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.shopping.api.model.Shop;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ShopDTO {

	@NotBlank
	private String userIdentifier;
	//@NotNull
	private Float total;
	//@NotNull
	private LocalDateTime date;
	@NotNull
	private List<ItemDTO> items;

	public static ShopDTO convert(Shop shop) {
		ShopDTO shopDTO = new ShopDTO();
		shopDTO.setUserIdentifier(shop.getUserIdentifier());
		shopDTO.setTotal(shop.getTotal());
		shopDTO.setDate(shop.getDate());
		shopDTO.setItems(shop.getItems().stream().map(ItemDTO::convert).collect(Collectors.toList()));
		return shopDTO;
	}
}
