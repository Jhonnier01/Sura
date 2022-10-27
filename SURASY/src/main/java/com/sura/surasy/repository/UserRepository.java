package com.sura.surasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sura.surasy.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
