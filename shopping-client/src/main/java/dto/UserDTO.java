package dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserDTO {
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private LocalDateTime dataCadastro;
	private String key;


}
