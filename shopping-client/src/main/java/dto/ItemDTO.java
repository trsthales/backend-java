package dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ItemDTO {

	@NotBlank
	private String productIdentifier;
	@NotNull
	private Float price;

}
