package com.randstad.service;

import java.util.List;
import java.util.Optional;

import com.randstad.model.Ordine;

/**
 * Interfaccia OrdineService che contiene tutti i metodi da dover implementare in ServiceImpl
 */
public interface OrdineService {
	
	Ordine saveOrdine(Ordine ordine);
	List<Ordine> getAll();
	List<Ordine> findByUtente(Long id);
	Optional<Ordine> findById(Long id);
	void deleteOrdine(Ordine ordine);
	
}
