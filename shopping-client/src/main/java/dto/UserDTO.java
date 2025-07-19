package dto;

import java.util.Date;

import lombok.Data;

@Data
public class UserDTO {
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private Date dataCadastro;


}
