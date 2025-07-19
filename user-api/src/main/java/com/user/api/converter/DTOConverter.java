package com.user.api.converter;

import com.user.api.model.User;

import dto.UserDTO;

public class DTOConverter {
	public static UserDTO convert(User user){
		UserDTO userDTO = new UserDTO();
		userDTO.setNome(user.getNome());
		userDTO.setEndereco(user.getEndereco()); 
		userDTO.setCpf(user.getCpf());
		return userDTO;
	}
}
