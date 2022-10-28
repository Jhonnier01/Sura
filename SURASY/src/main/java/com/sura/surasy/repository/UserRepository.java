package com.sura.surasy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sura.surasy.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query (value="SELECT id_user, nombre, telefono, citar FROM user WHERE citar = true",nativeQuery = true)
	List<User> findByCitar();

}
