package com.user.api.converter;

import com.user.api.model.User;

import dto.UserDTO;

public class DTOConverter {
	public static UserDTO convert(User user){
		UserDTO userDTO = new UserDTO();
		userDTO.setNome(user.getNome());
		userDTO.setEmail(user.getEmail());
		userDTO.setDataCadastro(user.getDataCadastro());
		userDTO.setTelefone(user.getTelefone());
		userDTO.setEndereco(user.getEndereco()); 
		userDTO.setCpf(user.getCpf());
		userDTO.setKey(user.getKey());
		return userDTO;
	}
}
