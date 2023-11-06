package com.randstad.service;

import java.util.List;
import java.util.Optional;

import com.randstad.model.Prodotto;

/**
 * Interfaccia ProdottoService che contiene tutti i metodi da dover implementare in ServiceImpl
 */
public interface ProdottoService {
	Prodotto saveProdotto(Prodotto prodotto);
	List<Prodotto> getAll();
	Optional<Prodotto> findById(Long id);
	List<Prodotto> getProdottiDisponibili();
	void modificaQta(Long id, int qta);
	void deleteProdotto(Prodotto prodotto);
	int qtaProdotto(Long id);
}
