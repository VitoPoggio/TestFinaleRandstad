package com.randstad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.randstad.model.OrdineProdotto;

/**
 * Repository di OrdineProdotto con principali operazioni CRUD (gestite da JpaRepository) e altre query personalizzate
 */
public interface OrdineProdottoRepository extends JpaRepository<OrdineProdotto, Long> {

	@Query(value = "select marca, modello, prezzo, qta from prodotto, ordine_prodotto where prodotto.id_prodotto = ordine_prodotto.id_prodotto and id_ordine = ?1",
			nativeQuery = true)
	List<String[]> getOrdineArticoli(Long id);
}
