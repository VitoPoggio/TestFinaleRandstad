package com.randstad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.randstad.model.Ordine;

/**
 * Repository di Ordine con principali operazioni CRUD (gestite da JpaRepository) e altre query personalizzate
 */
public interface OrdineRepository extends JpaRepository<Ordine, Long>{

	@Query(value = "select * from ordine where id_cliente = ?1", nativeQuery = true)
	List<Ordine> findByUtente(Long id);
}
