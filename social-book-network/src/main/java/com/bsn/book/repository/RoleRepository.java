package com.bsn.book.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsn.book.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(String name);

/*     List<Role> findAllByNameIn(List<String> names);
 */    
}
