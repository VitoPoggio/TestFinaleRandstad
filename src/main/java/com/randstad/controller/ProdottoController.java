package com.randstad.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.randstad.model.Prodotto;
import com.randstad.service.ProdottoService;

/**
 * Rest controller del Prodotto
 */

@RestController
@RequestMapping("/prodotto")
public class ProdottoController {
	
	@Autowired
	ProdottoService pS;
	
	@GetMapping
	List<Prodotto> getAll(){
		return pS.getAll();
	}
	
	@GetMapping("/disp")
	List<Prodotto> getDisponibili(){
		return pS.getProdottiDisponibili();
	}
	
	@GetMapping("/{id}")
	Optional<Prodotto> getById(@PathVariable Long id){
		return pS.findById(id);
	}
	
	@PostMapping
	Prodotto saveProdotto(@RequestBody Prodotto p) {
		return pS.saveProdotto(p);
	}
	
	@PutMapping("/{id}")
	Optional<Prodotto> modificaQuantità(@PathVariable Long id, @RequestBody int qta) {
		pS.modificaQta(id, qta);
		return pS.findById(id);
	}
	
	@DeleteMapping("/{id}")
	void deleteProdotto(@PathVariable Long id) {
		pS.deleteProdotto(pS.findById(id).get());
	}
}
