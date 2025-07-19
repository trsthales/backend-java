package dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductDTO {

	@NotBlank
	private String productIdentifier;
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	@NotNull
	private Float preco;
	@NotNull
	private CategoryDTO categoryDTO;


}
