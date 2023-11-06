package com.randstad.service;

import java.util.List;

import com.randstad.model.OrdineProdotto;

/**
 * Interfaccia OrdineProdottoService che contiene tutti i metodi da dover implementare in ServiceImpl
 */
public interface OrdineProdottoService {
	OrdineProdotto saveOrdineProdotto(OrdineProdotto op);
	List<OrdineProdotto> getAll();
	List<String[]> getOrdineProdotto(Long id);
}
