package dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CategoryDTO {

	@NotNull
	private Long id;
	private String nome;


}
