package com.user.api.dto;

import java.util.Date;

import com.user.api.model.User;

import lombok.Data;

@Data
public class UserDTO {
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private Date dataCadastro;

	public static UserDTO convert(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setNome(user.getNome());
		userDTO.setEndereco(user.getEndereco());
		userDTO.setCpf(user.getCpf());
		userDTO.setEmail(user.getEmail());
		userDTO.setTelefone(user.getTelefone());
		userDTO.setDataCadastro(user.getDataCadastro());
		return userDTO;
	}
}
