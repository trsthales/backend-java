package com.user.api.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.api.converter.DTOConverter;
import com.user.api.model.User;
import com.user.api.repository.UserRepository;

import dto.UserDTO;
import exception.UserNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<UserDTO> getAll() {
		List<User> usuarios = userRepository.findAll();
		return usuarios.stream().map(DTOConverter::convert).collect(Collectors.toList());
	}

	public UserDTO findById(long userId) {
		Optional<User> usuario = userRepository.findById(userId);
		if (usuario.isPresent()) {
			return DTOConverter.convert(usuario.get());
		}
		throw new UserNotFoundException();
	}

	public UserDTO save(UserDTO userDTO) {
		userDTO.setKey(UUID.randomUUID().toString());
		userDTO.setDataCadastro(LocalDateTime.now());
		User user = userRepository.save(User.convert(userDTO));
		return DTOConverter.convert(user);
	}

	public UserDTO delete(long userId) {
		Optional<User> user = userRepository.findById(userId);
		if (user.isPresent()) {
			userRepository.delete(user.get());
		}
		return null;
	}

	public UserDTO findByCpf(String cpf, String key) {
		User user = userRepository.findByCpfAndKey(cpf, key);
		if (user != null) {
			return DTOConverter.convert(user);
		}
		throw new UserNotFoundException();
	}

	public UserDTO editUser(Long userId, UserDTO userDTO) {
		User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException());
		if (userDTO.getEmail() != null && !user.getEmail().equals(userDTO.getEmail())) {
			user.setEmail(userDTO.getEmail());
		}
		if (userDTO.getTelefone() != null && !user.getTelefone().equals(userDTO.getTelefone())) {
			user.setTelefone(userDTO.getTelefone());
		}
		if (userDTO.getEndereco() != null && !user.getEndereco().equals(userDTO.getEndereco())) {
			user.setEndereco(userDTO.getEndereco());
		}

		user = userRepository.save(user);
		return DTOConverter.convert(user);
	}

	public List<UserDTO> queryByName(String name) {
		List<User> usuarios = userRepository.queryByNomeLike(name);
		return usuarios.stream().map(DTOConverter::convert).collect(Collectors.toList());
	}
}
