package com.randstad.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.randstad.model.Cliente;

/**
 * Repository di Cliente con principali operazioni CRUD (gestite da JpaRepository) e altre query personalizzate
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query(value = "select * from cliente where email = ?1", nativeQuery = true)
	Optional<Cliente> getByEmail(String email);
}
