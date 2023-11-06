package com.randstad.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.randstad.model.Prodotto;
import com.randstad.repository.ProdottoRepository;
import com.randstad.service.ProdottoService;

/**
 * Implementazione dei metodi necessari specificati in ProdottoService
 */
@Service
public class ProdottoServiceImpl implements ProdottoService {

	@Autowired
	ProdottoRepository pR;

	@Override
	public Prodotto saveProdotto(Prodotto prodotto) {

		return pR.save(prodotto);
	}

	@Override
	public List<Prodotto> getAll() {

		return pR.findAll();
	}

	@Override
	public Optional<Prodotto> findById(Long id) {

		return pR.findById(id);
	}

	@Override
	public List<Prodotto> getProdottiDisponibili() {
		return pR.getProdottiDisponibili();
	}

	@Override
	public void modificaQta(Long id, int qta) {
		pR.modificaQta(id, qtaProdotto(id)+qta);
	}

	@Override
	public void deleteProdotto(Prodotto prodotto) {
		pR.delete(prodotto);

	}

	@Override
	public int qtaProdotto(Long id) {
		return pR.qtaProdotto(id);
	}
}
