package com.bsn.book.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsn.book.entity.Token;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    Optional<Token> findByToken(String token);

}
