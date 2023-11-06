package com.ranstad.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.randstad.model.Ordine;
import com.randstad.repository.OrdineRepository;
import com.randstad.service.OrdineService;

@Service
public class OrdineServiceImpl implements OrdineService {
	
	@Autowired
	OrdineRepository oR;

	@Override
	public Ordine saveOrdine(Ordine ordine) {
		return oR.save(ordine);
		
	}

	@Override
	public List<Ordine> getAll() {
		return oR.findAll();
	}

	@Override
	public List<Ordine> findByUtente(Long id) {
		return oR.findByUtente(id);
	}

	@Override
	public Optional<Ordine> findById(Long id) {
		return oR.findById(id);
	}

	@Override
	public void deleteOrdine(Ordine ordine) {
		oR.delete(ordine);
		
	}
}
