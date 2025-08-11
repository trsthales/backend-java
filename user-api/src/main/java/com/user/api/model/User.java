package com.user.api.model;

import java.time.LocalDateTime;

import dto.UserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "user")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String cpf;
	private String endereco;
	private String key;
	private String email;
	private String telefone;
	private LocalDateTime dataCadastro;

	public static User convert(UserDTO userDTO) {
		User user = new User();
		user.setNome(userDTO.getNome());
		user.setEndereco(userDTO.getEndereco());
		user.setCpf(userDTO.getCpf());
		user.setEmail(userDTO.getEmail());
		user.setKey(userDTO.getKey());
		user.setTelefone(userDTO.getTelefone());
		user.setDataCadastro(userDTO.getDataCadastro());
		return user;
	}
}
