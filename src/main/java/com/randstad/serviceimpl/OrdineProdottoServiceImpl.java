package com.randstad.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.randstad.model.OrdineProdotto;
import com.randstad.repository.OrdineProdottoRepository;
import com.randstad.service.OrdineProdottoService;

/**
 * Implementazione dei metodi necessari specificati in OrdineProdottoService
 */
public class OrdineProdottoServiceImpl implements OrdineProdottoService {

	@Autowired
	OrdineProdottoRepository opR;

	@Override
	public OrdineProdotto saveOrdineProdotto(OrdineProdotto op) {
		return opR.save(op);
		
	}

	@Override
	public List<OrdineProdotto> getAll() {
		return opR.findAll();
	}

	@Override
	public List<String[]> getOrdineProdotto(Long id) {
		return opR.getOrdineArticoli(id);
	}
}
