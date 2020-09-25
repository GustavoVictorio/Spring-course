package com.gustavo.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
