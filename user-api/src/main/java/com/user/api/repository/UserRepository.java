package com.user.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.api.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByCpfAndKey(String cpf, String key);
	List<User> queryByNomeLike(String name);
	
}
