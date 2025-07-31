package com.bsn.book.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsn.book.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
/* 
    Optional<User> findByUsername(String username);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username); */

}
