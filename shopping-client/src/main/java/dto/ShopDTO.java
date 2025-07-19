package dto;

import java.time.LocalDateTime;
import java.util.List;

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

}
