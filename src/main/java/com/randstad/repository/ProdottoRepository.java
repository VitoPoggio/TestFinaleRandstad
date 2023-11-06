package com.randstad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.randstad.model.Prodotto;

import jakarta.transaction.Transactional;

/**
 * Repository di Prodotto con principali operazioni CRUD (gestite da JpaRepository) e altre query personalizzate
 */
public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
	
	@Query(value = "select * from prodotto where quantita > 0", nativeQuery = true)
	public List<Prodotto> getProdottiDisponibili();
	
	@Modifying
	@Transactional
	@Query(value = "update prodotto set quantita = ?2 where id_prodotto = ?1", nativeQuery = true)
	void modificaQta(Long id, int qta);
	
	@Query(value = "select quantita from prodotto where id_prodotto = ?1", nativeQuery = true)
	int qtaProdotto(Long id);

}
